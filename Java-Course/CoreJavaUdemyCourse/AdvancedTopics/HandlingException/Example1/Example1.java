package HandlingException.Example1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("example.txt");
        Scanner readFile = new Scanner(file);
    }
}
