import java.util.Scanner;

public class hw5 {
    public static void main(String[] args) {
        // write your code here
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        int key = scn.nextInt();
        int length = str.length(),sum=0;
        for (int i = 0; i < length; i++) {
            sum = sum+(str.charAt(i)-'0');
        }
        System.out.println(sum);
    }
}
