package HomeWork4;

import java.util.Scanner;

public class Task3_3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Выберите животное 1-кошка,2-собака,3-корова,4-волк,5-утка,6-мышка,7-лягушка,8-козел,9-баран,10-змея");
        int number= scan.nextInt();
        switch (number) {
            case 1:
                System.out.println("Мяу");
                break;
            case 2:
                System.out.println("Гав");
                break;
            case 3:
                System.out.println("Му");
                break;
            case 4:
                System.out.println("Ауф");
                break;
            case 5:
                System.out.println("Кря");
                break;
            case 6:
                System.out.println("Пи");
                break;
            case 7:
                System.out.println("Ква");
                break;
            case 8:
                System.out.println("Ме");
                break;
            case 9:
                System.out.println("Бе");
                break;
            case 10:
                System.out.println("Шшш");
                break;
            default:
                System.out.println("Вы ввели что-то не то!");
        }
    }
}
