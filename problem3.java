import java.util.Scanner;
// Complexity: O(sqrt(N))
public class problem3 {
    public static void prime(int n) {
        if (n <= 1) {
            System.out.println("Number can't be prime");
            return;
        }

        int count = 0;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                count++;
                break; 
            }
        }

        if (count == 0) {
            System.out.println("Prime");
        } else {
            System.out.println("Composite");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        prime(n);
        scanner.close();
    }
}
