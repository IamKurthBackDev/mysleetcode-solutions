class Solution {
    public int lengthOfLongestSubstring(String s) {

        HashSet<Character> set = new HashSet<>();
       
        int start = 0;
        int maxLen = 0;

        for (int last = 0; last < s.length(); last++) {
            while (set.contains(s.charAt(last))) {
                set.remove(s.charAt(start));
                start ++;
                
            }      

        set.add(s.charAt(last));
        maxLen = Math.max(maxLen, last - start + 1);

        }
        return maxLen;
    }
}