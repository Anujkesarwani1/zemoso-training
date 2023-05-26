package LambdasAndStreams.StreamApi;

// Stream API is used to process collections of objects.
// A Stream is a sequence of objects that supports various methods which can be pipelined to produce the desired result.


// Java Stream Creation
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    private static List<Employee> generateEmpsList() {
        List<Employee> employees = new ArrayList<>();

        Employee e1 = new Employee(1, "Ramesh", 30, 30000);
        Employee e2 = new Employee(2, "Suresh", 29,  20888);
        Employee e3 = new Employee(3, "Ajay", 27,40000);
        Employee e4 = new Employee(4, "Aman", 15, 15000);
        Employee e5 = new Employee(5, "Rajesh", 27, 10000);
        Employee e6 = new Employee(6, "Ram", 29, 10000);
        Employee e7 = new Employee(7, "Rahul", 27, 40000);
        Employee e8 = new Employee(1, "Ramesh", 31, 35000);
        Employee e9 = new Employee(1, "Ramesh", 31, 29000);

        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);
        employees.add(e5);
        employees.add(e6);
        employees.add(e7);
        employees.add(e8);
        employees.add(e9);

        return employees;
    }

    private static void filterMapAndCollectExample(List<Employee> employee) {

        // filter example with predicate
        Predicate<Employee> salaryPredicate = (empSalary) -> empSalary.getSalary() > 15000;
        List<Employee> filteredEmps = employee.stream().filter(salaryPredicate)
                .collect(Collectors.toList());

        // getting object of employee whose salary is greater than 15000;
        filteredEmps.forEach(System.out::println);

        // map example, here we will take all the name of employees in upper case and will return list of names.
        // we are providing Function interface in map which will take one parameter.

//        Function<Employee, String> function = (e) -> e.getName();
//        Stream<String> streamOfEmpsName = employee.stream().map(function).map(String::toUpperCase);
        Stream<String> streamOfEmpsName = employee.stream().map(Employee::getName).map(String::toUpperCase);
        streamOfEmpsName.forEach(System.out::println);
    }
    private static void mapToIntExample() {
        List<String> intList = Arrays.asList("1", "2", "3", "4", "5", "6", "7");
        intList.stream().map(a->Integer.parseInt(a)).collect(Collectors.toList());
        List<Integer> list = intList
                .stream()
                .mapToInt(Integer::parseInt)
                .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);

        list.forEach(System.out::println);

    }

    private static void sortExample(List<Employee> employees, List<String> multipleUseList) {
        System.out.println("Before Sort");
        multipleUseList.stream().sorted().forEach(System.out::println);
        System.out.println("After Sort");
        
        // case sensitive comparison
        multipleUseList.stream().sorted((String s1, String s2) -> s1.compareTo(s2)).forEach(System.out::println);
    }

    private static void multipleUseList(List<Employee> employees, List<String> multipleUSeList) {
        System.out.println("Before Sort");
        multipleUSeList.stream().sorted().forEach(System.out::println);
        System.out.println("After Sort");

        // case-sensitive comparison
        multipleUSeList.stream()
                .sorted((s1, s2) -> s2.compareTo(s1))
                .forEach(System.out::println);

        multipleUSeList.stream()
                .sorted((s1, s2) -> s1.compareToIgnoreCase(s2))
                .forEach(System.out::println);

        System.out.println("Multiple Comparing example");
        Comparator<Employee> employeeComparator = Comparator
                .comparing(Employee::getSalary)
                .thenComparing(Employee::getName);
        Collections.sort(employees, employeeComparator);

        employees.forEach(System.out::println);
    }

    private static void peekExample(List<String> multipleUseList) {
        // if you want to peek the data from peek method in stream, so have to give the return methods like count, collect, etc.
        multipleUseList.stream().peek(System.out::println);
        multipleUseList.stream().peek(System.out::println).isParallel();

        multipleUseList.stream()
                .peek(str -> System.out.println("str: "+str))
                .filter(x-> !x.isEmpty())
                .map(String::toUpperCase).peek(System.out::println)
                .collect(Collectors.toList());

    }

    private static void anyMatchAllMatchNoneMatchExample(List<Employee> employees) {
        Predicate<String> nameStartsWithA = (name) -> name.toUpperCase().startsWith("A");

        Predicate<Integer> olderThan15 = (age) -> age >= 15;

        Predicate<String> nameStartsWithZ = (name) -> name.toUpperCase().startsWith("Z");

        Boolean result = employees.stream().map(Employee::getName).anyMatch(nameStartsWithA);
        System.out.println("Any Match: " + result);

        result = employees.stream().map(Employee::getName).allMatch(nameStartsWithZ);
        System.out.println("All Match: " + result);

        result = employees.stream().map(Employee::getName).noneMatch(nameStartsWithA);
        System.out.println("None Match with A: " + result);

        result = employees.stream().map(Employee::getName).noneMatch(nameStartsWithZ);
        System.out.println("None Match with Z: " + result);
    }

    public static void main(String[] args) {
        List<Employee> employees = generateEmpsList();
        List<String> multipleUseList = Arrays.asList("Pavan", "Ajay", "Bhavesh", "Amar", "Ramesh", "ajay");

        filterMapAndCollectExample(employees);
        mapToIntExample();
        sortExample(employees, multipleUseList);
        multipleUseList(employees, multipleUseList);
        peekExample(multipleUseList);
        anyMatchAllMatchNoneMatchExample(employees);
    }
}

