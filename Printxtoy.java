import java.util.Scanner;
public class Printxtoy{
	public static void main(String[] args){
	int x,y;
	
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter value of x : ");
	x = sc.nextInt();
	
	System.out.println("Enter value of y : ");
	y = sc.nextInt();

	System.out.println("Printing value of x to y : ");

	for(int i = x; i <= y; i++){
		System.out.println(i);
		}
	
	}
}
