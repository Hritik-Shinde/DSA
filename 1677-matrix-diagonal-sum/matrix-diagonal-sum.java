class Solution {
    public int diagonalSum(int[][] mat) {
        int sum =0;
        for(int row =0;row<mat.length;row++){
                sum += mat[row][row];
            
        }

        int col = mat.length-1;
        for(int row=0;row<mat.length;row++){
            sum += mat[row][col];
            col--;
        }

        return (mat.length%2)!=0 ? sum - mat[mat.length/2][mat.length/2] :  sum;

        
    }
}