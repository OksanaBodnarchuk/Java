//Используя знания об операторе IF, напишите программу, которая выводит на экран большее из 3 чисел. Числа заданы в виде переменных num1, num2, num3.


public class Main {
    public static void main(String[] args) {

        double num1 = 5;
        double num2 = 5;
        double num3 = 5;

        //---------------------------

        if ((num1 > num2) && (num1 > num3)) {
            System.out.println("Максимальное число = " + num1);
        } else {
            if ((num2 > num1) && (num2 > num3)) {
                System.out.println("Максимальное число = " + num2);
            } else {
                System.out.println("Максимальное число = " + num3);
            }
        }
    }
}