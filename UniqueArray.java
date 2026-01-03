import java.util.Scanner;

public class UniqueArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];


        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        
        int[] unique = new int[n];
        int k = 0;

        for (int i = 0; i < n; i++) {
            boolean found = false;

            for (int j = 0; j < k; j++) {
                if (arr[i] == unique[j]) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                unique[k++] = arr[i];
            }
        }

       
        System.out.print("Unique array: ");
        for (int i = 0; i < k; i++) {
            System.out.print(unique[i] + " ");
        }
    }
}
