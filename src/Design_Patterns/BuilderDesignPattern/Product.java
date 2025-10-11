package Design_Patterns.BuilderDesignPattern;

public class Product {
    private final String name;
    private final String desc;
    private final int price;
    private final int discount;
    private final String brand;
    private final String category;


    public String getName() {
        return name;
    }



    public String getDesc() {
        return desc;
    }



    public int getPrice() {
        return price;
    }



    public int getDiscount() {
        return discount;
    }



    public String getBrand() {
        return brand;
    }


    public String getCategory() {
        return category;
    }




    private Product(Builder b){
        this.brand=b.brand;
        this.category=b.category;
        this.price=b.price;
        this.desc=b.desc;
        this.name=b.name;
        this.discount=b.discount;
    }

    public static Builder getBuilder(){
        return new Builder();
    }

    public static class Builder{
        private String name;
        private String desc;
        private int price;
        private int discount;
        private String brand;
        private String category;

//        public Builder(String name,int price){
//            this.name=name;
//            this.price=price;
//        }

        public Builder setName(String name){
            this.name=name;
            return this;
        }

        public Builder setPrice(int price){
            this.price=price;
            return this;
        }

        public Builder setDesc(String description){
            this.desc=description;
            return this;
        }

        public Builder setDiscount(int dis){
            this.discount=dis;
            return this;
        }

        public Builder setBrand(String brand){
            this.brand=brand;
            return this;
        }

        public Builder setCategory(String cat){
            this.category=cat;
            return this;
        }



        public Product build() {
            if (price <= 0) {
                throw new IllegalArgumentException("Price must be positive");
            }
            return new Product(this);
        }

    }
    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                ", price=" + price +
                ", discount=" + discount +
                ", brand='" + brand + '\'' +
                ", category='" + category + '\'' +
                '}';
    }

}
