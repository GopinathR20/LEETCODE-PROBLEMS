class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int t=0;
        int l=0;
        for(int r=0;r<cardPoints.length;r++){
            t+=cardPoints[r];
        }
        int window=cardPoints.length-k;
        int cursum=0;
        for(int i=0;i<window;i++){
            cursum+=cardPoints[i];
        }
        int fin=cursum;
        for(int i=window;i<cardPoints.length;i++){
            cursum+=cardPoints[i]-cardPoints[i-window];
            fin=Math.min(fin,cursum);
        }
        return t-fin;
    }
}