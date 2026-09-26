class Solution {
    public int diagonalSum(int[][] mat) {
        int primaryDiagonalSum =0;
        for(int row =0;row<mat.length;row++){
                primaryDiagonalSum += mat[row][row];
            
        }

        int secondaryDiagonal =0;
        int col = mat.length-1;
        for(int row=0;row<mat.length;row++){
            secondaryDiagonal += mat[row][col];
            col--;
        }

        return (mat.length%2)!=0 ? primaryDiagonalSum+secondaryDiagonal - mat[mat.length/2][mat.length/2] :  primaryDiagonalSum+secondaryDiagonal;

        
    }
}