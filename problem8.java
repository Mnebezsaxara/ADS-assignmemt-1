import java.util.Scanner;
// Complexity: O(N)
public class problem8 {
    public static void digit_checker(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isDigit(s.charAt(i))) {
                count++;
            }
        }
        if (count > 0){
            System.out.println("No");
        }else{
            System.out.println("Yes");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        digit_checker(inputString);
        scanner.close();
    }
}
