package HomeWork5;

import java.util.Scanner;
/*Дано трехзначное число. Определить, равен ли квадрат этого числа сумме кубов его цифр.*/

public class Task4_9 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Введите 3-значное число ");
        int x= scan.nextInt();
        int x1=x/10;
        int x2=x%10;
        int x3=(x/10)%10;
        if((Math.pow(x,2))==(Math.pow(x1,3))+Math.pow(x2,3)+Math.pow(x3,3))
            System.out.println("Равны");
        else
            System.out.println("Не равны");

    }
}
