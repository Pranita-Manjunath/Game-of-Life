class Solution {
    
    
    public void gameOfLife(int[][] board) {
        int[][] mat=new int[board.length][board[0].length];
        
        for(int i=0;i<board.length;i++) {
            for(int j=0;j<board[0].length;j++) {
                int count=0;
                
                if(isSafe(board,i-1,j-1)) { 
                    count++;
                }
                if(isSafe(board,i-1,j)) { 
                    count++;
                }
                if(isSafe(board,i-1,j+1)) { 
                    count++;
                }
                
                if(isSafe(board,i,j+1)) { 
                    count++;
                }
                if(isSafe(board,i,j-1)) { 
                    count++;
                }
                
                if(isSafe(board,i+1,j-1)) { 
                    count++;
                }
                if(isSafe(board,i+1,j)) {
                    count++;
                }
                if(isSafe(board,i+1,j+1)) { 
                    count++;
                }

                if(board[i][j] == 0) { 
                    if(count == 3) { 
                        mat[i][j] = 1;
                    }
                } else {
                    if(count == 2 || count == 3) { 
                        mat[i][j] = 1;
                    }
                }
            }
        }
        
        for(int i=0;i<board.length;i++) {
            for(int j=0;j<board[0].length;j++) {
                board[i][j] = mat[i][j];
            }
        }
    }
    
    public boolean isSafe(int[][] board,int i,int j) {
        if(i<0||i>=board.length||j<0||j>=board[0].length||board[i][j]==0)  {
            return false;
        }
        return true;
    }
}


