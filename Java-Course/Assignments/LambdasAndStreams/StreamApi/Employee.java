package LambdasAndStreams.StreamApi;

public class Employee {
    private Integer id;
    private String name;
    private Integer salary;
    private Integer age;

    public Employee() {
        super();
    }

    public Employee(Integer id, String name, Integer age, Integer salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.age = age;
    }

    public Integer getSalary() {
        return salary;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }

    public Integer getAge() {
        return age;
    }
}

