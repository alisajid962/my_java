
interface Printer {

    void printDocument(String name);
// default method use to provide a default implementation and can be overridden
    // by the implementing class

    default void status() {
        print();
        System.out.println("Printer is ready.");
    }

//private methods is used to help the methods inside the interfacse and cannot be overriden
    // by the implementing class
    private void print() {
        System.out.println("Printing...");
    }
}

public class interfacePrintexp implements Printer {

    @Override
    public void printDocument(String name) {
        System.out.println("Printing: " + name);
    }

    public static void main(String[] args) {
        interfacePrintexp hp = new interfacePrintexp();
        hp.printDocument("assignment.pdf");
        hp.status(); // Calling default method
    }
}
