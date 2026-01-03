import java.util.Scanner;
class Armstrong1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int temp = n, sum = 0, d;
        while (n > 0) {
            d = n % 10;
            sum = sum + d*d*d;
            n = n / 10;
        }

        if (sum == temp)
            System.out.println("Armstrong Number");
        else
            System.out.println("Not Armstrong Number");
    }
}
