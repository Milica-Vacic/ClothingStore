package Models.Products;

import java.time.LocalDateTime;

public abstract class Product{
    String name;
    String brand;
    float price;
    String color;
    String size;

    public boolean isSizeCorrect(String s){
        try {
            int parsed=Integer.parseInt(s);
            return parsed >= 42 && parsed <= 66 && parsed % 2 != 1;
        }
        catch (NumberFormatException e){
            return false;
        }
    }

    public int findDiscount(int catAmount, LocalDateTime dateTime){
        if (catAmount>3) return 20;
        return 0;
    }

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public float getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public String getSize() {
        return size;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSize(String size) throws IllegalArgumentException {
        if (!isSizeCorrect(size))
            throw new IllegalArgumentException("The submitted size is not valid");
        this.size = size;
    }

    public Product(String name, String brand, float price, String color, String size) throws IllegalArgumentException {
        if (!isSizeCorrect(size)) throw new IllegalArgumentException("The submitted size is not valid");
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.color = color;
        this.size = size;
    }

    @Override
    public String toString() {
        return name+" - "+brand+"\n$"+price;
    }
}
