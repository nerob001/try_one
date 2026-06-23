package ProgrammingForTT;

public class StrngMethods {
    public static void main(String[] args) {

        String s = "Itachi uchiha";
        System.out.println(s.length());
        System.out.println(s.charAt(5));
        System.out.println(s.substring(7,s.length()));
        System.out.println(s.indexOf("uchiha"));
        String str = s.replace("Itachi","Sasuke");
        System.out.println(str);

        String name = "    Hello  World  ";
        name = name.trim();
        System.out.println(name);
    }
}
