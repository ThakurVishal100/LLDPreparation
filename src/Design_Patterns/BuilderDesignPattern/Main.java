package Design_Patterns.BuilderDesignPattern;

public class Main {
    public static void main(String[] args) {
        Product p=Product.getBuilder()
                .setPrice(100)
                .setCategory("T-Shirt")
                .setDiscount(10)
                .setBrand("POLO")
                .build();


//        System.out.println(p.toString());
        System.out.println(p.getCategory());
        System.out.println(p.getPrice());

    }
}
