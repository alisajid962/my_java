// Derived class
public class Newspaper extends Book {
    private String publicationDate;
    private String editor;

    // Constructor
    public Newspaper(String title, String author, int pages, String publicationDate, String editor) {
        super(title, author, pages); // Calling the parent class constructor
        this.publicationDate = publicationDate;
        this.editor = editor;
    }

    // Getter and Setter methods
    public String getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(String publicationDate) {
        this.publicationDate = publicationDate;
    }

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }

    // Overriding the displayDetails method
    @Override
    public void displayDetails(){
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Pages: " + pages);
        System.out.println("Publication Date: " + publicationDate);
        System.out.println("Editor: " + editor);
    }
}