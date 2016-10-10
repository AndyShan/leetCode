package _378;

import java.util.PriorityQueue;

public class Solution {
    public int kthSmallest(int[][] matrix, int k)
	{
		int m=matrix.length;
		if(m==0)
			return 0;
		
		int n=matrix[0].length;
		int cnt=0;
		boolean[][] used=new boolean[m][n];
		PriorityQueue<kthsNode> heap=new PriorityQueue<>();
		heap.add(new kthsNode(0, 0, matrix[0][0]));
		used[0][0]=true;
		kthsNode node=null;
		int[] xoff={0,1};
		int[] yoff={1,0};
		while(cnt<k)
		{
			node=heap.poll();
			int x=node.x;
			int y=node.y;
			for(int i=0;i<2;i++)
			{
				int xx=x+xoff[i];
				int yy=y+yoff[i];
				if(xx>=0&&xx<m&&yy>=0&&yy<n&&!used[xx][yy])
				{
					used[xx][yy]=true;
					heap.add(new kthsNode(xx, yy, matrix[xx][yy]));
				}
			}
			cnt++;
		}
		
		return node.val;
	}
}


class kthsNode implements Comparable<kthsNode>
{
	int x,y;
	int val;
	public kthsNode(int x,int y,int val)
	{
		this.x=x;
		this.y=y;
		this.val=val;
		// TODO Auto-generated constructor stub
	}
	@Override
	public int compareTo(kthsNode o)
	{
		// TODO Auto-generated method stub
		return val-o.val;
	}
}
