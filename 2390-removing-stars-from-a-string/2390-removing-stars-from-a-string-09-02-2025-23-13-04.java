class Solution {
    public String removeStars(String s) {
        Stack<Character> a=new Stack<>();
        
        for(char c:s.toCharArray()){
            if(c=='*')a.pop();
            else a.push(c);
        }
        StringBuilder sc=new StringBuilder();
        for(char i:a){
            sc.append(i);
        }
        return sc.toString();
    }
}