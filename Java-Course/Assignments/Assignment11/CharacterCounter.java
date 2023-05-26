package Assignment11;

// Using TextFile and a Map<Character,Integer>,
// create a program that takes the file name as a command line argument and counts the occurrence of all the different characters.
// Save the results in a text file.

import java.io.*;
import java.util.*;

public class CharacterCounter {
    public static void main(String[] args) throws IOException {
        String fileName = args[0];
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        String line = br.readLine();
        Map<Character, Integer> map = new HashMap<>();
        while (line != null) {
            char[] chars = line.toCharArray();
            for (char c : chars) {
                if (map.containsKey(c)) {
                    map.put(c, map.get(c) + 1);
                } else {
                    map.put(c, 1);
                }
            }
            line = br.readLine();
        }
        br.close();
        FileWriter writer = new FileWriter("output.txt");
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            writer.write(entry.getKey() + " : " + entry.getValue() + "\n");
        }
        writer.close();
    }
}

