class Solution {
    fun checkRecord(s: String): Boolean {
        return s.count { it == 'A' } < 2 && "LLL" !in s
    }
}