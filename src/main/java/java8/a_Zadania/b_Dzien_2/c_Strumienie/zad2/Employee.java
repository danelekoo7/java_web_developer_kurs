package java8.a_Zadania.b_Dzien_2.c_Strumienie.zad2;

import java.time.LocalDate;

public class Employee {
    private String name;
    private String lastname;
    private String sex;
    private LocalDate born;
    private double salary;

    public Employee(String name, String lastname, String sex, LocalDate born, double salary) {
        this.name = name;
        this.lastname = lastname;
        this.sex = sex;
        this.born = born;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public LocalDate getBorn() {
        return born;
    }

    public void setBorn(LocalDate born) {
        this.born = born;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", sex='" + sex + '\'' +
                ", born=" + born +
                ", salary=" + salary +
                '}';
    }
}