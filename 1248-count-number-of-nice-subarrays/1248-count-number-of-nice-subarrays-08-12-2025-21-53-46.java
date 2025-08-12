class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        HashMap<Integer,Integer> a=new HashMap<>();
        a.put(0,1);
        int c=0,cs=0;
        for(int n:nums){
            //int cs=0;
            if(n%2!=0){
                cs+=1;
            }
            int os=cs-k;
            c+=a.getOrDefault(os,0);
            a.put(cs,a.getOrDefault(cs,0)+1);
        }
        return c;
    }
}