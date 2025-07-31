class Solution {
    public boolean isValid(String s) {
        Stack<Character> a=new Stack<>();
        for(char c:s.toCharArray()){
            if(c=='('||c=='{'||c=='['){
                a.push(c);
            }
            else{
                if(a.isEmpty())return false;
            if((c==')'&&a.peek()=='(')||(c=='}'&&a.peek()=='{')||c==']'&&a.peek()=='[')    {
                a.pop();
            }
            else return false;
            }
        }
        return a.isEmpty();
    }
}