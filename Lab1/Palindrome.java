public class Palindrome {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            String s = args[i];
            if (isPalindrome(s)) {
                System.out.println(s + " является палиндромом");
            } else {
                System.out.println(s + " не является палиндромом");
            }
        }
    }
    public static String reverseString(String s) {
        String s2 = "";
        int len = s.length();

        for (int i = len - 1; i >= 0; i--) {
            s2 += s.charAt(i);
        }
        return s2;
    }

    public static boolean isPalindrome(String s) {
        String reversed = reverseString(s);
        return s.equals(reversed);
    }
}