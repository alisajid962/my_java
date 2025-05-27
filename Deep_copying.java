public class Deep_copying {
    String name ;
    StringBuilder author;
    Deep_copying(String name,StringBuilder author){
        this.name=name;
        this.author = new StringBuilder(author);
    }
    //deep copy
    Deep_copying(Deep_copying obj){
        this.name= obj.name;
        this.author = new StringBuilder(obj.author);
    }
    void display(){
        System.out.println("Author: "+author);
        System.out.println("name "+ name);
    }
    public static void main(String[] args) {
        StringBuilder stbr = new StringBuilder("Ali");
           Deep_copying original_java = new Deep_copying("JAVA ",stbr);
           Deep_copying copied_book = new Deep_copying(original_java);


           original_java.author.append(" Sajid");
           original_java.display();
           copied_book.display();
    }
}
