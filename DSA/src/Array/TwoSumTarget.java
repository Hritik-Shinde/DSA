package Array;

import java.util.ArrayList;
import java.util.Arrays;

public class TwoSumTarget {

    public int[] getSum(int[] arr,int target)
    {
        int [] result = new int[2];
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j] == target){
                    result[0]=arr[i];
                    result[1]=arr[j];
                    return result;
                }
            }
        }
    return new int[]{-1,-1};
    }


    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        TwoSumTarget twoSumTarget = new TwoSumTarget();
        System.out.println(Arrays.toString(twoSumTarget.getSum(arr,7)));

    }
}

