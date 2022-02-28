import java.lang.reflect.Array;

public class HomeWork {
    public static void main(String[] args) {
        solve1();
        System.out.println("-------------");
        solve2();
        System.out.println("-------------");
        solve3(6, 6);
        System.out.println("--------------");
        solve4();
        System.out.println("==========");
        picture2();
    }


    private static void solve1() {
        for (int y = 0; y < 3; y++) {
            for (int x = 0; x < 3; x++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void solve2() {
        for (int y = 0; y < 3; y++) {
            for (int x = 0; x < 3; x++) {
                if (y == 0 || y == 2 || x == 0 || x == 2) {
                    System.out.print("0 ");
                } else {
                    System.out.print("* ");
                }

            }
            System.out.println();

        }

    }

    public static void solve3(int y, int x) {
        for (int i = 0; i < y; i++) {
            for (int z = 0; z < x; z++) {
                if (i == 0 || i == (y - 1) || z == 0 || z == (x - 1)) {
                    System.out.print("0 ");
                } else {
                    System.out.print("* ");
                }

            }
            System.out.println();

        }
    }

    public static void solve4() {
        for (int y = 0; y < 3; y++) {
            for (int x = 0; x < 3; x++) {
                if ((y + x) % 2 == 0) {
                    System.out.print("0 ");
                } else {
                    System.out.print("* ");
                }

            }
            System.out.println();
        }
    }

    public static void picture2() {
        for (int y = 0; y < 6; y++) {
            for (int x = 0; x < 6; x++) {
                if (y == 0 || y == 5 || x == 0 || x == 5) {
                    System.out.print("* ");
                } else if (y == x) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}