public class palindrome {
    public static boolean isPalindrome(int x) {
        String temp = Integer.toString(x);
        StringBuilder res = new StringBuilder();
        for (int i = temp.length() - 1; i >= 0; i--) {
            res.append(temp.charAt(i));
        }
        return res.toString().equals(temp);
    }

    public static void main(String[] args) {
        int x = 100;
        int y = 121;
        int z = -121;

        System.out.println(isPalindrome(x));

        System.out.println(isPalindrome(y));

        System.out.println(isPalindrome(z));

    }
}
