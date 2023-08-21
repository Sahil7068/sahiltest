import java.util.Arrays;
import java.util.Scanner;

public class clonearr {

    static void printArr(int [] arr){
        for (int i =0; i<arr.length; i++){
            System.out.print(arr[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("Enter the size of array ");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[] = new int[n];

        for (int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        printArr(arr);

        int arr2[] = Arrays.copyOf(arr, arr.length);
        System.out.println("copied array ");
        printArr(arr2);


    }
}
