package HomeWork4;

import java.util.Scanner;

public class Task3_5 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Введите день рождения ");
        int day= scan.nextInt();
        System.out.println("Месяц рождения");
        int month= scan.nextInt();
        System.out.println("Год рождения ");
        int year= scan.nextInt();
        System.out.println("Вывод:");
        if(day>=20&&month==1)
            System.out.println("Знак:водолей");
        else if (day<=19&&month==2)
            System.out.println("Знак:водолей");
        else if (day>=20&&month==2)
            System.out.println("Знак:рыбы");
        else if (day<=20&&month==3)
            System.out.println("Знак:рыбы");
        else if (day>=21&&month==3)
            System.out.println("Знак:овен");
        else if (day<=19&&month==4)
            System.out.println("Знак:овен");
        else if (day>=20&&month==4)
            System.out.println("Знак:телец");
        else if (day<=20&&month==5)
            System.out.println("Знак:телец");
        else if (day>=21&&month==5)
            System.out.println("Знак:близнецы");
        else if (day<=20&&month==6)
            System.out.println("Знак:близнецы");
        else if (day>=21&&month==6)
            System.out.println("Знак:рак");
        else if (day<=22&&month==7)
            System.out.println("Знак:рак");
        else if (day>=23&&month==7)
            System.out.println("Знак:лев");
        else if (day<=22&&month==8)
            System.out.println("Знак:лев");
        else if (day>=23&&month==8)
            System.out.println("Знак:дева");
        else if (day<=22&&month==9)
            System.out.println("Знак:дева");
        else if (day>=23&&month==9)
            System.out.println("Знак:весы");
        else if (day<=23&&month==10)
            System.out.println("Знак:весы");
        else if (day>=24&&month==10)
            System.out.println("Знак:скорпион");
        else if (day<=22&&month==11)
            System.out.println("Знак:скорпион");
        else if (day>=23&&month==11)
            System.out.println("Знак:стрелец");
        else if (day<=21&&month==12)
            System.out.println("Знак:стрелец");
        else if (day>=21&&month==12)
            System.out.println("Знак:козерог");
        else if (day<=19&&month==1)
            System.out.println("Знак:козерог");
        String[] yearsName = {"Крыса", "Бык", "Тигр", "Кролик", "Дракон", "Змея", "Лошадь", "Овца", "Обезьяна", "Петух", "Собака", "Свинья"};
        int yearStart = 2020;int index=0;
        if (year > yearStart) {
            index = (year - yearStart) % 12;
        }
        else {
            index=12-(yearStart-year)%12;
        }
        System.out.println("Год: "+yearsName[index]);
    }
}











