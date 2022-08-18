public class Main {
    public static void main(String[] args) {
        //Допустим, у вас есть прибор, у которого есть 3 колбы. Каждая колба имеет датчик температуры. Считается, что прибор работает правильно, если температура в каждой из трех колб не меньше 100 или есть такая колба, температура которой более 200 градусов. Напишите программу проверки корректности работы такого прибора.

        int flask1 = 160;
        int flask2 = 50;
        int flask3 = 30;

        //-------------------------------------------

        //прибор работает коректно, если первая, вторая и третья колба не менее 100 градусов или есть колба больше 200 градусов
        boolean runCorrect1 = flask1 > 100 & flask2 > 100 & flask3 > 100 | flask1 > 200 | flask2 > 200 | flask3 > 200;

        //-------------------------------------------

        System.out.println("Temperature of the first flask is: " + flask1);
        System.out.println("Temperature of the second flask is: " + flask2);
        System.out.println("Temperature of the third flask is: " + flask3);

        System.out.println("--------------------------------");


        System.out.println("The device1 is working correct - " + runCorrect1);

        //Допустим, у вас есть прибор, у которого есть 3 колбы. Каждая колба имеет датчик температуры. Считается, что прибор работает правильно, если температура в одной из трех колб (не известно в какой) температура более 150 градусов, а в остальных менее100 градусов, и при этом сумма температур всех трех колб не превышает 250 градусов.

        System.out.println("-----------------------------------------");

        boolean runCorrect2 = ((flask1 > 150 & flask2 < 100 & flask3 < 100) | (flask2 > 150 & flask1 < 100 & flask3 < 100) | (flask3 > 150 & flask1 < 100 & flask2 < 100)) & ((flask1 + flask2 + flask3) < 250);

        System.out.println("The device2 is working correct - " + runCorrect2);

    }


}