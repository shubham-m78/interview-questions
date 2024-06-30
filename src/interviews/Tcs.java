package interviews;

import java.util.HashSet;
import java.util.Set;

public class Tcs {

    public static void main(String[] args) {
        Employee employeeOne = new Employee();
        employeeOne.name = "Shubham";
        Employee employeeTwo = new Employee();
        employeeTwo.name = "Rajul";

        Set<Employee> set = new HashSet<>();
        set.add(employeeOne);
        set.add(employeeTwo);

        System.out.println(set.size());
    }
}

class Employee{
    String name;

    @Override
    public int hashCode() {
        return 31;
    }

    @Override
    public boolean equals(Object obj) {
        return true;
    }
}
