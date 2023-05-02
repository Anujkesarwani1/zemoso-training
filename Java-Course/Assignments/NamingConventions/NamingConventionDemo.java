import java.time.LocalDateTime;

// class and interface - Naming should be capitalized or follow PascalCase (Calc, Runnable, etc.)
// variable and method - Naming should be camelCase, meaning the first letter of the first word should be lowercase, first letter of each subsequent word should be capitalized (marks, show() getData(), etc.)
// constant - All letter should be capital (PIE, BRAND, etc.)

class Demo {

    public String getMessage() {
        StringBuilder str = new StringBuilder();
        str.append("Hello, ");
        str.append("Everyone!");
        String message = str.toString();
        return message;
    }

    public void getData() {
        LocalDateTime now = LocalDateTime.now();
        int year = now.getYear();
        int month = now.getMonthValue();
        int day = now.getDayOfMonth();
        System.out.println("Today is "+day+"-"+month+"-"+year);
    }
}

public class NamingConventionDemo {

    public static void main(String[] args) {
        Demo demo = new Demo();
        System.out.println(demo.getMessage());
        demo.getData();
    }
}

// Output:
// Hello Everyone!
// Today is 02-05-2023
