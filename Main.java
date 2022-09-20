public class Main {
    public static void main(String[] args) {

        /*Дан массив int. Реализовать метод, который считает сумму положительных  элементов массива.{3, 2, -1, 5, -3} ->10*/

        int[] arr = {3, 2, -1, 5, -3};
        sum(arr);
    }

    public static void sum(int[] arr) {
        int arrSum = 0;
        for (int i = 0; i < arr.length; i+=1) {
            if (arr[i] > 0) {
                arrSum += arr[i];
            }
        }
        System.out.println(arrSum);
    }
}