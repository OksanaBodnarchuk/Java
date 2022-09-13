public class Main {
    public static void main(String[] args) {
        /* Написать метод String replace(String str, char oldChar, char newChar) который в переданной строке str
        меняет все символы  oldChar на символы newChar.  Например: replace(«саша», ‘c’, ‘м’) -> «маша»
         */
        char oldChar = 'с';
        char newChar = 'м';
        String Str = new String("саша");
        System.out.print("Old string: " + Str);
        System.out.println();
        String newString = Str.replace(oldChar, newChar);
        System.out.print("New string: " + newString);
    }
}
