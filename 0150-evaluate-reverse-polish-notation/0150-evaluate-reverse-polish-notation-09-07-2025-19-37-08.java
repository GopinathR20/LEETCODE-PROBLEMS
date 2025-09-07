class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> a=new Stack<>();
        int t=0;
        for(String i:tokens){
            if(i.equals("+")){
                a.push(a.pop()+a.pop());
            }
            else if(i.equals("-")){
                int aa=a.pop();
                int b=a.pop();
                a.push(b-aa);
            }
            else if(i.equals("*")){
                a.push(a.pop()*a.pop());
            }
            else if(i.equals("/")){
                int aa=a.pop();
                int b=a.pop();
                a.push(b/aa);
            }
            else {
                a.push(Integer.parseInt(i));
            }
        }
        return a.peek();
    }
}