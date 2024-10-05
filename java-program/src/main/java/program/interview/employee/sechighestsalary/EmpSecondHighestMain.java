package program.interview.employee.sechighestsalary;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class EmpSecondHighestMain {

    public static void main(String[] args) {

        employeeList().stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .skip(1).limit(1).forEach(System.out::println);

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
