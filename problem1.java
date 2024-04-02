import java.util.Scanner;
// Complexity: O(N)
public class problem1 {
    public static int min(int n, int[] arr) {
        if (arr == null || arr.length == 0) {
            System.out.println("Array is empty");
        }

        int min = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = scanner.nextInt();

        int[] array = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        int minEl = min(n, array);
        System.out.println(minEl);

        scanner.close();
    }
}
