class Solution {
    public int characterReplacement(String s, int k) {
        int l=0,r=0;int max=0,maxf=0;
        int hash[]=new int[26];
        while(r<s.length()){
            hash[s.charAt(r)-'A']++;
            maxf=Math.max(maxf,hash[s.charAt(r)-'A']);
            while((r-l+1)-maxf>k){
                hash[s.charAt(l)-'A']--;
                l=l+1;
            }
            if((r-l+1)-maxf<=k){
                max=Math.max(max,r-l+1);
                r++;
            }
        }
        return max;
    }
}