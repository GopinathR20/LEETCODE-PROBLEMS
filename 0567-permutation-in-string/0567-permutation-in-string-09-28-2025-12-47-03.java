class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int l=0,r=0;
        HashMap<Character,Integer> a=new HashMap<>();
        HashMap<Character,Integer> b=new HashMap<>();
        for(int i=0;i<s1.length();i++){
            char c=s1.charAt(i);
            if(!a.containsKey(c))a.put(c,0);
            a.put(c,a.getOrDefault(c,0)+1);
        }
        while(r<s2.length()){
            char d=s2.charAt(r);
            if(!a.containsKey(d)){
                r++;
                l=r;
                b.clear();
                continue;
            }
            if(!b.containsKey(d))b.put(d,0);
            b.put(d,b.getOrDefault(d,0)+1);
            while(b.getOrDefault(d,0)>a.getOrDefault(d,0)){
                char s=s2.charAt(l);
                b.put(s,b.getOrDefault(s,0)-1);
                l++;
            }
            int win=r-l+1;
            if(win==s1.length())return true;
            r++;
        }
        return false;
    }
}