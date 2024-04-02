import java.util.Scanner;
// Complexity: O(N)
public class problem2 {
    public static float average(int n, int[] arr) {
        if (arr == null || arr.length == 0) {
            System.out.println("Array is empty");
        }
        float sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        return sum / n;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] array = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        float average = average(n, array);
        System.out.println("Average is: "+ average);

        scanner.close();
    }
}
