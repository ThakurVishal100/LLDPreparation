package multipleInheritance;

public interface Parent {
    void foo();

    default void getName(){
        System.out.println("this is parent class");
    }
}
