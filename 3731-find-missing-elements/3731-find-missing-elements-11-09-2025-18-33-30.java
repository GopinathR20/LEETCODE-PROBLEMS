class Solution {
    public List<Integer> findMissingElements(int[] nums) {
     ArrayList<Integer> a=new ArrayList<>();
     int min=nums[0];
     int max=nums[0];
     boolean s[]=new boolean[101];
     for(int i:nums){
        max=Math.max(max,i);min=Math.min(min,i);
        s[i]=true;
     }   
     for(int i=min;i<=max;i++){
        if(!s[i])a.add(i);
     }
     return a;
    }
}