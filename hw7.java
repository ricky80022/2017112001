import java.util.Scanner;

public class hw7 {
    public static void main(String[] args) {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int v1 = scn.nextInt();
        int tmp = 0;
        String str = "";
        if (v1 < 0) {
            tmp = 128 + v1;
        } else {
            tmp = v1;
        }
        while (v1 > 1) {
            str = Integer.toString(tmp % 2) + str;
            tmp = tmp / 2;
        }
        str = Integer.toString(tmp) + str;
        for (int i = 0; i < 7 - str.length(); i++) {
            str = "0" + str;
        }
        if (v1 < 0) {
            str = "1" + str;
        }else{
                str = "0" + str;
            }
        System.out.println(str);
        }
    }

