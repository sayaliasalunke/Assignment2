import java.util.Scanner;
public class EvenXtoY{
	public static void main(String[] args){
	
	Scanner sc = new Scanner(System.in);
	int x,y;
	
	System.out.println("enter x : ");
	x = sc.nextInt();

	System.out.println("enter y : ");
	y = sc.nextInt();
	
	System.out.println("Even numbers to " + x + " to " + y + " :");
	for(int i = x; i <= y; i+=2){
		System.out.println(i);
		}
		

	}
}


