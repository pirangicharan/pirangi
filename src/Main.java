import java.lang.reflect.Array;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {

        String string = "mynameisramcharan";
        /*Occurrence or duplicates of the string*/
        Map<String, Long> occurrences = Arrays.stream(string.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(occurrences);

        /*Occurrence or duplicates of the string*/
        List<String> duplicateKeys = Arrays.stream(string.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .filter(n -> n.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
        System.out.println(duplicateKeys);

        /*Find first non-repetitive letter from the string.
        To get the sequential order according to the string, Use LinkedHashMap while grouping*/
        String getFirstNonRepeatedLetter = Arrays.stream(string.split(""))
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        LinkedHashMap::new,
                        Collectors.counting()
                ))
                .entrySet()
                .stream()
                .filter(n -> n.getValue() == 1)
                .findFirst().get().getKey();
        System.out.println("First non repetitive letter: " + getFirstNonRepeatedLetter);

        // Second-highest number
        int[] integer = {5,7,90,43,34,55};
        Integer secondHighestValue = Arrays.stream(integer).boxed()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .get();
        // .collect(Collectors.toList());
        System.out.println(secondHighestValue);

        // Lengthiest name
        String[] names = {"ramcharan","laxmidurga","srinivasarao","bhanurekha"};
        String longestName = Arrays.stream(names)
                .reduce((name1, name2) -> name1.length() > name2.length() ? name1 : name2)
                .get();
        System.out.println(longestName);

        Map<Integer, List<String>> collect = Arrays.stream(names)
                .collect(Collectors.groupingBy(String::length));
        System.out.println(collect);

    }
}