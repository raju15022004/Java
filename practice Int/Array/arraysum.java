
public class arraysum {
    public static void main(String[] args) {
        int[] arr = {5, 10, 15, 20};
        int sum = 1;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        System.out.println("Sum = " + sum);
    }
}

