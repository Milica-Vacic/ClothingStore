import Models.Cart;
import Models.Cashier;
import Models.Products.Jacket;
import Models.Products.Shirt;
import Models.Products.Shoes;
import Models.Products.Trousers;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        //EXAMPLE #1
/*      Cart cart1 = new Cart();
        cart1.getProducts().add(new Shirt("Blue Cotton Shirt", "BrandS", (float)14.99, "blue", "M"));
        cart1.getProducts().add(new Shirt("White Cotton Shirt", "BrandS", (float)15.99, "blue", "M"));
        cart1.getProducts().add(new Trousers("Black Cotton Trousers", "BrandT", (float)29.99, "black", "50"));
        cart1.getProducts().add(new Shoes("Black Leather Shoes", "BrandS", (float)59.99, "black", "43"));
        cart1.getProducts().add(new Jacket("Black Cotton Suit Jacket", "BrandJ", (float)99.99, "black", "50"));
        Cashier.printReceipt(cart1, LocalDateTime.of(2022,2,2,12,34,56));*/

        //EXAMPLE 2
/*        Cart cart2=new Cart();
        cart2.getProducts().add(new Shirt("Black Silk Shirt", "BrandS", (float)29.99, "black", "L"));
        cart2.getProducts().add(new Shirt("White Silk Shirt", "BrandS", (float)29.99, "white", "L"));
        Cashier.printReceipt(cart2,LocalDateTime.of(2022,2,1,12,34,56));*/

        //EXAMPLE 3
        Cart cart3=new Cart();
        cart3.getProducts().add(new Trousers("Red Linen Trousers", "BrandT", (float)49.99, "red", "56"));
        cart3.getProducts().add(new Shoes("Red Suede Shoes", "BrandS", (float)59.99, "red", "44"));
        cart3.getProducts().add(new Shoes("Black Suede Shoes", "BrandS", (float)59.99, "black", "44"));
        cart3.getProducts().add(new Jacket("Red Linen Suit Jacket", "BrandJ", (float)99.99, "red", "56"));
        cart3.getProducts().add(new Shirt("White Linen Shirt", "BrandS", (float)29.99, "white", "L"));
        Cashier.printReceipt(cart3,LocalDateTime.of(2022,2,1,12,34,56));

    }
}