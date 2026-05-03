package Array;

public class SecondLargest {

    public int secondLargest(int[] arr) {
        int max = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                secondLargest = max;
                max = arr[i];
            } else if (arr[i]>secondLargest && arr[i] != max){
                secondLargest = arr[i];
            }
        }
        return secondLargest == Integer.MIN_VALUE ? -1 : secondLargest;
    }

    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70,80,90,100};
        int[] arr2 = {10,10,10};
        SecondLargest s = new SecondLargest();
        System.out.println(s.secondLargest(arr));
        System.out.println(s.secondLargest(arr2));
    }
}
