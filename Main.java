public class Main {

    //Дан массив целых чисел. Реализовать метод, который возвращает минимальное значение в данном массиве. Например: {1,3,6,-1,4,-5,9} -> -5
    public static void main(String[] args) {

        int[] array = {1, 3, 6, -1, 4, -5, 9};
        System.out.println(numberMax(array));
    }

    public static int numberMax(int[] number) {
        int min = number[0];

        for (int i = 0; i < number.length; i += 1) {

            if (number[i] < min) {
                min = number[i];
            }
        }
        return min;
    }
}

