package objectOriented;

public class StrMethod {

    public static void main(String[] args) {

//        String name = new String("Harry");//class
//        System.out.println(name);
        String name = "Harry";
        System.out.println(name);

        System.out.println(name.length());
        String bame = name.toLowerCase();
        System.out.println(bame);
        String came =  name.toUpperCase();
        System.out.println(came);

        String nonTrim = "    abs      abc    ";
        System.out.println(nonTrim.trim());
        System.out.println(name.substring(2));
        System.out.println(name.substring(1,4));
        String ans = name.replace('r','p');
        System.out.println(ans);
        System.out.println(name.replace("arr","xpy"));
        System.out.println(name.replace("r","ier"));
        System.out.println(name.startsWith("H"));
        System.out.println(name.endsWith("r"));
        System.out.println(name.charAt(3));
        System.out.println(name.indexOf('r'));
        System.out.println(name.indexOf('r',3));
        System.out.println(name.indexOf("xry"));
        System.out.println(name.indexOf("rry"));
        System.out.println(name.equals("nerob"));
        System.out.println(name.equalsIgnoreCase("HARRY"));
        System.out.println("hello world \" miss me ");
    }
}
