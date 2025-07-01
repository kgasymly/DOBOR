import java.util.PriorityQueue;

public class Task2 {
    private final PriorityQueue<Integer> minHeap;
    private final int k;

    public Task2(int k, int[] nums) {
        this.k = k;
        this.minHeap = new PriorityQueue<>();
        for (int num : nums) {
            add(num);
        }
    }

    public int add(int val) {
        minHeap.offer(val);
        if (minHeap.size() > k) {
            minHeap.poll();
        }
        return minHeap.peek();
    }

    public static void main(String[] args) {
        int[] nums = {4, 5, 8, 2};
        int k = 3;
        Task2 kthLargest = new Task2(k, nums);

        System.out.println(kthLargest.add(3));   // Вывод: 4
        System.out.println(kthLargest.add(5));   // Вывод: 5
        System.out.println(kthLargest.add(10));  // Вывод: 5
        System.out.println(kthLargest.add(9));   // Вывод: 8
    }
}