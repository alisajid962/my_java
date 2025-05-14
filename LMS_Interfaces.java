
interface libraryitem {

    void BorrowItem();

    void ReturnItem();

    void DisplayItem();
}

class books implements libraryitem {

    String id;
    String title;

    public books(String id, String title) {
        this.id = id;
        this.title = title;
    }

    @Override
    public void BorrowItem() {
        System.out.println("Borrowing book: " + title);
    }

    @Override
    public void ReturnItem() {
        System.out.println("Returning book: " + title);
    }

    @Override
    public void DisplayItem() {
        System.out.println("Book ID: " + id + ", Title: " + title);
    }
}

class magzines implements libraryitem {

    String id;
    String title;

    public magzines(String id, String title) {
        this.id = id;
        this.title = title;
    }

    @Override
    public void BorrowItem() {
        System.out.println("Borrowing magazine: " + title);
    }

    @Override
    public void ReturnItem() {
        System.out.println("Returning magazine: " + title);
    }

    @Override
    public void DisplayItem() {
        System.out.println("Magazine ID: " + id + ", Title: " + title);
    }
}

class dvd implements libraryitem {

    String id;
    String title;

    public dvd(String id, String title) {
        this.id = id;
        this.title = title;
    }

    @Override
    public void BorrowItem() {
        System.out.println("Borrowing DVD: " + title);
    }

    @Override
    public void ReturnItem() {
        System.out.println("Returning DVD: " + title);
    }

    @Override
    public void DisplayItem() {
        System.out.println("DVD ID: " + id + ", Title: " + title);
    }
}

public class LMS_Interfaces {
      static libraryitem[] items = new libraryitem[3];
    

    public static void main(String[] args) {
        books b1 = new books("B001", "Java Programming");
        magzines m1 = new magzines("M001", "National Geographic");
        dvd d1 = new dvd("D001", "Inception");

        items[0] = b1;
        items[1] = m1;
        items[2] = d1;
        for (libraryitem item : items) {
            item.DisplayItem();
            item.BorrowItem();
            item.ReturnItem();
        }

    }
}
