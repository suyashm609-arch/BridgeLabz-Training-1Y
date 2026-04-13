
import java.util.*;
public class VotingSystem {
    public static void main(String[] args) {
        Map<String, Integer> votes = new HashMap<>();
        String[] arr = {"A","B","A","C","A","B","C","A","B","A"};
        for(String v : arr)
            votes.put(v, votes.getOrDefault(v,0)+1);
        System.out.println(votes);
    }
}
