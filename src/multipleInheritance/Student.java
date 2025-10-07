package multipleInheritance;

public class Student implements Teacher , Parent{
    @Override
    public void foo(){
        System.out.println("this is student class" );
    }

    public void getName(){
//        Parent.super.getName();
        Teacher.super.getName();
    }

    public static void main(String[] args) {
        Student student=new Student();
//        student.foo();
        student.getName();
    }
}
