class Solution {
    public int findPermutationDifference(String s, String t) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            sum += abs(i - t.indexOf(s.charAt(i)));
        }
        return sum;
    }
    private final int abs (int num) {
        return num < 0 ? -num : num;
    }
}