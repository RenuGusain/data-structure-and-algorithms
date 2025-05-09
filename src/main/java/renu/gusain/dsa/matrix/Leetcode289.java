package renu.gusain.dsa.matrix;

import java.util.Arrays;

public class Leetcode289 {
    public void gameOfLife(int[][] board) {
        int[][] copy = new int[board.length][];
        for (int i = 0; i < board.length; i++) {
            copy[i] = board[i].clone(); // deep copy of each row
        }
        int m=board.length;
        int n=board[0].length;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                int liveNebrCount=getNeighbourLiveCelCount(i,j,copy);
                if(liveNebrCount<2)
                {
                    board[i][j]=0;
                }
                else if(liveNebrCount==3)
                {
                    board[i][j]=1;
                }
                else  if(liveNebrCount>3)
                {
                    board[i][j]=0;
                }
            }
        }



    }
    public int  getNeighbourLiveCelCount(int row,int colm,int[][] board)
    {
        int m=board.length;
        int n=board[0].length;
        int result=0;
        //left
        if(colm>0 && board[row][colm-1]==1)
        {
            result=result+1;
        }
        //right
        if(colm<n-1&&board[row][colm+1]==1)
        {
            result++;
        }
        //up
        if(row>0&&board[row-1][colm]==1)
        {
            result++;

        }
        //down
        if(row<m-1&&board[row+1][colm]==1)
        {
            result++;
        }
        //upper left diagonal
        if(row>0&&colm>0&&board[row-1][colm-1]==1)
        {
            result++;
        }
        //upper right
        if(row>0 &&colm<n-1&& board[row-1][colm+1]==1)
        {
            result++;
        }
        //down left
        if(row<n-1&&colm>0&&board[row+1][colm-1]==1)result++;
        if(row<n-1 &&colm<n-1&&board[row+1][colm+1]==1)result++;
 return result;
    }

}
