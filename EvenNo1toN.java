import java.util.Scanner;
public class EvenNo1toN{

	public static void main(String[] args){

	Scanner sc = new Scanner(System.in);
	System.out.println("Enter n: ");
	int n = sc.nextInt();
	
	for(int i = 0; i<=n; i+=2){
	System.out.println(i);
	}
	
	}
}