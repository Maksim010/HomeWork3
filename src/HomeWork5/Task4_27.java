package HomeWork5;

import java.util.Scanner;

public class Task4_27 {
    public static void main(String[] args) {
        /*Дано трехзначное число. Выяснить, является ли оно палиндромом ("перевертышем"), т. е. таким числом, десятичная запись которого читается одинаково
слева направо и справа налево.*/
        Scanner scan=new Scanner(System.in);
        System.out.println("Введите 3-значное число ");
        int x= scan.nextInt();
        int x1=x%10;
        int x2=(x/10)%10;
        int x3=(x/100)%10;
        if(x1==x3)
            System.out.println(" палиндромом");
    }
}
