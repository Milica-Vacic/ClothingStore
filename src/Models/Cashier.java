package Models;

import Models.Products.Product;

import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Cashier {
    public static void printReceipt(Cart cart, LocalDateTime dateTime){
        DecimalFormat df = new DecimalFormat("#.00");

        System.out.print("Date:"+ dateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-d hh:mm:ss"))+
                "\n---Products---\n"
        );

        float priceSum=0;
        float discountSum=0;

        for(Product p:cart.getProducts()){
            System.out.println("\n"+p);
            priceSum+=p.getPrice();
            int discount=p.findDiscount(cart.getProducts().size(), dateTime);
            if (discount!=0){
                float reduction=(float)Math.round(p.getPrice()*discount)/100;
                discountSum+=reduction;
                System.out.println("#discount "+discount+"% -$"+df.format(reduction));
            }
        }
        System.out.println("\n---------------------------------\nSUBTOTAL: $"+df.format(priceSum)+
                "\nDISCOUNT: -$"+df.format(discountSum)+"\nTOTAL: $"+df.format(priceSum-discountSum));
    }

}
