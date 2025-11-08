class Solution {
    public int sumOfUnique(int[] nums) {
     HashMap<Integer,Integer> ans=new HashMap<>();int s=0;
     for(int i=0;i<nums.length;i++){
        ans.put(nums[i],ans.getOrDefault(nums[i],0)+1);
     }   
     for(Map.Entry<Integer,Integer> map:ans.entrySet()){
        if(map.getValue()==1)s+=map.getKey();
     }
     return s;
    }
}