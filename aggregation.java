
class book {

    String title;
    String author;
    int pages;

    book(String t, String a, int p) {
        title = t;
        author = a;
        pages = p;
    }
}

class library {

    String lib_name;
    String rack_no;
    book b1;

    public library(String lib_name,String rack_no, book b1) {
            this.lib_name = lib_name;
            this.rack_no = rack_no;
            this.b1 = b1;
    }
    void displayInfo() {
        System.out.println("Library Name: " + lib_name);
        System.out.println("Rack No: " + rack_no);
        System.out.println("Book Title: " + b1.title);
        System.out.println("Book Author: " + b1.author);
        System.out.println("Book Pages: " + b1.pages);

}}

public class aggregation {

    public static void main(String[] args) {
        book b4 = new book("The Great Gatsby", "F. Scott Fitzgerald", 180);
        library cui = new library("Cui_students library","A11",b4);
        cui.displayInfo();

    }
}
