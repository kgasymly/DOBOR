package tanya;

import java.util.HashMap;
import java.util.Map;

public class Task5 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 4, 5, 6, 7, 7, 7};
        findDuplicates(numbers);
    }

    public static void findDuplicates(int[] numbers) {
        Map<Integer, Integer> countMap = new HashMap<>();

        for (int number : numbers) {
            countMap.put(number, countMap.getOrDefault(number, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " - " + entry.getValue() + " штуки");
            }
        }
    }
}