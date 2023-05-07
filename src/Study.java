import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Study {
    public static void main(String[] args) {

        Map<String,Integer> marks = new HashMap<>();
        marks.put("Ram",100);
        marks.put("Laxman",90);
        marks.put("Bharath",80);
        marks.put("Shathrugn",70);
        marks.put("Hanuman",60);

        List<String> names = Arrays.asList("klice", "zob", "Charlie");

        // Using a lambda expression to sort the list
        names.sort((s1, s2) -> s1.compareTo(s2));
        System.out.println(names); // Output: [Alice, Bob, Charlie]

        // Using a method reference to sort the list
        names.sort(String::compareTo);
        System.out.println(names); // Output: [Alice, Bob, Charlie]



    }
}