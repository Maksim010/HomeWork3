package HomeWork4;

import java.util.Scanner;

public class Task3_12 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Введите 6-значное число ");
        int number= scan.nextInt();
        int first=number%10;
        int second=(number/10)%10;
        int third=(number/100)%10;
        int fourth=(number/1000)%10;
        int fives=(number/10000)%10;
        int sixth=(number/100000)%10;
        if((first+second+third)==(fourth+fives+sixth))
            System.out.println("Да,счастливый!");
        else
            System.out.println("Не счастливый");


    }
}
