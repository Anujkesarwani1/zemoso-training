package Assignment9;

// Using the documentation for java.util.regex.Pattern as a resource,
// write and test a regular expression that checks a sentence to see that it begins with a capital letter and ends with a period.

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Sentence: ");
        String inStr = sc.nextLine();
        String regExp = "^[A-Z].*[.]$";
        Pattern pattern = Pattern.compile(regExp);
        Matcher matcher = pattern.matcher(inStr);
        if(matcher.matches())
            System.out.println("Sentence is valid!");
        else
            System.out.println("Sentence is not valid!");
    }
}
// Time Complexity: O(N + M) where, N - size of the Sentence, M - size of the regExp.
// Space Complexity: O(1)

// Output:
// Enter the Sentence: Anuj Kesarwani.
// Sentence is valid!

