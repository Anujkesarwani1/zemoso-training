import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Hashset {
    public static void main(String[] args) {
        HashSet<String> test1 = new HashSet<String>();
//        LinkedHashSet<String> test1 = new LinkedHashSet<String>();
//        TreeSet<String> test1 = new TreeSet<String>();
        test1.add("red");
        test1.add("blue");
        test1.add("yellow");
        test1.add("black");
        test1.add("gray");
        test1.add("green");
        test1.add("green");
        System.out.println(test1);

        for(String item: test1) {
            System.out.println(item);
        }

        if(test1.contains("purple")) {
            System.out.println("Contains purple");
        }
        if (test1.contains("blue")) {
            System.out.println("Contain Blue");
        }

        HashSet<String> test2 = new HashSet<String>();
        test2.add("red");
        test2.add("blue");
        test2.add("yellow");
        test2.add("black");
        test2.add("gray");
        test2.add("beige");

        HashSet<String> commonItems = new HashSet<String>();
        commonItems.retainAll(test1);
        System.out.println(commonItems);

        HashSet<String> differentItem = new HashSet<String>();
        differentItem.retainAll(test1);
        System.out.println(differentItem);

    }
}
