import java.util.Scanner;

public class PrintDigits {
    public static void main(String[] args) {

        int n, rem;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        n = sc.nextInt();

        System.out.println("Digits are:");

        while (n > 0) {
            rem = n % 10;
            System.out.println(rem);
            n = n / 10;
        }
    }
}
