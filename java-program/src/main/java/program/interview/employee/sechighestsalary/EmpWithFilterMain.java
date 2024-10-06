package program.interview.employee.sechighestsalary;

import java.util.Arrays;
import java.util.List;

public class EmpWithFilterMain {

    public static void main(String[] args) {
        List<Employee> list = employeeList().stream().filter(data -> data.getSalary() > 30).toList();
        System.out.println(list);


    }

    public static List<Employee> employeeList(){
        List<Employee> employeeList= Arrays.asList(
                new Employee(2,"Ram",40.0),
                new Employee(2,"Ram",50.0),
                new Employee(2,"Ram",30.0),
                new Employee(2,"Ram",20.0),
                new Employee(2,"Ram",60.0)
        );

        return employeeList;
    }
}
