package HomeWork5;

public class Task4_36 {
    /*Работа светофора для пешеходов запрограммирована следующим образом: в
начале каждого часа в течение трех минут горит зеленый сигнал, затем в течение двух минут — красный, в течение трех минут — опять зеленый и т. д.
Дано вещественное число t, означающее время в минутах, прошедшее с начала очередного часа. Определить, сигнал какого цвета горит для пешеходов в
этот момент.*/
    public static void main(String[] args) {
        double t=9.0;
        if((t%10==4||t%10==5||t%10==9||t/10==0))
            System.out.println("Red");
        else
            System.out.println("Green");


    }
}
