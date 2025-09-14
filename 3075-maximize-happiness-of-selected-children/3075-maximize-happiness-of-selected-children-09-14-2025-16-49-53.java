class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        int n=happiness.length;
        // for(int i=0;i<n-1;i++){
        //     for(int j=0;j<n-i-1;j++){
        //         if(happiness[j]<happiness[j+1]){
        //             int t=happiness[j];
        //             happiness[j]=happiness[j+1];
        //             happiness[j+1]=t;
        //         }
        //     }
        // }
        Integer[] arr=Arrays.stream(happiness).boxed().toArray(Integer[]::new);
        Arrays.sort(arr,(a,b)->Integer.compare(b,a));
        long t=0;
        for(int i=0;i<k;i++){
            long v=arr[i]-i;
            if(v>0)t+=v;
            
        }
        return t;
    }
}