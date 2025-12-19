class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> ans=new Stack<>();
        for(char c:s.toCharArray()){
            if(!ans.isEmpty()&&ans.peek()==c){
                ans.pop();
            }
            else ans.push(c);
        }
        StringBuilder a=new StringBuilder();
        for(char i:ans){
            a.append(i);
        }
        return new String(a);
    }
}