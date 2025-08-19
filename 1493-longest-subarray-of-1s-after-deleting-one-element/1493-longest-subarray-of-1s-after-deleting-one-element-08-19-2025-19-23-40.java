class Solution {
    public int longestSubarray(int[] nums) {
        int l=0,cz=0;int m=0;
        for(int r=0;r<nums.length;r++){
            if(nums[r]==0)cz++;
            while(cz>1){
            if(nums[l]==0)cz--;
            l++;
            }
            m=Math.max(m,r-l+1);
        }
        return m-1;
    }
}