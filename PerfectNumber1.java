import java.util.Scanner;

public class PerfectNumber1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, sum = 0;

        System.out.print("Enter number: ");
        n = sc.nextInt();

        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum = sum + i;
            }
        }

        if (sum == n) {
            System.out.println("Perfect number");
        } else {
            System.out.println("Not a perfect number");
        }
    }
}
