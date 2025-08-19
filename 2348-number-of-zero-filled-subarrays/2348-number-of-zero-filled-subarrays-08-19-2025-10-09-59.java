class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long c=0,result=0;
        for(int i:nums){
            if(i==0){
                c++;
                result+=c;
            }
            else{
                c=0;
            }
        }
        return result;
    }
}