class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st=new Stack<>();
        for(int i:asteroids){
            boolean des=false;
            while(!st.isEmpty()&&i<0&&st.peek()>0){
                int t=st.peek();
                if(Math.abs(i)>t)
                {
                st.pop();
                continue;
                }
                else if(Math.abs(i)==t)st.pop();
                des=true;
                break;
            }
            if(!des)st.push(i);
        }
        int arr[]=new int[st.size()];
        for(int i=st.size()-1;i>=0;i--){
            arr[i]=st.pop();
        }
        return arr;
    }
}