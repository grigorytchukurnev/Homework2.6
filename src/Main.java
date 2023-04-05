import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        task1(nums);
        task2(nums);

        List<String> words = new ArrayList<>(List.of("table", "ball", "sport", "ball", "head"));
        task3(words);
        task4(words);
    }

    public static void task1(List<Integer> nums){
        for (Integer integer : nums) {
            if (integer % 2 == 1){
                System.out.println(integer);
            }
        }
        System.out.println("------------------------");
    }
    public static void task2(List<Integer> nums){
        Set<Integer> alreadyPrintedNumbers = new HashSet<>();

        for (Integer integer : nums) {
            if (!alreadyPrintedNumbers.contains(integer)){
                if (integer % 2 == 0){
                    System.out.println(integer);
                    alreadyPrintedNumbers.add(integer);
            }
        }
    }
        System.out.println("------------------------");
    }
    public static void task3(List<String> words) {
        Set<String> uniqueWords = new HashSet<>(words);
        System.out.println(uniqueWords);
        System.out.println("------------------------");

    }

    public static void task4(List<String> words) {
        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            if (map.containsKey(word)){
                map.put(word,map.get(word)+1);
            }else {
                map.put(word, 1);
            }
        }

        for (String key : map.keySet()){
            System.out.println("Слово " + key + " встречается " + map.get(key) + " раз.");
        }

    }
}