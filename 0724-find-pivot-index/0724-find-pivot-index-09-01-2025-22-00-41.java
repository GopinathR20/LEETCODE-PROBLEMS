class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
       int t=0;
        for(int i=0;i<n;i++)
        t+=nums[i];
        int l=0;
        int r[]=new int[n];
        for(int i=0;i<n;i++){
            r[i]=t-l-nums[i];
            if(l==r[i])return i;
            l+=nums[i];
        }
        return -1;
    }
}