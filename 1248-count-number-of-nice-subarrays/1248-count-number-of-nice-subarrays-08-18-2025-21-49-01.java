class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return gcc(nums,k)-gcc(nums,k-1);
    }
    public int gcc(int []nums,int k){
        int l=0,r=0,c=0;int o=0;
        for(r=0;r<nums.length;r++){
            if(nums[r]%2==1)o++;
            while(o>k){
                if(nums[l]%2==1)o--;
                l++;
            }
            c+=(r-l+1);
        }
        return c;
    }
}