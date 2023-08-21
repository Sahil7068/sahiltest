import java.util.Scanner;

public class maximumnum {


    public static void main(String[] args) {
        System.out.println("Enter the size of array: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        int arr[] = new int[n];

        System.out.println("Enter the vaules: ");
        for (int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        for (int i =0; i<n; i++){
            System.out.print(arr[i]);
            System.out.print(", ");
        }
        System.out.println();


        for (int i =0; i<n; i++){
            if (arr[i] > ans){
                ans = arr[i];
            }
        }

        System.out.println("The maximum number is " + ans);
    }
}
