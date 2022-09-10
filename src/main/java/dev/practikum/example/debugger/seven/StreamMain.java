package dev.practikum.example.debugger.seven;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamMain {

    public static void main(String[] args) {

        final List<Employee> employees = List.of(
                Employee.of("Екатерина", "Козлова", 28, 2_000_000, Employee.Position.BOSS),
                Employee.of("Алексей", "Кузнецов", 45, 90_000, Employee.Position.ACCOUNTANT),
                Employee.of("Юлия", "Козлова", 18, 35_000, Employee.Position.ACCOUNTANT),
                Employee.of("Никита", "Васильев", 22, 110_000, Employee.Position.DEV),
                Employee.of("Иван", "Иванов", 30, 300_000, Employee.Position.DEV),
                Employee.of("Анна", "Ермолова", 45, null, Employee.Position.DEV),
                Employee.of("Ирина", "Колесникова", 35, 200_000, Employee.Position.DEV)
        );

        final Set<String> devs = employees.stream()
                .filter(employee -> Employee.Position.DEV.equals(employee.getPosition()))
                .filter(employee -> employee.getSalary() != null)
                .filter(employee -> employee.getSalary() > 150_000)
                .map(Employee::getLastName)
                .collect(Collectors.toSet());

        final Map<Employee.Position, List<Employee>> collect = employees.stream()
                .filter(employee -> employee.getSalary() != null)
                .collect(Collectors.groupingBy(Employee::getPosition));

    }

}
