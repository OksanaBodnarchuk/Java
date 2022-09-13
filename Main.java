public class Main {
    /* C помощью цикла for написать метод, печатающий цифры от 1 до  числа  n
     */
    public static int num(int i, int n) {
        for (; i <= n; i += 1) {
            System.out.printf(i + " ");
        }
        return i;
    }
    //-----------------------------------------

    /* C помощью цикла for написать метод возвращающий сумму цифр от 1 до числа n
     */
    public static int countSum(int begin, int end) {
        int sum = 0;
        for (; begin <= end; begin += 1) {
            sum += begin++;
        }
        return sum;
    }

    //-----------------------------------------
    public static void main(String[] args) {
        num(1, 10);
        System.out.println();

        //-----------------------------------------

        System.out.printf("Сумма = %d %n", countSum(1, 10));
    }
}
