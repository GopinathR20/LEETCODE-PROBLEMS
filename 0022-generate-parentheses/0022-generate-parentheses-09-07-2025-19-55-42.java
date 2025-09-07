class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> a=new ArrayList<>();
        back(a,"",0,0,n);
        return a;
    }
    public void back(List<String> a,String c,int o,int cc,int m){
        if(c.length()==m*2)
        {a.add(c);
        return;
        }
        if(o<m){
            back(a,c+"(",o+1,cc,m);
        }
        if(cc<o){
            back(a,c+")",o,cc+1,m);
        }
    }
}