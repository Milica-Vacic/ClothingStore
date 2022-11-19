package Models.Products;

public class Jacket extends Product {
    public Jacket(String name, String brand, float price, String color, String size) throws IllegalArgumentException {
        super(name, brand, price, color, size);
    }
}
