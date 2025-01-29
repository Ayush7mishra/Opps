package opps;

import java.util.Scanner;

public class salary {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the basic salary");
        double basicSalary=sc.nextDouble();
        double salary=basicSalary *0.12;

        System.out.println(" Provident found amount:" + salary);
        sc.close();
    }
}
