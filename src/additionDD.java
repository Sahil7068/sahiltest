import java.util.Scanner;

public class additionDD {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first r1");
        int r1 = sc.nextInt();
        System.out.println("Enter the first c1");
        int c1 = sc.nextInt();

        int arr[][] = new int[r1][c1];

        for (int i =0; i<r1; i++){
            for (int j =0; j<c1; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i =0; i<r1; i++){
            for (int j =0; j<c1; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Enter the first r2");
        int r2 = sc.nextInt();
        System.out.println("Enter the first c2");
        int c2 = sc.nextInt();

        int arr1[][] = new int[r2][c2];

        for (int i =0; i<r2; i++){
            for (int j =0; j<c2; j++){
                arr1[i][j] = sc.nextInt();
            }
        }

        for (int i =0; i<r2; i++){
            for (int j =0; j<c2; j++){
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }


        if (r1!=r2 || c1!=c2){
            System.out.println("Addition not possible");
        }

        int sum[][] = new int[r1][c1];
        for (int i=0; i<r1; i++){
            for (int j=0; j<c1; j++){
                sum[i][j] = arr[i][j] + arr1[i][j];
            }
        }
        for (int i =0; i<r1; i++){
            for (int j =0; j<c1; j++){
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }


    }
}
