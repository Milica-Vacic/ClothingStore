package Models.Products;
import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;

public class Shirt extends Product {
    public Shirt(String name, String brand, float price, String color, String size) throws IllegalArgumentException {
        super(name, brand, price, color, size);
    }

    @Override
    public boolean isSizeCorrect(String s) {
        ArrayList<String> correct= new ArrayList<>(Arrays.asList("XS", "S", "M", "L", "XL", "2XL" ));
        return correct.contains(s);
    }

    @Override
    public int findDiscount(int catAmount, LocalDateTime dateTime) {
        if (dateTime.getDayOfWeek()== DayOfWeek.TUESDAY && catAmount<=3) return 10;
        return super.findDiscount(catAmount, dateTime);
    }
}
