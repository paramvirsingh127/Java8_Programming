package practicewithoutjava8;

import modelclass.Employee;

import java.util.HashSet;

public class HashSetlist {
    public static void main(String[] args) {
        HashSet<Employee> set= new HashSet<>();
        Employee employee1= new Employee(1, "param","munnalal",25300,"9653214755");
        Employee employee2= new Employee(1, "param","munnall",2530,"965314755");
        Employee employee3= new Employee(1, "parm","munnlal",253,"965321755");
        Employee employee4= new Employee(1, "paam","munalal",25,"965321475");
        set.add(employee1);
        set.add(employee2);
        set.add(employee3);
        set.add(employee4);
        for (Employee var: set) {
            for (int i = 0; i < set.size(); i++) {
            System.out.println(var.getName());
            }
        }
    }
}
