import java.util.Scanner;
class Palindrome1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int temp = n, rev = 0;
        while (n > 0) {
            rev = rev * 10 + (n % 10);
            n = n / 10;
        }

        if (rev == temp)
            System.out.println("Palindrome Number");
        else
            System.out.println("Not Palindrome");
    }
}
