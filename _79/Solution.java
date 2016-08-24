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
    
    
    //��������ĸ��i,jλ�ò���word
    private boolean search(char[][] board,int i,int j,boolean[][] b,int index,String word){

        if(board[i][j] != word.charAt(index)){//�ַ�����ȡ�����false
            return false;
        }
        if(index == word.length() - 1){//����������һ��������true
        	return true;
        }
        
        b[i][j] = true;//�����ʹ��
        
        if(i > 0 && !b[i-1][j] && search(board,i-1,j,b,index+1,word)){//���i>0����i-1��ֵû�б�ʹ�ã�����
            return true;
        }
        
        if(i < board.length-1 && !b[i+1][j] && search(board,i+1,j,b,index+1,word)){//���û�б߽磬��i+1��ֵû�б�ʹ�ã�����
            return true;
        }
        
        if(j > 0 && !b[i][j-1] && search(board,i,j-1,b,index+1,word)){//���j>0����j-1��ֵû�б�ʹ�ã�����
            return true;
        }
        
        if(j < board[0].length-1 && !b[i][j+1] && search(board,i,j+1,b,index+1,word)){//���û���߽磬��j+1��ֵû�б�ʹ�ã�����
            return true;
        }
        b[i][j] = false;
        return false;
    }
    
}