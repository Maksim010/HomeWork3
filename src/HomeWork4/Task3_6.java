package HomeWork4;

import java.util.Scanner;

public class Task3_6 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Введите год ");
        int number= scan.nextInt();
        if(number%4==0 && (number%100!=0 || number%400==0))
            System.out.println("366");
        else if (number%400==0)
            System.out.println("366");
        else
            System.out.println("365");

        }
    }

