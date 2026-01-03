import java.util.Scanner;
public class Divisibleby5and7{
	public static void main(String args[]){
	int num;
	Scanner sc = new Scanner(System.in);
	System.out.println("ENTER THE NO: ");
	num = sc.nextInt();
	if(num % 5 == 0 || num % 7 == 0)
		System.out.println("NO is divisible by 5 or 7");
	else
		System.out.println("NO is not divisible by 5 or 7");

}
}