
import java.util.*;
public class WordFrequency {
    public static void main(String[] args) {
        String s = "Java is fun and Java is powerful".toLowerCase();
        Map<String,Integer> map = new HashMap<>();
        for(String w: s.split(" "))
            map.put(w, map.getOrDefault(w,0)+1);
        System.out.println(map);
    }
}
