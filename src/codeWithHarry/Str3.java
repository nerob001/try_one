package codeWithHarry;

public class Str3 {
    public static void main(String[] args) {

        String str = "sasuke";
        System.out.println(str.substring(2));
        System.out.println(str.substring(1,str.length()));
        System.out.println(str.replace('s','x'));
        System.out.println(str.replace("asu","xsd"));
        System.out.println(str.replace("k","eeee"));
        System.out.println(str.startsWith("savu"));
        System.out.println(str.endsWith("e"));
        System.out.println(str.charAt(5));
        System.out.println(str.equals("sauske"));
        System.out.println(str.equalsIgnoreCase("SASUKE"));

        for(int i = 0;i<str.length();i++){

            System.out.println(str.charAt(i));

        }
    }
}
