class Solution {
    public void rotate(int[][] matrix) {
        // taranspose
        for(int row = 0;row<matrix.length;row++){
            for(int col = row+1;col<matrix.length;col++){
                int temp = matrix[row][col];
                matrix[row][col] = matrix[col][row];
                matrix[col][row] = temp;
            }
        }
        //reverse row
        for(int row =0;row<matrix.length;row++){
            int left = 0,right = matrix.length-1;
            while(left<right){
                int temp = matrix[row][left];
                matrix[row][left]= matrix[row][right];
                matrix[row][right] = temp;
                left ++;
                right--;
            }
        }
    }
}