import java.util.Scanner;

public class IncomeTax {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

	double salary,tax;
        System.out.println("Enter Annual Basic Salary: ");
        salary = sc.nextDouble();

     

        if (salary < 150000) {
            tax = 0;
        } 
        else if (salary <= 300000) {
            tax = salary * 0.20;
        } 
        else {
            tax = salary * 0.30;
        }

        System.out.println("Income Tax = " + tax);
    }
}



	
