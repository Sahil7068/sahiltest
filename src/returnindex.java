public class returnindex {

    public static void main(String[] args) {
        int arr[] = {1, 4 ,6};
        int x = 4;
        int ans = -1;

        for (int i =0; i<arr.length; i++){
            if (x == arr[i]){
                ans = i;
                break;
            }

        }

        System.out.println("The number is at index " + ans);

    }
}
