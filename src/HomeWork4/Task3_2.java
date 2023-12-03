package HomeWork4;

import java.util.Scanner;

public class Task3_2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Введите который час ");
        int number= scan.nextInt();
        if(number>=8&&number<=12)
            System.out.println("Доброе утро");
        else if (number>12&&number<=19)
            System.out.println("Добрый день");
        else if (number>19&&number<=23)
            System.out.println("Добрый вечер");
        else
            System.out.println("Доброй ночи");


        }

    }
