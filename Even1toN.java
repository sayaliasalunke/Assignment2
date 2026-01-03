import java.util.Scanner;
public class Even1toN{
	public static void main(String[] args){

	Scanner sc = new Scanner(System.in);
	int n;
	System.out.println("enter number: ");
	n = sc.nextInt();
	
	
	System.out.println("Even numbers 1 to " + n + " are : ");
	for(int i = 1; i <= n; i+=2){
		System.out.println(i);

		}


	}	
}