class Solution {
    public boolean isAnagram(String s, String t) {
        int sLen = s.length();
        int tLen = t.length();

        if (sLen != tLen) return false;

        int freq[] = new int[26];

        for (int i = 0; i < sLen; i++) freq[s.charAt(i) - 'a']++;

        for (int i = 0; i < tLen; i++) {
            if (freq[t.charAt(i) - 'a'] > 0) freq[t.charAt(i) - 'a']--;
            else return false;
        }

        return true;
    }
}