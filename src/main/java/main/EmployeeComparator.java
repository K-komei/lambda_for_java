package main;

import java.util.Comparator;

public class EmployeeComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee t1, Employee t2) {
        return t1.getEmployeeNum() < t2.getEmployeeNum() ? -1:1;
    }
}
