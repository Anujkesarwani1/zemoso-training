package Assignment2;

import java.util.Scanner;

// Write a java function that checks if the input string contains all the letters of the alphabet a-z (case-insensitive).
// Write time and space complexity of your solution as comments in the source file.

public class ContainsAllLetters {
    public static boolean solve(String input) {
        boolean[] letters = new boolean[26];
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            char c = Character.toLowerCase(input.charAt(i));
            if (c >= 'a' && c <= 'z' && !letters[c - 'a']) {
                letters[c - 'a'] = true;
                count++;
                if (count == 26) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String input;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        input = sc.nextLine();
        System.out.println(solve(input));

    }
}
// Output:
// Enter a string: abcdefghijklmnopqrstuvwxyz
// true

// Time Complexity: O(n), where 'n' is the length of the string.
// Space Complexity: O(1)


