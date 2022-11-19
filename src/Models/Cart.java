package Models;

import Models.Products.Product;

import java.util.ArrayList;

public class Cart {
    ArrayList<Product> products= new ArrayList<>();

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }
}
