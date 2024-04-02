import java.util.Scanner;

public class problem3 {
    public static void prime(int n) {
        if (n <= 1) {
            System.out.println("Number can't be prime");
        }
        int count=1;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count+=1;
            }
        }
        if(count>2){
            System.out.println("Composite");
        }
        else{
            System.out.println("Prime");
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

