public class Main {
    /* Написать метод String replace(String str, char oldChar, char newChar) который в переданной строке str меняет все символы  oldChar на символы newChar.  Например: replace(«саша», ‘c’, ‘м’) -> «маша» */

    public static void word(char oldChar, char newChar, String Str) {

        System.out.print("Old string: " + Str);
        System.out.println();
        String newString = Str.replace(oldChar, newChar);
        System.out.print("New string: " + newString);
    }

    public static void main(String[] args) {
        word('с', 'м', new String("саша"));
        word('а', 'о', new String("саша"));
    }
}