import java.util.Scanner;

public class Casecheck{


	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	char ch;
	System.out.println("Enter the character: ");
	ch = sc.next().charAt(0);
	
	if(ch >= 48 && ch <= 58)
		System.out.println(ch + "It is a digit");
	else if(ch >= 97 && ch <= 122)
		System.out.println("It is a lowercase");
	else if(ch >= 65 && ch <= 90)
		System.out.println("It is a uppercase");

}
}