package java8.b_Zadania_Domowe.b_Dzien_2.zad7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Main7 {
    public static void main(String[] args) {
        String file = "b_Zadania_Domowe/b_Dzien_2/zad7/earnings.txt";
        BufferedReader br = null;
        String line = "";

        List<String> employeeList = new ArrayList<>();
        try {
            br = new BufferedReader(new FileReader(file));
            while ((line = br.readLine()) != null) {

                employeeList.add(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("wszystko");
        employeeList.forEach(System.out::println);

        System.out.println("Po streamie");
        employeeList.stream()
                .filter(s -> !s.contains("Kowalsk"))
                .filter(s -> s.chars().anyMatch(Character::isDigit))
                .sorted((o1, o2) -> extractInt(o2) - extractInt(o1))
                .limit(3)
                .forEach(System.out::println);
    }

    static int extractInt(String s) {
        String num = s.replaceAll("\\D", "");
        return num.isEmpty() ? 0 : Integer.parseInt(num);
    }
}