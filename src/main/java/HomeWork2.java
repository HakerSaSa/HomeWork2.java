import java.util.Arrays;

public class HomeWork2 {
    public static void main(String[] args) {
      // Array();
        //mathArray();
        reversArray();
    }

    public static void Array() {
      int[] arr = {1, 0, 0, 1, 0, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            }else if (arr[i] == 1){
                arr[i] = 0;
            }
            System.out.print(arr[i]);
        }
    }

    public static void mathArray() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println(arr);
    }
    public static void reversArray() {
    int[] arr = {1, 4, 7, 9, 11, 3, 10, 5, 2, 6, 8};
    System.out.println(Arrays.toString(arr));
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] <= 6) {
            arr[i] = arr[i] * 2;
            System.out.print(arr[i]);
        }
    }
}




}

