package Design_Patterns.BuilderDesignPattern;

public class Main {
    public static void main(String[] args) {
        Product p=new Product.Builder("Round neck shirt",100)
                .category("T-Shirt")
                .discount(10)
                .brand("POLO")
                .build();
        System.out.println(p.toString());

    }
}
