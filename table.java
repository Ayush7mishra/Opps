package opps;

import java.util.Scanner;

public class table {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the table that you want enter:");
        int num=sc.nextInt();

        for(int i=0;i<=10;i++){
            System.out.println(num + "*" +i+ "=" + (num * i));
        }
        sc.close();
    }
}
