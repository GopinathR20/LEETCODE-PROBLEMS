class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> a=new HashSet<>();
        Set<Integer> b=new HashSet<>();
        for(int i:nums1)a.add(i);
        for(int j:nums2)b.add(j);
        List<Integer> c=new ArrayList<>(a);
        c.removeAll(b);
        List<Integer> d=new ArrayList<>(b);
        d.removeAll(a);
        return Arrays.asList(c,d);
    }
}