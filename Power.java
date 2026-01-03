import java.util.Scanner;

public class Power {
    public static void main(String[] args) {

        int x, n;
        long result = 1;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of x: ");
        x = sc.nextInt();

        System.out.print("Enter value of n: ");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            result = result * x;
        }

        System.out.println(x + "^" + n + " = " + result);
    }
}
