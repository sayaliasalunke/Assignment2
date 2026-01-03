import java.util.Scanner;

public class CountFactors1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, count = 0;

        System.out.print("Enter number: ");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }

        System.out.println("Number of factors: " + count);
    }
}
