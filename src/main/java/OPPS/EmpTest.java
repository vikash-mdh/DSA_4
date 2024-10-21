package OPPS;

class Employee{
    String name;
    int age;
    Employee(){
        System.out.println("Employee constructor is called");
    }
    public void disp(){
        System.out.println("Name of the employee" + name);
        System.out.println("age of the employee" + age);
    }
}
public class EmpTest {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.disp();

    }
}
 // employee constructor is called null constructor
