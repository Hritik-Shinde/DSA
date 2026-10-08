class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> res = new Stack();

        for(String ch: tokens){
            if(!ch.equals("+") && !ch.equals("-") && !ch.equals("*") && !ch.equals("/")){
                res.push(Integer.parseInt(ch));
            }
            else{
                int first = res.pop();
                int second = res.pop();

                switch(ch){
                    case "+":
                        res.push(second+first);
                        break;
                    case "-":
                        res.push(second-first);
                        break;
                    case "*":
                        res.push(second*first);
                        break;
                    case "/":
                        res.push(second/first);
                        break;
                }
            }
        }
        return res.peek();
    }
}