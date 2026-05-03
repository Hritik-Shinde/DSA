package StreamApi;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;


public class StreamApis {

    static List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

    public void sum() {

    int evensum = numbers.stream()
            .filter(n -> n % 2 == 0)
            .mapToInt(n -> n * 2)
            .sum();
    System.out.println("even sum is "+evensum);
}

    static List<String> fruits = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");
    static List<String> fruitsWithB = fruits.stream()
            .filter(n -> n.startsWith("b") && n.length() > 5)
            .collect(Collectors.toList());

    static List<String> names = Arrays.asList("John", "Alice", "Bob");
    static List<String> namesWithB = names.stream().map(String::toUpperCase)
            .collect(Collectors.toList());


    static List<Integer> numberss = Arrays.asList(10, 20, 35, 50, 50, 12, 45);
    static int secondLargest =
            numberss.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(null);


    static List<String> items = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");
    static Map<String, Long> map = items.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));


    static String input = "javaprogramming";
    static Map<Character,Long> numbersMap = input.chars()
            .mapToObj(c -> (char) c)
            .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

    static List<Integer> numb = Arrays.asList(1, 2, 3, 4, 5, 6);
    static Map<Boolean,List<Integer>> evenOdd = numb.stream().collect(Collectors.partitioningBy(n -> n%2==0));

//    static List<Integer> doSum = Arrays.asList(1, 2, 3, 4, 5);
//    static Integer sum = doSum.stream()
//            .mapToInt(Integer::intValue).sum();
//
//    static Double avrage = doSum.stream()
//            .mapToInt(Integer::intValue).sum().average().getAsDouble();

    public static void main(String[] args) {
        StreamApis streamApis = new StreamApis();
        streamApis.sum();

        System.out.println(fruitsWithB);

        System.out.println(namesWithB);

        System.out.println(secondLargest);

        System.out.println(map);

        System.out.println(numbersMap);

        System.out.println(evenOdd);
//
//        System.out.print(sum);
//
//        System.out.println(avrage);
    }
}
