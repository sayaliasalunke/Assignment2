import java.util.Scanner;

public class HelloNtimes {
    public static void main(String[] args) {

        int n, i, j;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for (i = 1; i <= n; i++) {
            for (j = 1; j <= n; j++) {
                System.out.print("Hello");
            }
            System.out.println(); 
        }
    }
}
