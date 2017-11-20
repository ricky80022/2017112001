import java.util.Scanner;

public class hw6 {
    public static void main(String[] args) {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int a1 = scn.nextInt();
        int a2 = scn.nextInt();
        int a3 = scn.nextInt();
        int v1 = a1 * 15 + a2 * 20 + a3 * 30;
        if (v1 < n) {
            int r = n - v1;
            int d50 = r / 50;
            r = r % 50;
            int d5 = r / 5;
            r = r % 5;
            int d1 = r / 1;
            r = r % 1;
            System.out.println(d1 + "\n" + d5 + "\n" + d50);


        } else if (v1 > n) {
            System.out.println(0);
        }
    }
}