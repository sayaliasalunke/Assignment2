import java.util.Scanner;
class CountDigits1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int even = 0, odd = 0, zero = 0, d;

        while (n > 0) {
            d = n % 10;
            if (d == 0)
                zero++;
            else if (d % 2 == 0)
                even++;
            else
                odd++;
            n = n / 10;
        }

        System.out.println("Even digits = " + even);
        System.out.println("Odd digits = " + odd);
        System.out.println("Zero digits = " + zero);
    }
}
