import java.util.Scanner;
public class MaxThree4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	System.out.println("Enter 3 number : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
	int m = a;
		if (b > m)
    		m = b;
		if (c > m)
   		m = c;
		System.out.println("Maximum3 = " + m);
		

}
}