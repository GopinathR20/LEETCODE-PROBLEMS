import java.util.*;
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        Hashtable<Integer,Integer> a=new Hashtable<>();
        ArrayList<Integer> b=new ArrayList<>();
        for(int i:nums){
            a.put(i,a.getOrDefault(i,0)+1);
        }
        for(Map.Entry<Integer,Integer> i:a.entrySet()){
            if(i.getValue()>1){
                b.add(i.getKey());
            }
        }
        return (b.isEmpty())?new ArrayList<>():b;
    }
}