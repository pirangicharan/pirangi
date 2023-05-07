import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class mapAndForeach {
    public static void main(String[] args) {

    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

    List<Integer> squares = numbers.stream()
            .map(n -> n * n)
            .collect(Collectors.toList());

            numbers.stream()
                    .forEach(x -> System.out.println(x*x))
                    ;

        System.out.println(squares);
}
}