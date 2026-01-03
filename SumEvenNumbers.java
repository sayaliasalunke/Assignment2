import java.util.Scanner;

public class SumEvenNumbers {
    public static void main(String[] args) {

        int x, y, sum = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of x: ");
        x = sc.nextInt();

        System.out.print("Enter value of y: ");
        y = sc.nextInt();

        for (int i = x; i <= y; i++) {
            if (i % 2 == 0) {
                sum = sum + i;
            }
        }

        System.out.println("Sum of even numbers from " + x + " to " + y + " is: " + sum);
    }
}
