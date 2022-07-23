package dev.struchkov.example.debugger.seven;

public class Employee {

    private String firstName;
    private String lastName;
    private Integer age;
    private Integer salary;
    private Position position;

    public Employee(String firstName, String lastName, Integer age, Integer salary, Position position) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
        this.position = position;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return position + " " + firstName + " " + lastName + " " + age + " лет, зарплата: " + salary;
    }

    public static Employee of(String firstName, String lastName, Integer age, Integer salary, Position position) {
        return new Employee(firstName, lastName, age, salary, position);
    }

    public enum Position {
        DEV("Разработчик"),
        ACCOUNTANT("Бухгалтер"),
        BOSS("Начальник отдела");

        private final String title;

        Position(String title) {
            this.title = title;
        }

        public String getTitle() {
            return title;
        }

        @Override
        public String toString() {
            return title;
        }
    }

}