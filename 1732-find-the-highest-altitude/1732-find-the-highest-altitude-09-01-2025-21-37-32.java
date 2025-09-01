class Solution {
    public int largestAltitude(int[] gain) {
        int n=gain.length;
        int pref[]=new int[n+1];
        pref[0]=0;int s=0;
        for(int i=1;i<n+1;i++){
            pref[i]=pref[i-1]+gain[i-1];
            s=Math.max(pref[i],s);
        }
        return s;
    }
}