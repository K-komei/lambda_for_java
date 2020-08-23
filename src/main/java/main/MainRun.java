package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainRun {


    public static void main(String[] args) {

        List<Employee> ijinList = new ArrayList<>();
        ijinList.add(new Employee("織田信長", 100));
        ijinList.add(new Employee("豊臣秀吉", 200));
        ijinList.add(new Employee("徳川家康", 300));

        //通常ver
        {
            Collections.sort(ijinList, new EmployeeComparator());
            printEmployee(ijinList);
        }

        //無名クラスver
        {
            Collections.sort(ijinList, new Comparator<Employee>() {
                public int compare(Employee e1, Employee e2) {
                    return Integer.compare(e1.getEmployeeNum(), e2.getEmployeeNum());
                }
            });
            printEmployee(ijinList);
        }

        //lambda式ver
        {
            Collections.sort(ijinList, (Employee t1, Employee t2) -> {return t2.getEmployeeNum() - t1.getEmployeeNum(); });
            printEmployee(ijinList);
        }

        //StreamAPIver
        ijinList.stream()
                .sorted((Employee t1,Employee t2) -> {return t1.getEmployeeNum() - t2.getEmployeeNum();})
                .forEach((s) -> {System.out.println(s.getEmployeeData());});
        }

    public static void printEmployee(List<Employee> list){
        for (Employee item : list) {
            System.out.println(item.getEmployeeData());
        }
    }

}

