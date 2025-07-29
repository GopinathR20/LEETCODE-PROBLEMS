class Solution {
    public int minBitFlips(int start, int goal) {
        int d=start^goal;
        return Integer.bitCount(d);
    }
}