class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        while(n != 1){
            int tempSum = 0;
            while(n> 0){
                int lastdigit = n %10;
                tempSum += lastdigit * lastdigit;
                n  /= 10;
            }
            if(set.contains(tempSum)){
                return false;
            }
            set.add(tempSum);
            n = tempSum;
        }

        return true;
    }
}