public class Main {
    public static void countCube(int n, int i, String abc) {
        //int i = 0;
        //int num1 = 5;
        //------------------

        while (i <= n) {
            System.out.printf((i * i * i) + " ");
            i += 1;
        }
        System.out.println(abc);
    }

    public static int countSum(int begin, int end){
        int sum=0;
        while (begin<=end) {
            sum+=begin++; //sum=sum+begin; begin=begin+1;
        }
        return sum;
    }

    public static void main(String[] args) {

        //С использованием цикла while написать метод, печатающий куб числа от 0 до данного чисда n.
        //Пример: на входе n=3  на выходе 0,1,8,27

        countCube(4, 0, "Count finished");
        System.out.println();
        System.out.println("-------------------");
        countCube(7, 1, "Count finished");
        System.out.println();
        System.out.println("-------------------");
        countCube(10, 5, "finished");
        System.out.println();
        System.out.println("-------------");
        int a= countSum(1,5);
        System.out.println(a);
        //System.out.println(countSum(1,5));


    }

}