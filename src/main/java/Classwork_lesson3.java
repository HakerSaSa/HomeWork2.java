import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Classwork_lesson3 {
    public static void main(String[] args) {
        String s[] = {"first", "second", "third"};
        printArr(s);
        System.out.println(Arrays.toString(s));
        int[][] arr = new int[3][3];
        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[0][2] = 3;
        arr[1][0] = 4;
        arr[1][1] = 5;
        arr[1][2] = 6;
        arr[2][0] = 7;
        arr[2][1] = 8;
        arr[2][2] = 9;
        arr2d(arr);
        System.out.println("===================");
        reversarr2d(arr);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please write something here>>>>> ");
        String enter = scanner.nextLine();
        System.out.println("\n You say " + enter);
        Random random = new Random();
        System.out.println(random.nextInt(100) - 100);
        System.out.println((int)(Math.random() * 10000000));
    }

    static void arr2d(int[][] arr) {
        for (int y = 0; y < arr.length; y++) {
            for (int x = 0; x < arr.length; x++) {
                System.out.print(arr[y][x] + "  ");
            }
            System.out.println();
        }
    }

    static void reversarr2d(int[][] arr) {
        for (int y = arr.length - 1; y >= 0; y--) {
            for (int x = arr.length - 1; x >= 0; x--) {
                System.out.print(arr[y][x] + "  ");
            }
            System.out.println();
        }
    }

    static void printArr(String[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

}



