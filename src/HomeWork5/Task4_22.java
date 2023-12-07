package HomeWork5;

import java.util.Scanner;
/*Дано натуральное число. Определить:
        а) является ли оно четным;
        б) оканчивается ли оно цифрой 7*/
public class Task4_22 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Введите натуральное число ");
        int x= scan.nextInt();
        int y=x%10;
        if(y%2==0)
            System.out.println("Четное");
        else if (y%2!=0)
            System.out.println("Не четное");
        if(y==7)
            System.out.println("Заканчивается на 7");

    }
}
