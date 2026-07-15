class Solution {
    private int start, maxPalindrome;
    public String longestPalindrome(String s) {
        int len = s.length();
        if (len < 2) 
            return s;
        for (int i = 0; i < len - 1; i++) {
            expandAroundCentre(s, i, i);
            expandAroundCentre(s, i, i+1);
        }
        return s.substring(start, start + maxPalindrome);
    }
    private void expandAroundCentre(String s, int y, int x) {
        while (y >= 0 && x < s.length() && s.charAt(y) == s.charAt(x)) {
            y--;
            x++;
        }
        if (maxPalindrome < x - y - 1) {
            start = y + 1;
            maxPalindrome = x - y -1;

        }
    }
    
}