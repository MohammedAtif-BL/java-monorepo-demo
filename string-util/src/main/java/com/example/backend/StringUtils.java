package com.example.backend;


public class StringUtils {
    public static String reverse(String input) {
        return new StringBuilder(input).reverse().toString();
    }

    public static boolean isPalindrome(String input) {
        String reversed = reverse(input);
        return input.equals(reversed);
    }
}
