package codeWithHarry;

public class Str2 {

    public static void main(String[] args) {

        String name = "Itachi Uchiha";
        int value = name.length();

        System.out.println(value);

        String lower = name.toLowerCase();
        String upper = name.toUpperCase();

        System.out.println(lower);
        System.out.println(upper);

        String nontrim = "      Uchiha Madara       ";
        System.out.println(nontrim.trim());



    }
}
