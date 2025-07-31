class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> a=new HashMap<>();
        Stack<Integer> s=new Stack<>();
        for(int n:nums2){
            while(!s.isEmpty()&&s.peek()<n){
                a.put(s.pop(),n);
            }
            s.push(n);
        }
        int ans[]=new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            ans[i]=a.getOrDefault(nums1[i],-1);
        }
        return ans;
    }
}