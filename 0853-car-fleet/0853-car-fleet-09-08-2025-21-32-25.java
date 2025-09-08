class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n=position.length;
        double[][] a=new double[n][2];
        for(int i=0;i<n;i++){
            a[i][0]=position[i];
            a[i][1]=(double)(target-position[i])/speed[i];
        }
        Arrays.sort(a,(c,d)->Double.compare(d[0],c[0]));
        double cu=0;int f=0;
        for(int i=0;i<n;i++){
            double t=a[i][1];
            if(t>cu){
                f++;
                cu=t;
            }
        }
        return f;
    }
}