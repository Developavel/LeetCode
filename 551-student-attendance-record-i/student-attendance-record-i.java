class Solution {
    public boolean checkRecord(String s) {
        int absentCount = 0;
        int lateStreak = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == 'A') {
                absentCount++;
                lateStreak = 0;
            }

            else if (c == 'L') {
                lateStreak++;
            }
            else {
                lateStreak = 0;
            }

            if (absentCount >= 2 || lateStreak >= 3) {
                return false;
            }
        }

        return true;
    }
}