class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n = strs.length;
        if (n == 0) return "";
        if (n == 1) return strs[0];

        String ans = strs[0];

        for(int i = 1; i < n; i++){
            if (strs[i].equals("")) return "";
            int j = 0;
            for(; (j < ans.length()) && (j < strs[i].length()); j++){
                if(strs[i].charAt(j) != ans.charAt(j)) break;
            }
            ans = ans.substring(0, j);
        }
        return ans;
    }
}