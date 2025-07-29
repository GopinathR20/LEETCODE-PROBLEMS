class Solution {
    public List<List<Integer>> subsets(int[] nums) {
       // Arrays.sort(nums);
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> sub=new ArrayList<>();
        recurs(0,nums,res,sub);
        return res;    
    }
    public void recurs(int i,int[] arr,List<List<Integer>> res,List<Integer> sub){
        res.add(new ArrayList<>(sub));
        for(int k=i;k<arr.length;k++){
        sub.add(arr[k]);
        recurs(k+1,arr,res,sub);
        sub.remove(sub.size()-1);
        }
        
    }
}