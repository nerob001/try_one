package ProgrammingForTT;

public class StringCreation {
    public static void main(String[] args) {

        String str = "hello ! Java with string literal";
        String str2 = new String ("hello ! Java with string literal");

        System.out.println(str);
        System.out.println(str2);
        System.out.println(str == str2);
        System.out.println(str.equals(str2));
        System.out.println(str.length());
    }
}
