class Solution {
    public void setZeroes(int[][] matrix) {
        // boolean[] zeroRows = new boolean[matrix.length];
        // boolean[] zeroCols = new boolean[matrix[0].length];

        // for(int row =0;row<matrix.length;row++){
        //     for(int col = 0;col<matrix[0].length;col++){
        //         if(matrix[row][col] == 0){
        //             zeroRows[row] = true;
        //             zeroCols[col] = true;
        //         }
        //     }
        // }

        // for(int row =0;row<matrix.length;row++){
        //     for(int col =0;col<matrix[0].length;col++){
        //         if(zeroRows[row]||zeroCols[col])
        //             matrix[row][col] = 0;
        //     }
        // }
        boolean firstRowZero = false;
        boolean firstColZero = false;
        for (int row = 0; row < matrix.length; row++) {
            if (matrix[row][0] == 0) {
                firstColZero = true;
            }
        }
        for (int col = 0; col < matrix[0].length; col++) {
            if (matrix[0][col] == 0) {
                firstRowZero = true;
            }
        }

        for (int row = 1; row < matrix.length; row++) {
            for (int col = 1; col < matrix[0].length; col++) {
                if (matrix[row][col] == 0) {
                    matrix[row][0] = 0;
                    matrix[0][col] = 0;
                }
            }
        }

        for (int row = 1; row < matrix.length; row++) {
            for (int col = 1; col < matrix[0].length; col++) {
                if (matrix[row][0] == 0 || matrix[0][col] == 0) {
                    matrix[row][col] = 0;
                }
            }
        }
        if (firstRowZero) {
            for (int col = 0; col < matrix[0].length; col++) {
                matrix[0][col] = 0;
            }
        }

        if (firstColZero) {
            for (int row = 0; row < matrix.length; row++) {
                matrix[row][0] = 0;
            }
        }
    }
}