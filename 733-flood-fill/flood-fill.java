class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int orignalColor = image[sr][sc];

        if(orignalColor == color){
            return image;
        }

        dfs(image,sr,sc,orignalColor,color);
        return image;
    }

    private void dfs(int[][] image, int row, int col,int orignalColor ,int color){
        if( row <0 || col<0|| row >= image.length ||col>= image[0].length||image[row][col] != orignalColor){
            return;
        }
        image[row][col] = color;
        dfs(image,row-1,col,orignalColor,color);
        dfs(image,row+1,col,orignalColor,color);
        dfs(image,row,col-1,orignalColor,color);
        dfs(image,row,col+1,orignalColor,color);
    }
}