package Arrays.LongestCommonPrefix;

/**
 * LongestCommonPrefix
 */
public class LongestCommonPrefix {

    public static void main(String[] args) {
        String[] strs = {

                "flower", "flow", "flight"
        };
        System.out.println(longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {
        String ans = strs[0];
        for (int i = 1; i < strs.length; i++) {
            String temp = "";
            for (int j = 0; j < ans.length(); j++) {
                if (j < strs[i].length() && strs[i].charAt(j) == ans.charAt(j))
                    temp += ans.charAt(j);
            }
            ans = temp;
        }
        return ans;
    }
}