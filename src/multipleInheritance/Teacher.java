package multipleInheritance;

public interface Teacher {
    void foo();

    default void getName(){
        System.out.println("this is teacher class");
    }
}
