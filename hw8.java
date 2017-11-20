import java.util.Scanner;

public class hw8 {
    public static void main(String[] args) {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int v1 = scn.nextInt();
        boolean flag =true;
        int i=2;
        while (i<v1/2&& flag){
            if(v1% i==0){
                flag = false;
            }
            i++;
        }
        if(flag==true) {
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
