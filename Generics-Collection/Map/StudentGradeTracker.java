
import java.util.*;
public class StudentGradeTracker {
    public static void main(String[] args) {
        Map<String, Double> map = new TreeMap<>();
        map.put("Aman", 85.0);
        map.put("Riya", 90.0);
        map.put("Karan", 70.0);
        map.put("Aman", 88.0);
        map.remove("Karan");
        for (var e : map.entrySet()) System.out.println(e);
    }
}
