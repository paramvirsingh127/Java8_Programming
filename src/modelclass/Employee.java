package modelclass;

import java.util.Comparator;
import java.util.Objects;

public class Employee {
    private int id;
    private String name;
    private String fatherName;
    private static int salary;
    private String mobileNo;

    public Employee(int id, String name, String fatherName, int salary, String mobileNo) {

        this.id = id;
        this.name = name;
        this.fatherName = fatherName;
        this.salary = salary;
        this.mobileNo = mobileNo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", salary=" + salary +
                ", mobileNo='" + mobileNo + '\'' +
                '}';
    }


}
