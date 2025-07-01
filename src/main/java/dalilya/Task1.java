package dalilya;

import java.util.Stack;

public class Task1 {
    public static void main(String[] args) {
        int[] temperatures = {17, 16, 19, 15, 13, 18, 20};
        int[] result = dailyTemperatures(temperatures);

        System.out.print("Количество суток до более тёплого дня:\n");
        for (int num : result) {
            System.out.print(num + "    ");
        }
    }

    public static int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < temperatures.length; i++) {
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                int prevIndex = stack.pop();
                result[prevIndex] = i - prevIndex;
            }
            stack.push(i);
        }

        return result;
    }
}