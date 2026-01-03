import java.util.Scanner;
public class MaxThree3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	int a,b,c;
	System.out.println("Enter 3 number : ");
         a = sc.nextInt();
         b = sc.nextInt();
         c = sc.nextInt();
	
	if (a > b) {
    			if (a > c)
        			System.out.println("Maximum2 = " + a);
    			else
        			System.out.println("Maximum2 = " + c);
			} 
		else {
    			if (b > c)
        			System.out.println("Maximum2 = " + b);
    			else
        			System.out.println("Maximum2 = " + c);
			}
	
}
}