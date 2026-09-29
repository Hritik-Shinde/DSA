class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // brute force
        // for(int row =0;row<matrix.length;row++){
        //     for(int col= 0;col<matrix[0].length;col++){
        //         if(matrix[row][col] == target){
        //             return true;
        //         }
        //     }
        // }

        // return false;

        int left = 0,right = (matrix.length *matrix[0].length) -1;
        while(left<= right){
            int mid = left +(right-left)/2;
            int row = mid/matrix[0].length;
            int col = mid % matrix[0].length;

            if(matrix[row][col] == target){
                return true;
            }
            else if(matrix[row][col]> target){
                right = mid-1;
            }else{
                left = mid+1;
            }
        }
        return false;
    }
}