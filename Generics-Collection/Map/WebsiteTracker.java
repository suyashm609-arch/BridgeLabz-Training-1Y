
import java.util.*;
public class WebsiteTracker {
    public static void main(String[] args) {
        String[] pages = {"home","about","home","contact"};
        Map<String,Integer> map = new HashMap<>();
        for(String p: pages)
            map.put(p, map.getOrDefault(p,0)+1);
        System.out.println(map);
    }
}
