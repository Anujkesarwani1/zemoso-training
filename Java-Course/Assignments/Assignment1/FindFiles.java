package Assignment1;

// Create a java program to search through the home directory and look for files that match a regular expression.
// The program should be able to take inputs repeatedly and should print out the full absolute path of the matching files found.

import java.io.File;
import java.util.Scanner;

public class FindFiles {
    public static void getFileNames(String pattern, File f){
        if(f.isDirectory()){
            File files[]=f.listFiles();
            for(File file:files){
                if(file.isDirectory()){
                    getFileNames(pattern,file);
                }
                else {
                    if (file.getName().matches(pattern)){
                        System.out.println("Files Absolute Path is " + file.getAbsolutePath());
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        File dir = new File("D:\\Zemoso\\Java Course");
        String pattern;
        do {
            System.out.print("Enter a Regular expression to search: ");
            pattern=sc.next();
            getFileNames(pattern,dir);
        } while (!pattern.equalsIgnoreCase("stop"));
        sc.close();
    }
}

// Time Complexity: O(n * m), where n - no. of files,  m - average length of the file names.
// Space Complexity: O(d + n), where d - depth of the directory structure, n - total number of files and directories.

// Output:
// Enter a Regular expression to search: .*\.txt
// Files Absolute Path is D:\Zemoso\Java Course\CoreJavaUdemyCourse\text.txt
// Files Absolute Path is D:\Zemoso\Java Course\example.txt

