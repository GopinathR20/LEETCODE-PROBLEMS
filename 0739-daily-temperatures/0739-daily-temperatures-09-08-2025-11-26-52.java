class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> a=new Stack<>();
        int res[]=new int[temperatures.length];
        for(int i=0;i<temperatures.length;i++){
            while(!a.isEmpty()&&temperatures[i]>temperatures[a.peek()]){
                int c=a.pop();
                res[c]=i-c;
            }
            a.push(i);
        }
        return res;
    }
}