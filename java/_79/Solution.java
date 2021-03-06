package _79;

public class Solution {
    boolean[][] b;
    public boolean exist(char[][] board, String word) {
        if(word.length() == 0){
            return true;
        }

        for(int i = 0; i < board.length;i++){
            for(int j = 0; j < board[0].length; j++){
                if(board[i][j] == word.charAt(0)){
                    b = new boolean[board.length][board[0].length];
                    if(search(board,i,j,b,0,word)){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    
    //根据首字母的i,j位置查找word
    private boolean search(char[][] board,int i,int j,boolean[][] b,int index,String word){

        if(board[i][j] != word.charAt(index)){//字符不相等。返回false
            return false;
        }
        if(index == word.length() - 1){//如果到达最后一个，返回true
        	return true;
        }
        
        b[i][j] = true;//标记已使用
        
        if(i > 0 && !b[i-1][j] && search(board,i-1,j,b,index+1,word)){//如果i>0，且i-1的值没有被使用，搜索
            return true;
        }
        
        if(i < board.length-1 && !b[i+1][j] && search(board,i+1,j,b,index+1,word)){//如果没有边界，且i+1的值没有被使用，搜索
            return true;
        }
        
        if(j > 0 && !b[i][j-1] && search(board,i,j-1,b,index+1,word)){//如果j>0，且j-1的值没有被使用，搜索
            return true;
        }
        
        if(j < board[0].length-1 && !b[i][j+1] && search(board,i,j+1,b,index+1,word)){//如果没到边界，且j+1的值没有被使用，搜索
            return true;
        }
        b[i][j] = false;
        return false;
    }
    
}