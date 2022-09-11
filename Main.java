public class Main {
    public static void main(String[] args) {
        /*Написать программу, которая выводит на экран таблицу умножения (таблицу Пифагора). Естественно, использовать циклы.*/


        for (int i = 1; i <= 9; i += 1) {
            for (int n = 1; n <= 9; n += 1) {
                System.out.printf("%2d ", i * n);
                if (n == 9) {
                    System.out.println();
                }
            }
        }
        System.out.println("--------------------");


    /*Дана строка и 2 числа int: startIndex, endIndex. Необходимо получить и вывести на экран строку, которая состоит из всех символов исходной строки, начиная с позиции startIndex (включительно) до позиции endIndex (не включительно). Если startIndex  «не попадает в строку» или больше endIndex выводим “error”. Если endIndex не «попадает в строку»,  выводим, начиная со startIndex до конца строки.  Ограничение: в данной задаче нельзя пользоваться стандартными методам String кроме charAt() и length().
        “Java is a very popular language”,  startIndex=5  endIndex=13  -> “is a ver”
        “Java is a very popular language”,  startIndex=5  endIndex=-13  -> error
        “Java is a very popular language”,  startIndex=5  endIndex=136  -> “is a very popular language”*/
        String str = "Java is a very popular language";
        int startIndex = 5;
        int endIndex = 13;
        String newStr = "";
        
        //------------------------
        System.out.println(str);

        if (startIndex >= str.length() || startIndex < 0 || startIndex > endIndex) {
            newStr = "error";
        } else if (startIndex == endIndex) {
            newStr += str.charAt(startIndex);
        } else {
            for (; startIndex < endIndex && startIndex < str.length(); startIndex += 1) {
                newStr += str.charAt(startIndex);
            }
        }
        System.out.println(newStr);
    }
}