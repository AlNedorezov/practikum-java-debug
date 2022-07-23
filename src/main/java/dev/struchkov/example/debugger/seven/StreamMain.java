package dev.struchkov.example.debugger.seven;

import dev.struchkov.example.debugger.seven.Employee.Position;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import static dev.struchkov.example.debugger.seven.Employee.Position.ACCOUNTANT;
import static dev.struchkov.example.debugger.seven.Employee.Position.BOSS;
import static dev.struchkov.example.debugger.seven.Employee.Position.DEV;

public class StreamMain {

    public static void main(String[] args) {

        final List<Employee> employees = List.of(
                Employee.of("Екатерина", "Козлова", 28, 2_000_000, BOSS),
                Employee.of("Алексей", "Кузнецов", 45, 90_000, ACCOUNTANT),
                Employee.of("Юлия", "Козлова", 18, 35_000, ACCOUNTANT),
                Employee.of("Никита", "Васильев", 22, 110_000, DEV),
                Employee.of("Иван", "Иванов", 30, 300_000, DEV),
                Employee.of("Анна", "Ермолова", 45, null, DEV),
                Employee.of("Ирина", "Колесникова", 35, 200_000, DEV)
        );

        final Set<String> devs = employees.stream()
                .filter(employee -> DEV.equals(employee.getPosition()))
                .filter(employee -> employee.getSalary() != null)
                .filter(employee -> employee.getSalary() > 150_000)
                .map(Employee::getLastName)
                .collect(Collectors.toSet());

        final Map<Position, List<Employee>> collect = employees.stream()
                .filter(employee -> employee.getSalary() != null)
                .collect(Collectors.groupingBy(Employee::getPosition));

    }

}
