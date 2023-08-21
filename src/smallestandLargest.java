import java.util.Arrays;
import java.util.Scanner;

public class smallestandLargest {
    public static void main(String[] args) {
        System.out.println("Enter the size of array: ");
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int n = sc.nextInt();
        int arr[] = new int[n];



        System.out.println("Enter the values: ");

        for (int i =0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]);
        }
        System.out.println();

        Arrays.sort(arr);

        for (int i =0; i<n; i++){
            System.out.println(arr[i]);
        }
    }
}
