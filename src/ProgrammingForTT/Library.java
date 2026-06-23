package ProgrammingForTT;
class LibrarySystem{

    private static int totalBookIssued = 0;

    public void issueBook(){

        totalBookIssued++;
        System.out.println("Book is issued successfully!");

    }

    public int getTotalBook(){

        return totalBookIssued;

    }
}

public class Library {

    public static void main(String[] args) {

        LibrarySystem l1 = new LibrarySystem();
        LibrarySystem l2 = new LibrarySystem();
        LibrarySystem l3 = new LibrarySystem();
        LibrarySystem l4 = new LibrarySystem();
        l1.issueBook();
        l2.issueBook();
        l3.issueBook();
        l4.issueBook();
        System.out.println("Total Books Issued: " + l1.getTotalBook());


    }
}
