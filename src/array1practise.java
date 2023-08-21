import java.util.Scanner;

public class array1practise {

    public static void main(String[] args) {
        System.out.println("Enter the numbers");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int g[] = new int[n];

        for(int i =0; i<g.length; i++){
            g[i] = sc.nextInt();
        }
        for (int i =0; i<g.length; i++){
            sum = sum + g[i];
        }
        System.out.println(sum);
    }
}
