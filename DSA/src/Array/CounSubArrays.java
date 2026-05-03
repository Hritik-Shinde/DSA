package Array;

public class CounSubArrays {

    public int subArraycount(int[] arr,int k){
        int count = 0;

        for(int i=0;i<arr.length;i++){
            int sum = 0;
            for(int j=i;j<arr.length;j++){
                sum = sum +arr[j];

                if(sum==k){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        CounSubArrays counSubArrays = new CounSubArrays();
        System.out.print(counSubArrays.subArraycount(new int[]{10, 2, -2, -20, 10},-10));
    }
}
