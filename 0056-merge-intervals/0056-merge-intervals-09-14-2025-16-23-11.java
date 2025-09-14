class Solution {
    public int[][] merge(int[][] intervals) {
        int n=intervals.length;
        for(int i=0;i<n-1;i++){
            int min=i;
            for(int j=i+1;j<n;j++){
                if(intervals[j][0]<intervals[min][0]){
                    min=j;
                }
            }
            int t[]=intervals[i];
            intervals[i]=intervals[min];
            intervals[min]=t;
        }
        List<int[]> a=new ArrayList<>();
        int current[]=intervals[0];
        for(int i=1;i<n;i++){
            if(intervals[i][0]<=current[1]){
                current[1]=Math.max(current[1],intervals[i][1]);
            }
            else{
                a.add(current);
                current=intervals[i];
            }
        }
        a.add(current);
        return a.toArray(new int[a.size()][]);
    }
}