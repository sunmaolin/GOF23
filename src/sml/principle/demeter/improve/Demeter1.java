package sml.principle.demeter.improve;

import java.util.ArrayList;
import java.util.List;

//客户端
public class Demeter1 {
    public static void main(String[] args) {
        SchoolManager schoolManager = new SchoolManager();
        schoolManager.printAllEmployee(new CollegeManager());
    }
}

//学校总部员工
class Employee {
    public String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

//学院的员工
class CollegeEmployee {
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

//管理学院员工的管理类
class CollegeManager {
    //返回学院的所有员工
    public List<CollegeEmployee> getAllEmployee(){
        ArrayList<CollegeEmployee> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            CollegeEmployee emp = new CollegeEmployee();
            emp.setId("学院员工id=" + i);
            list.add(emp);
        }
        return list;
    }

    //输出学院员工的信息
    public void printEmployee(){
        List<CollegeEmployee> list1 = getAllEmployee();
        System.out.println("----------学院员工-----------");
        for (CollegeEmployee e : list1){
            System.out.println(e.getId());
        }
    }
}

//学校的管理类

//分析该类的直接朋友类有哪些？
//Employee CollegeManager
//CollegeEmployee  不是直接朋友，是一个陌生类，违反了迪米特法则
class SchoolManager {
    public List<Employee> getAllEmployee(){
        ArrayList<Employee> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Employee emp = new Employee();
            emp.setId("学校总部员工id=" + i);
            list.add(emp);
        }
        return list;
    }

    //输出学校总部与学校员工的信息
    void printAllEmployee(CollegeManager sub){
        //分析问题
        //1.将输出学院的员工方法，封装到CollegeManager
        //降低类之间的耦合度，除了对外提供给public方法，不对外泄露任何信息
        //也就是对依赖的类直到的尽可能少，我不关心你是怎么输出的，只需要你给我提供public方法
        sub.printEmployee();
        List<Employee> list2 = this.getAllEmployee();
        System.out.println("----------学校总部员工-----------");
        for (Employee e : list2){
            System.out.println(e.getId());
        }
    }
}
