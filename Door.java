import java.util.Scanner;

public class Door {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter length of room: ");
        double l = sc.nextDouble();

        System.out.print("Enter breadth of room: ");
        double b = sc.nextDouble();

        System.out.print("Enter height of room: ");
        double h = sc.nextDouble();


        System.out.print("Enter door length: ");
        double dl = sc.nextDouble();

        System.out.print("Enter door breadth: ");
        double db = sc.nextDouble();

        
        System.out.print("Enter window length: ");
        double wl = sc.nextDouble();

        System.out.print("Enter window breadth: ");
        double wb = sc.nextDouble();


        double wallArea = 2 * h * (l + b);
        double doorArea = dl * db;
        double windowArea = wl * wb;

        double paintArea = wallArea - (doorArea + 2 * windowArea);
        double whitewashArea = l * b;


        System.out.println("\nArea to be painted (walls): " + paintArea);
        System.out.println("Area to be whitewashed (roof): " + whitewashArea);

        sc.close();
    }
}