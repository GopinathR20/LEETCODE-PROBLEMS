class Solution {
    public int numberOfSubstrings(String s) {
        int l=0,res=0;
        char c[]=new char[3];
        for(int r=0;r<s.length();r++){
            c[s.charAt(r)-'a']++;
            while(c[0]>0&&c[1]>0&&c[2]>0){
                c[s.charAt(l)-'a']--;
                res+=(s.length()-r);
                l++;
            }
        }
        return res;
    }
}