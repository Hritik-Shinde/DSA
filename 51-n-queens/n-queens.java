class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();
        char[][] board = new char[n][n];
        for(int i =0;i<n;i++){
            Arrays.fill(board[i],'.');
        }
        placeQueens(result,board,n,0);
        return result;
    }

    private void placeQueens(List<List<String>> result , char[][] board,int n, int row){
        if(row == n){
            List<String> soultion = new ArrayList<>();
            for(char[] currentRow: board){
                soultion.add(new String(currentRow));
            }
            result.add(soultion);
            return;
        }
        for(int col = 0;col<n;col++){
        if(isSafe(result,board,n,row,col)){
            board[row][col] = 'Q';
            placeQueens(result,board,n,row+1);
            board[row][col] = '.';
        }
        }
    }

    private boolean isSafe(List<List<String>> result , char[][] temp,int n, int row,int col){
        for(int i =row-1;i>=0;i--){
            if(temp[i][col] == 'Q')
            {
                return false;
            }
        }

        for(int i =row-1,j=col-1;i>=0 && j>=0;i--,j--){
            if(temp[i][j] == 'Q')
            {
                return false;
            }
        }

        for(int i=row-1,j = col+1;i>=0&&j<n ;i--,j++){
            if(temp[i][j] == 'Q')
            {
                return false;
            }
        }
         

        return true;
    }
}