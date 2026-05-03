package Array;

import java.util.Arrays;

public class ProductSum {

    static public int[] product(int[] arr){
        int[] result = new int[arr.length];
        Arrays.fill(result,1);
        for(int i =0;i<arr.length;i++){
            for(int j =0;j<arr.length;j++){
                if(i != j){
                    result[i] *= arr[j];
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {10, 3, 5, 6, 2};
        System.out.print(Arrays.toString(product(arr)));
    }
}
