import java.util.Scanner;
public class Sum1toN{

	public static void main(String[] args){
	int n,sum = 0;

	
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter n : ");	
	n = sc.nextInt();
	
	System.out.println("Enter n : ");

	for(int i = 1; i <= n; i++){
		sum += i;
		}
	System.out.println("sum of N numbers : "+sum);
	
	}
}
 

 

 
