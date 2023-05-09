package Assignment6;

// 1. A vampire number v is a number with an even number of digits n, that can be factored into two numbers x and y each with n/2 digits and not both with trailing zeroes, where v contains precisely all the digits from x and from y, in any order.
// Write a java program to print first 100 vampire numbers.

import java.util.ArrayList;
import java.util.List;

public class VampireNumbers {
    public static void main(String[] args) {
        List<Long> vampireNumbers = new ArrayList<>();
        long number = 10;

        while (vampireNumbers.size() < 100) {
            if (isVampireNumber(number)) {
                vampireNumbers.add(number);
            }
            number++;
        }

        System.out.println("First 100 vampire numbers:");
        for (int i = 0; i < vampireNumbers.size(); i++) {
            System.out.println((i + 1) + ": " + vampireNumbers.get(i));
        }
    }

    public static boolean isVampireNumber(long number) {
        String numberString = Long.toString(number);
        int numDigits = numberString.length();

        if (numDigits % 2 != 0) {
            return false;
        }

        for (long x = 2; x <= Math.sqrt(number) + 1; x++) {
            if (number % x == 0) {
                long y = number / x;
                if (isPossibleVampire(numberString, Long.toString(x), Long.toString(y))) {
                    return true;
                }
            }
        }

        return false;
    }

    public static boolean isPossibleVampire(String number, String x, String y) {
        if (x.charAt(x.length() - 1) == '0' && y.charAt(y.length() - 1) == '0') {
            return false; // Both x and y should not end with zero
        }

        String concatenated = x + y;
        char[] numberChars = number.toCharArray();

        for (char c : concatenated.toCharArray()) {
            int index = number.indexOf(c);
            if (index == -1) {
                return false; // The digit c is not present in the original number
            }
            numberChars[index] = ' '; // Mark the digit as used by replacing it with a space
        }

        for (char c : numberChars) {
            if (c != ' ') {
                return false; // There are remaining unused digits
            }
        }

        return true;
    }
}

// Time Complexity: O(sqrt(number)) where, number - size of the Array
// Space Complexity: O(1)

