public class Main {
    public static void main(String[] args) {

        //Дана строка строка, состоящая из нескольких слов разделенных пробелам, необходимо сформировать и вывести на экран строку вида содержащую первое и последнее слово исходной строки. Примечание: слова разделены одним пробелом, строка не содержит знаков препинания. Ограничение: в данной задаче нельзя пользоваться стандартными методам String кроме charAt() и length(). Например:
        //“Java is a very popular language” ->  “Java language”

        String str = "Java is a very popular language";
        System.out.println(str);
        System.out.println("----------------------------");
        String str2 = "";
        int i = 0;
        int index = 0;

        //------------------------------

        while (i < str.length()) {
            if (str.charAt(i) == ' ') {
                index = i;
            }
            i += 1;
        }
        i = 0;
        while (i < str.length()) {
            if ((str.charAt(i) != ' ') || (str.charAt(index) == ' ')) {
                str2 += str.charAt(i);
            }
            if (str.charAt(i) == ' ') {
                i = index;
            }
            i += 1;
        }
        //-----------------------------

        System.out.println(str2);
    }
}