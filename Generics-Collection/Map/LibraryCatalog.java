
import java.util.*;
public class LibraryCatalog {
    public static void main(String[] args) {
        Map<String,String> map = new TreeMap<>();
        map.put("101","Java");
        map.put("102","DSA");
        System.out.println(map.getOrDefault("101","Not found"));
        map.remove("102");
        System.out.println(map);
    }
}
