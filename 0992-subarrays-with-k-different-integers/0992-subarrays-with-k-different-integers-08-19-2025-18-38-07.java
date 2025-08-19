class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
    return ans(nums,k)-ans(nums,k-1);
    }
       
    public int ans(int nums[],int k){
        HashMap<Integer,Integer> ans=new HashMap<>();
      //  ans.put(0,0);
        int l=0,count=0;
        for(int r=0;r<nums.length;r++){
            ans.put(nums[r],ans.getOrDefault(nums[r],0)+1);
            if(ans.get(nums[r])==1)k--;
            while(k<0){
                ans.put(nums[l],ans.get(nums[l])-1);
                if(ans.get(nums[l])==0)k++;
                l++;
            }
            count+=(r-l+1);

        }
        return count;
    }
}