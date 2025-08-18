class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        HashMap<Integer,Integer> a=new HashMap<>();
        a.put(0,1);
        int cs=0,c=0;
        for(int n:nums){
            cs+=n;
            int old=cs-goal;
            c+=a.getOrDefault(old,0);
            a.put(cs,a.getOrDefault(cs,0)+1);
        }
        return c;
    }
}