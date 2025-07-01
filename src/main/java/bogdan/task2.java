package bogdan;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String result = findShortestPalindrome(s);
        System.out.println(result);
    }

    public static String findShortestPalindrome(String s) {
        int n = s.length();
        String minPalindrome = null;

        for (int i = 0; i <= n - 2; i++) { // проверка подстрок длины 2
            String substr = s.substring(i, i + 2);
            if (isPalindrome(substr)) {
                return substr;
            }
        }
        for (int i = 0; i <= n - 3; i++) { // если не нашли подстрок длины 2 ,смотрим подстроки длины 3
            String substr = s.substring(i, i + 3);
            if (isPalindrome(substr)) {

                if (minPalindrome == null || substr.compareTo(minPalindrome) < 0) {
                    minPalindrome = substr;
                }
            }
        }


        if (minPalindrome != null) {
            return minPalindrome;
        }


        return "-1";
    }

    private static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}