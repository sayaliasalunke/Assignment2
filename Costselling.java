import java.util.Scanner;
public class Costselling{
	public static void main(String[] args){
	double sp,cp,profit,loss;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the selling price : ");
	sp = sc.nextDouble();
	System.out.println("Enter the cost price : ");
	cp = sc.nextDouble();
	profit = sp - cp;
	loss = cp - sp;
	if(sp>cp)
		System.out.println(" the profit is  : "+profit);
	else
		System.out.println(" the loss is  : "+loss);
		

}
}