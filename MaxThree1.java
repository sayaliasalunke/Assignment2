import java.util.Scanner;
public class MaxThree2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	System.out.println("Enter 3 number : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
	int ch;
	switch(ch){
        case 1 : 
		if (a >= b && a >= c)
            		System.out.println("Maximum1 = " + a);
        	else if (b >= a && b >= c)
            		System.out.println("Maximum1 = " + b);
        	else
            		System.out.println("Maximum1 = " + c);
		break;
	case 2 : 
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
		break;
	case 3 : 
		int max = a;
		if (b > max)
    		max = b;
		if (c > max)
   		max = c;
		System.out.println("Maximum3 = " + max);
		break;
	case 4 :
		int max = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
		System.out.println("Maximum4 = " + max);
		break;

	

	}
    }
}