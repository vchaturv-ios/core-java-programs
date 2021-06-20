package designpatterns.prototype;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListDemo {
  public static void main(String[] args) {
    List<Employee> myList = new ArrayList<>();
    myList.add(new Employee("Vishnu", 25));
    myList.add(new Employee("Rajat", 47));
    myList.add(new Employee("John", 46));

    List<Employee> result = myList.stream().filter(employee -> employee.getAge()>45).collect(Collectors.toList());

    System.out.println(result);
  }
}
