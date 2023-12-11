package java8practics;

import modelclass.Employee;
import modelclass.Students;

import java.util.*;
import java.util.stream.Collectors;



public class FirstClass {
    static void m(){
        List<Employee> list= Arrays.asList(new Employee(4,"paramvir","sal",253000,"495863222"),
                new Employee(9,"paramvir1","sal2",2536000,"49583222"),
                new Employee(6,"paramvir2","sal3",253600,"49586322"),
                new Employee(8,"paramvir3","sal4",2530000,"495863922"),
                new Employee(2,"paramvir","sal5",253000,"495863122"),
                new Employee(1,"paramvir5","sal7",25300,"4958632362"));

        List<Students> student= Arrays.asList(new Students("Gourav","9536664758",5,"A"),
                new Students("Gourav1","9536456858",6,"B"),
                new Students("Gourav2","9536764758",8,"A"),
                new Students("Gourav3","9536664958",7,"B"),
                new Students("Gourav4","9536648558",2,"A"),
                new Students("Gourav5","9546664758",1,"A"));

        // list of employee
        //TODO find the employee name list
        //List<String> namelist1= list.stream().map(employee -> employee.getName()).collect(Collectors.toList());
        List<String> namelist= list.stream().map(Employee::getName).toList();
        //namelist.forEach(System.out::println);
        //todo remove duplicate
        List<String> namelistmap= list.stream().map(Employee::getName).distinct().collect(Collectors.toList());
        //namelistmap.forEach(System.out::println);
        //todo find max salary employee
        Optional<Employee> highest= Optional.of(list.stream().max(Comparator.comparing(Employee::getSalary)).get());
        //System.out.println(highest);
        Optional<Employee> highestsalary= list.stream().min(Comparator.comparing(Employee::getSalary));
        //System.out.println(highestsalary);
        Employee highsalary= list.stream().max(Comparator.comparing(Employee::getSalary)).get();
        //System.out.println(highsalary);
        Integer sumsalary= list.stream().mapToInt(Employee::getSalary).sum();
        //System.out.println(sumsalary);
        List<Employee> fil= list.stream().filter(employee -> employee.getSalary()>10000).collect(Collectors.toList());
        //System.out.println(fil);
        List<Employee> duplicate=list.stream().sorted(Comparator.comparing(Employee::getName)).collect(Collectors.toList());
        //duplicate.forEach(System.out::println);

    }
    static void intArray(){
        int array[]={58,95,36,74,25,65,25,78,65};


    }


    public static void main(String[] args) {
        //m();
        FirstClass.intArray();
    }
}
