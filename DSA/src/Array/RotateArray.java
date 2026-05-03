package Array;

import java.lang.reflect.Array;
import java.util.Arrays;
//right rotate
public class RotateArray  {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k %= n;
        rotate(nums, 0, n - 1);
        rotate(nums, 0, k - 1);
        rotate(nums, k, n - 1);


        // brute force left rotate
//        int l = nums.length;
//        for(int i = 0; i < k; i++){
//            int temp = nums[0];
//            for(int j = 0; j < l-1; j++){
//                nums[j] = nums[j+1];
//            }
//            nums[l-1] = temp;
//        }

    }

    public static void rotate(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5,6,7,8};
       RotateArray rotateArray = new RotateArray();
       rotateArray.rotate(arr,3);
       System.out.print(Arrays.toString(arr));
    }



}

