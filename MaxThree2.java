import java.util.Scanner;
public class MaxThree2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	System.out.println("Enter 3 number : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
	
        		if (a >= b && a >= c)
            		System.out.println("Maximum1 = " + a);
        	else if (b >= a && b >= c)
            		System.out.println("Maximum1 = " + b);
        	else
            		System.out.println("Maximum1 = " + c)
	

    }
}