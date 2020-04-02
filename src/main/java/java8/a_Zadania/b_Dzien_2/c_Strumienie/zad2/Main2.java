package java8.a_Zadania.b_Dzien_2.c_Strumienie.zad2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main2 {

    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(new Employee("Jarek", "Nianitsu", "Male", LocalDate.of(1990, 10, 10), 2000.2));
        employeeList.add(new Employee("Adrian", "Nowa", "Male", LocalDate.of(1967, 10, 10), 7000));
        employeeList.add(new Employee("Wincent", "Nowak", "Male", LocalDate.of(1980, 10, 10), 5000.2));
        employeeList.add(new Employee("Jagoda", "Niagara", "Female", LocalDate.of(1998, 10, 10), 32000.2));
        employeeList.add(new Employee("Marek", "A", "Male", LocalDate.of(1970, 10, 10), 1800.2));
        employeeList.add(new Employee("Jurek", "B", "Male", LocalDate.of(1983, 10, 10), 1900.2));
        employeeList.add(new Employee("Krystyna", "C", "Female", LocalDate.of(1999, 10, 10), 2200.2));
        employeeList.add(new Employee("Jagoda", "Nazwisko", "Female", LocalDate.of(1985, 10, 10), 2400.2));
        employeeList.add(new Employee("Jagoda", "Nazwisko", "Female", LocalDate.of(1989, 10, 10), 2600.2));
        employeeList.add(new Employee("Jagoda", "Nazwisko", "Female", LocalDate.of(1987, 10, 10), 6000.2));

        System.out.println("wypisz na ekranie wszystkich pracowników, których nazwisko zaczyna się na literę „N”");
        employeeList.stream()
                .filter(employee -> employee.getLastname().startsWith("N"))
                .forEach(System.out::println);

        System.out.println("\nwypisz na ekranie wszystkich pracowników, którzy są w wieku między 30 a 45 lat");
        employeeList.stream()
                .filter(employee -> employee.getBorn().getYear() < 1991)
                .filter(employee -> employee.getBorn().getYear() > 1975)
                .forEach(System.out::println);

        System.out.println("\ndaj 5% podwyżki wszystkim kobietom, które są w wieku między 20 a 30 lat, " +
                "\na ich wynagrodzenie jest nie wyższe niż 3500 zł");
        employeeList.stream()
                .filter(employee -> employee.getBorn().getYear() < 2000)
                .filter(employee -> employee.getBorn().getYear() > 1990)
                .filter(employee -> employee.getSalary() <= 3500)
                .filter(employee -> employee.getSex().equals("Female"))
                .peek(employee -> employee.setSalary(employee.getSalary() + 0.05 * employee.getSalary()))
                .forEach(System.out::println);

        System.out.println(employeeList);

    }

}

