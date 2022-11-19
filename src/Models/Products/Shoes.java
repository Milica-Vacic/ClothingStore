package Models.Products;
import java.time.DayOfWeek;
import java.time.LocalDateTime;

public class Shoes extends Product {

    public Shoes(String name, String brand, float price, String color, String size) throws IllegalArgumentException {
        super(name, brand, price, color, size);
    }

    @Override
    public boolean isSizeCorrect(String s) {
        try {
            int parsed=Integer.parseInt(s);
            return parsed >= 39 && parsed <= 46;
        }
        catch (NumberFormatException e){
            return false;
        }
    }

    @Override
    public int findDiscount(int catAmount, LocalDateTime dateTime) {
        if (dateTime.getDayOfWeek()== DayOfWeek.TUESDAY) return 25;
        else return super.findDiscount(catAmount, dateTime);
    }

}
