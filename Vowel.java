import java.util.Scanner;
public class Vowel{
	public static void main(String[] args){
	char ch;
	Scanner sc = new Scanner(System.in);
	System.out.println("enter char : ");
	ch = sc.next().charAt(0);
	if(ch <= 'a' || ch <= 'z')
		if(ch == 'a' || ch == 'e' || ch == 'o' || ch == 'i' ||ch == 'u')
			System.out.println("CH is vowel ");
		else
			System.out.println("CH is consonant ");
	else
		System.out.println("CH is not lowercase ");

			
}
}	