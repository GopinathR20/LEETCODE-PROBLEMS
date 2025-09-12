class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
        int n=piles.length;
        int l=1,r=Arrays.stream(piles).max().getAsInt();int res=r;
        while(l<=r){
            int m=l+(r-l)/2;
            long ho=0;
            for(int i:piles){
                ho+=(i+m-1L)/m;
            }
            if(ho<=h){
                res=m;
                r=m-1;
            }
            else {
                l=m+1;
            }
        }
        return res;
    }
}