public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {

        if(strs.length == 1) return strs[0];

        int min = 99999;
        for (String s :strs) {
            if(min > s.length()) min = s.length();
        }

        StringBuilder res = new StringBuilder();
        for (int i = 0; i < min; i++) {
            if(isCommonChar(i,strs)) res.append(strs[0].charAt(i));
            else return res.toString();
        }
        return res.toString();
    }

    public static boolean isCommonChar(int i, String[] strs) {
        for (String str : strs) {
            for (String s : strs) {
                if (str.charAt(i) != s.charAt(i)) return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String[] strs1 = {"flower","flow","flight"};
        String[] strs2 = {"a","ab"};
        String[] strs3 = {"d"};
        String[] strs4 = {"cir","car"};
        System.out.println(longestCommonPrefix(strs1));
        System.out.println(longestCommonPrefix(strs2));
        System.out.println(longestCommonPrefix(strs3));
        System.out.println(longestCommonPrefix(strs4));
    }
}
