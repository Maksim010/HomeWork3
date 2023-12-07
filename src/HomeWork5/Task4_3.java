package HomeWork5;

import java.util.Scanner;
//Определить, в какую из областей — I или II (рис. 4.1) — попадает точка с заданными координатами. Для простоты принять, что точка не попадает на границу областей.


public class Task4_3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Введите координаты ");
        int x= scan.nextInt();
        int y= scan.nextInt();
        if(x>4)
            System.out.println("2 область");
        else
            System.out.println("1 область");

    }
}
