package OPPS;

class Student1 {
    // instance variable
    public String name;
    public String address;
    public int age;
    public int mark;
    public String grade;

    // this is called constructor
    Student1(String name, String address, int age, int mark, String grade) {
        System.out.println("object creaton");
        this.name = name;
        this.address = address;
        this.age = age;
        this.mark = mark;
        this.grade = grade;

}

// normal method
public void disp() {
        System.out.println("name is this  " + name);
        System.out.println("this is my village  " + address);
        System.out.println("i am is year old  " + age);
        System.out.println("my collage makr is this  " + mark);
        System.out.println("my grade is this  " + grade);
    }
    }


public class Apptest {
    public static void main(String[] args) {
    Student1 st =  new Student1("vikash","bhopla",24,105,"A");
    st.disp();
    }
}
