
import java.util.*;
public class ShoppingCart {
    public static void main(String[] args) {
        Map<String,Double> map = new LinkedHashMap<>();
        map.put("Phone",3000.0);
        map.put("Laptop",4000.0);
        double total=0;
        for(double v: map.values()) total+=v;
        if(total>5000) total*=0.9;
        System.out.println(total);
    }
}
