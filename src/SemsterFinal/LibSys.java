package SemsterFinal;
class Library{

    static int totalBookIssued = 0;
    String name;

    Library(String name){
        this.name=name;

    }

    void issueBook(){
        totalBookIssued++;
        System.out.println(name + "Book is Issue");
    }

    static void showTotalBooks(){
        System.out.println("Total Books Issued : " + totalBookIssued);
    }
}
public class LibSys {
    public static void main(String[] args) {

        Library l1=new Library("Itachi");
        l1.issueBook();
        Library l2=new Library("Sasuke");
        l2.issueBook();
        l1.showTotalBooks();
        l1.issueBook();

        Library.showTotalBooks();

    }
}
