import java.util.Scanner;

public class takeinput {

    static void printArr(int[] arr){
        for (int i =0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("Enter the size of array ");
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter the values of the array ");
        for (int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        for (int i =0; i<n; i++){
            System.out.print(arr[i]);

        }

        System.out.println();

        for (int i =0; i<n; i++){
            sum = sum +arr[i];

        }
        System.out.println(sum);


    }
}
