class Solution {
    public int findKthLargest(int[] nums, int k) {
        Queue<Integer> ans=new PriorityQueue<>((a,b)->b-a);
        for(int i:nums){
            ans.offer(i);
        }
        for(int i=0;i<k-1;i++){
         ans.poll();
        }
        return ans.poll();
    }
}