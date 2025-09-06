class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> an=new HashMap<>();
        for(int i:nums){
            an.put(i,an.getOrDefault(i,0)+1);
        }
        PriorityQueue<Map.Entry<Integer,Integer>> min=new PriorityQueue<>((a,b)->Integer.compare(a.getValue(),b.getValue()));
        for(Map.Entry<Integer,Integer> ent:an.entrySet()){
            min.offer(ent);
            if(min.size()>k){
                min.poll();
            }
        }
        List<Integer> top=new ArrayList<>();
        while(!min.isEmpty()){
            top.add(min.poll().getKey());
        }
        int[] r=new int[k];
        for(int i=0;i<k;i++){
            r[i]=top.get(k-i-1);
        }
        return r;
    }   
}