package abstractclass;

public class Macbook extends Product{
    @Override
    public int calculateDis(){
        return 0;
    }

    @Override
    public void termsAndCondition(){
        System.out.println("this is the terms of macbook");
    }
}
