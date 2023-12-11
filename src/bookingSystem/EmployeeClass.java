package bookingSystem;

import java.util.Scanner;

public class EmployeeClass {
Scanner sc= new Scanner(System.in);
    String name= sc.nextLine();
    int salary= sc.nextInt();
    String city=sc.nextLine();
    String dept=sc.nextLine();

    public EmployeeClass(String name, int salary, String city, String dept) {
        this.name = name;
        this.salary = salary;
        this.city = city;
        this.dept = dept;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }
}
