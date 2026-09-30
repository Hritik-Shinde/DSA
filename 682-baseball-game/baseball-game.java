class Solution {
    public int calPoints(String[] operations) {
       Deque<Integer> s = new ArrayDeque<>();
        for (String op : operations) {
            switch (op) {
            case "C":
                s.pop();
                break;
            
            case "D":
                s.push(s.peek() * 2);
                break;
            
            case "+":
                int a = s.pop();
                int b = s.peek();
                s.push(a);
                s.push(a + b);
                break;
            
            default:
                s.push(Integer.parseInt(op));
            
            }
        }
        int sum = 0;
        for (int x : s) {
            sum += x;
        }
        return sum;
     
    }
}