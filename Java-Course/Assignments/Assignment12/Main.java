package Assignment12;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(111, "Jiya Brein", 17, "Female", "Computer Science", 2018, 70.8));
        students.add(new Student(122, "Paul Niksui", 18, "Male", "Mechanical", 2016, 50.2));
        students.add(new Student(133, "Martin Theron", 17, "Male", "Electronic", 2017, 90.3));
        students.add(new Student(144, "Murali Gowda", 18, "Male", "Electrical", 2018, 80));
        students.add(new Student(155, "Nima Roy", 19, "Female", "Textile", 2016, 70));
        students.add(new Student(166, "Iqbal Hussain", 18, "Male", "Security", 2016, 70));
        students.add(new Student(177, "Manu Sharma", 16, "Male", "Chemical", 2018, 70));
        students.add(new Student(188, "Wang Liu", 20, "Male", "Computer Science", 2015, 80));
        students.add(new Student(199, "Amelia Zoe", 18, "Female", "Computer Science", 2016, 85));
        students.add(new Student(200, "Jaden Dough", 18, "Male", "Security", 2015, 82));
        students.add(new Student(211, "Jasna Kaur", 20, "Female", "Electronic", 2019, 83));
        students.add(new Student(222, "Nitin Joshi", 19, "Male", "Textile", 2016, 60.4));
        students.add(new Student(233, "Jyothi Reddy", 16, "Female", "Computer Science", 2015, 45.6));
        students.add(new Student(244, "Nicolus Den", 16, "Male", "Electronic", 2017, 95.8));
        students.add(new Student(255, "Ali Baig", 17, "Male", "Electronic", 2018, 88.4));
        students.add(new Student(266, "Sanvi Pandey", 17, "Female", "Electric", 2019, 72.4));
        students.add(new Student(277, "Anuj Chettiar", 18, "Male", "Computer Science", 2017, 57.5));


        // 1. Print the name of all departments in the college?
        Function<Student, String> function = (e) -> e.getEngDepartment();
        List<String> departments = students.stream()
                .map(function)
                .distinct()
                .collect(Collectors.toList());
        System.out.println("Departments: " + departments);

        // 2.Get the names of all students who have enrolled after 2018?
        List<String> namedEnrolledAfter2018 = students.stream()
                .filter(student -> student.getYearOfEnrollment() > 2018)
                .map(Student::getName).collect(Collectors.toList());
        System.out.println("Name of Students enrolled after 2018: " + namedEnrolledAfter2018);


        // 3. Get the details of all male student in the computer sci department?
        List<Student> maleStudentsInComputerScience = students.stream()
                .filter(student -> student.getGender().equals("Male") && student.getEngDepartment().equals("Computer Science"))
                .collect(Collectors.toList());
        System.out.println("Details of male students in the Computer Science department:");
        maleStudentsInComputerScience.forEach(System.out::println);

        // 4. How many male and female student are there ?
        Map<String, Long> countByGender = students.stream()
                .collect(Collectors.groupingBy(Student::getGender, Collectors.counting()));

        Long maleCount = countByGender.getOrDefault("Male", 0L);
        Long femaleCount = countByGender.getOrDefault("Female", 0L);

        System.out.println("Number of male students: " + maleCount);
        System.out.println("Number of female students: " + femaleCount);

        // 5.What is the average age of male and female students?
        double avgMaleAge = students.stream()
                .filter(student -> student.getGender().equalsIgnoreCase("Male"))
                .collect(Collectors.averagingInt(Student::getAge));

        double avgFemaleAge = students.stream()
                        .filter(student -> student.getGender().equalsIgnoreCase("Female"))
                                .collect(Collectors.averagingInt(Student::getAge));

        System.out.println("Average age of male students: " + avgMaleAge);
        System.out.println("Average age of female students: " + avgFemaleAge);

        // 6.Get the details of highest student having highest percentage ?
        Comparator<Student> percentageComparator = Comparator.comparingDouble(Student::getPerTillDate);
        Student studentWithHighestPercentage = students.stream()
                .max(percentageComparator)
                .orElse(null);
        if(studentWithHighestPercentage != null) {
            System.out.println("Details of student with highest percentage:");
            System.out.println(studentWithHighestPercentage);
        }
        else {
            System.out.println("No student found");
        }

        // 7.Count the number of students in each department?
        Map<String, Long> countByDepartment = students.stream()
                .collect(Collectors.groupingBy(Student::getEngDepartment, Collectors.counting()));

        System.out.println("Number of students in each department:");
        countByDepartment.forEach((department, count) ->
                System.out.println(department + ": " + count));

        // 8. What is the average percentage achieved in each department?
        Map<String, Double> avgPercentageByDepartment = students.stream()
                .collect(Collectors.groupingBy(Student::getEngDepartment, Collectors.averagingDouble(Student::getPerTillDate)));

        System.out.println("Average percentage achieved in each departments: ");
        avgPercentageByDepartment.forEach((department, avgPercentage) ->
                System.out.println(department + ": " + avgPercentage));

        // 9. Get the details of youngest male student in the Electronic department?
        Comparator<Student> ageComparator = Comparator.comparingInt(Student::getAge);
        Student youngMaleInElectronic = students.stream()
                .filter(student -> student.getGender().equalsIgnoreCase("Male") && student.getEngDepartment().equalsIgnoreCase("Electronic"))
                .min(ageComparator)
                .orElse(null);

        if(youngMaleInElectronic != null) {
            System.out.println("Details of youngest male student in the Electronic department: ");
            System.out.println(youngMaleInElectronic);
        }
        else {
            System.out.println("No student found");
        }

        // 10.How many male and female students are there in the computer science department?
        Map<String, Long> countByMale = students.stream()
                .filter(student -> student.getGender().equals("Male") && student.getEngDepartment().equals("Computer Science"))
                .collect(Collectors.groupingBy(Student::getGender, Collectors.counting()));

        Map<String, Long> countByFemale = students.stream()
                        .filter(student -> student.getGender().equals("Female") && student.getEngDepartment().equals("Computer Science"))
                                .collect(Collectors.groupingBy(Student::getGender, Collectors.counting()));

        Long maleInCS = countByMale.getOrDefault("Male", 0L);
        Long femaleInCS = countByFemale.getOrDefault("Female", 0L);
        System.out.println("Number of male students in computer science department: " + maleInCS);
        System.out.println("Number of female students in computer science department: " + femaleInCS);
    }
}

