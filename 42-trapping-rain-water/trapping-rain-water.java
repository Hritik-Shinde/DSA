class Solution {
    public int trap(int[] height) {
        // int res = 0;
        // int n = height.length;
        // for(int i=0;i<n;i++){
        //     int left = height[i];
        //     for(int j =0;j<i;j++){
        //         left = Math.max(height[j],left);
        //     }
        //     int right = height[i];
        //     for(int j = i+1;j<n;j++){
        //         right = Math.max(height[j],right);
        //     }

        //     res += Math.min(left,right)- height[i]; 
        // }

        // return res; (this will give tle)

        int[] left = new int[height.length];
        int[] right = new int[height.length];

        int result = 0;

        left[0] = height[0];
        for(int i =1;i<height.length;i++){
            left[i] = Math.max(left[i-1],height[i]);
        }

        right[height.length -1] = height[height.length-1];
        for(int j = height.length -2 ; j>=0;j--){
            right[j] = Math.max(right[j+1],height[j]);
        }


        for(int i =0;i<height.length;i++){
            result += Math.min(left[i],right[i]) - height[i];
        }

        return result;
    }
}