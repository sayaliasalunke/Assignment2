//10. Write a program to find sum of x to y (both inclusive)
import java.util.Scanner;
public class Sumxtoy{

	public static void main(String[] args){
	int x,y,sum = 0;
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter value of x : ");
	x = sc.nextInt();

	System.out.println("Enter value of y : ");
	y = sc.nextInt();

	for(int i = x; i <= y;i++ ){
	sum += i;
	}	
	System.out.println("Sum of x to y : "+sum);


	}
}