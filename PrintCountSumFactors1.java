import java.util.Scanner;

public class PrintCountSumFactors1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, count = 0, sum = 0;

        System.out.print("Enter number: ");
        n = sc.nextInt();

        System.out.println("Factors are:");
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
                count++;
                sum = sum + i;
            }
        }

        System.out.println("\nCount of factors: " + count);
        System.out.println("Sum of factors: " + sum);
    }
}
