public class max {

    public static void main(String[] args) {
        int arr[] = {5, 56, 78};
        int ans = 0;
        for (int i =0; i<arr.length; i++){
            if (arr[i] > ans){
                ans = arr[i];
            }
        }
        System.out.println("The greatest number is " + ans);
    }
}
