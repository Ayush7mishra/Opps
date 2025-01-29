package opps;

import java.util.Scanner;

public class que_one {
    public static void main (String[]args){

            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter shoe brand name:");
            String brand = scanner.nextLine();

            String slogan;
            switch (brand.toLowerCase()) {
                case "nike":
                    slogan = "Just do it";
                    break;
                case "adidas":
                    slogan = "Impossible is nothing";
                    break;
                case "puma":
                    slogan = "Forever Faster";
                    break;
                case "reebok":
                    slogan = "I Am What I Am";
                    break;
                default:
                    slogan = "Unknown brand";
                    break;
            }

            System.out.println("Brand Slogan: " + slogan);
            scanner.close();
        }
    }