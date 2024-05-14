public class maxnum{
    public static void main(String[] args) {
        int[] numbers = {10, 5, 8, 20, 15};
        int max = findMax(numbers);
        System.out.println("Maximum number in the array: " + max);
    }

    public static int findMax(int[] arr) {
        int max = Integer.MIN_VALUE; // Initialize max with the smallest possible integer value
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
}
