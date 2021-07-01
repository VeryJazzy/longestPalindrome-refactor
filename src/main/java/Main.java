public class Main {

    public static void main(String[] args) {

    }

    static String longestPalindrome(String str) {
        int maxLength = 1;
        int start = 0;
        int low;
        int high;

        for (int i = 1; i < str.length(); ++i) {
            // Find the longest even length palindrome with center points as i-1 and i.
            low = i - 1;
            high = i;
            while (low >= 0 && high < str.length() && str.charAt(low) == str.charAt(high)) {
                if (high - low + 1 > maxLength) {
                    start = low;
                    maxLength = high - low + 1;
                }
                --low;
                ++high;
            }

            // Find the longest odd length palindrome with center point as i
            low = i - 1;
            high = i + 1;
            while (low >= 0 && high < str.length() && str.charAt(low) == str.charAt(high)) {
                if (high - low + 1 > maxLength) {
                    start = low;
                    maxLength = high - low + 1;
                }
                --low;
                ++high;
            }
        }


        return str.substring(start, start + maxLength);
    }


}