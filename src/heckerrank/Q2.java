package heckerrank;

import modelclass.Employee;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class Q2 {
      static void findname(){
          List<Employee> list= Arrays.asList(new Employee(11,"satyam","hariom",264253,
                  "95365555555"),
                  new Employee(11,"matray","acp",284253,
                          "95365555565"),
                  new Employee(11,"paramvir","munnalal",274253,
                          "9536555955"),
                  new Employee(11,"gourav","ramkisan",294253,
                          "9536555755"),
                  new Employee(11,"harsimrat","prakash singh",244253,
                          "9536555585"));
          //find name list of employee
          List<String> name =list.stream().map(Employee::getName).collect(Collectors.toList());
          name.forEach(System.out::println);


      }
      public static void main(String[] args) {
          findname();


      }

}
