public class Sumeven1to10{

	public static void main(String[] args){
	
	int sum = 0;
	for(int i = 0; i <= 10; i+=2){
	sum += i;
	}
	System.out.print("Sum of even numbers 1 to 10 :" + sum);

	}
}