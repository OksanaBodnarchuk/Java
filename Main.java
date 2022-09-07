public class Main {
    public static void main(String[] args) {

        //С использованием цикла while написать метод, печатающий куб числа от 0 до данного чисда n.
        //Пример: на входе n=3  на выходе 0,1,8,27

        int num = 3;
        int num1 = 0;
        //------------------

        while (num1 <= num) {
            System.out.printf((num1 * num1 * num1) + " ");
            num1 += 1;
        }

        System.out.println();
        System.out.println("----------------------------");


        //С использованием цикла while написать метод, печатающий результат  умножения данного числа n  на все целые числа от 0 до n..
        //Пример: на входе n=3  на выходе 0,3,6,9

        int num2 = 3;
        int num3 = 0;

        //--------------------

        while (num3 <= num2) {
            System.out.printf("%d * %d = %d%n", num2, num3, num2 * num3);
            num3 += 1;
        }


    }
}