package opps;

import java.sql.SQLOutput;
import java.util.Scanner;

public class fact {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the fact nu");
        int num = scanner.nextInt();
        double factorial =1;
        for(int i=1;i<num;i++) {
            factorial *= i;
        }
        System.out.println("factorial of"+num+ " is " +factorial );
        scanner.close();

        }
    }

