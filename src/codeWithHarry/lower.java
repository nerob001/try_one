package codeWithHarry;

public class lower {

    public static void main(String[] args) {

        String name = "NARUTO UZUMAKI";
        name = name.toLowerCase();

        System.out.println(name);

        String str = "Feel Pain Accept Pain";
        str = str.replace(' ','_');
        System.out.println(str);

        String str1 = "Dear <|name|> Thanks a lot";
        String str2 = str1.replace("<|name|>","Itachi");
        System.out.println(str2);

        String str4 = "those who know pain  they never   understand true peace";
        System.out.println(str4.indexOf("  "));
        System.out.println(str4.indexOf("   "));

        String str5 = "Dear Naruto \nThanks A lot ";
        System.out.println(str5);

    }
}
