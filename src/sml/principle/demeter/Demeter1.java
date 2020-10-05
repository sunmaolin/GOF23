package sml.principle.demeter;

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
        //1. 这里的CollegeEmployee 不是SchoolManager的直接朋友
        //2. CollegeEmployee 是以局部变量方式出现在SchoolManager
        //3. 违反了迪米特法则
        List<CollegeEmployee> list1 = sub.getAllEmployee();
        System.out.println("----------学院员工-----------");
        for (CollegeEmployee e : list1){
            System.out.println(e.getId());
        }
        List<Employee> list2 = this.getAllEmployee();
        System.out.println("----------学校总部员工-----------");
        for (Employee e : list2){
            System.out.println(e.getId());
        }
    }
}
