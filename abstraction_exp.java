
abstract class mobile {

    abstract void call(int number);

    abstract void message();

    abstract void camera();

    void displayinfo() {

    }
;

}



class nokia extends mobile {

    String model_no;
    // constructor
    // constructor is used to initialize the object of class

    nokia(String model_no) {
        this.model_no = model_no;
    }

    void call(int number) {
        System.out.println("calling to " + number);
    }

    @Override
    void displayinfo() {
        System.out.println("display info is on: " + this.model_no);//non abstract method can be overridden in child class
    }

    void message() {
        System.out.println("sending message");
    }

    void camera() {
        System.out.println("camera is on");//abstract method must be implemented in child class
    }

}

class samsung extends mobile {

    String model_no;

    // constructor
    // constructor is used to initialize the object of class
    samsung(String model_no) {
        this.model_no = model_no;
    }

    void call(int number) {
        System.out.println("calling to " + number);
    }

    void message() {
        System.out.println("sending message");
    }

    void camera() {
        System.out.println("camera is on");//abstract method must be implemented in child class
    }

    void hotspot() {
        System.out.println("hotspot is on");//non abstract method can be overridden in child class
    }

    void aicamera() {
        System.out.println("ai camera is on");//non abstract method can be overridden in child class
    }

    void fingerprint() {
        System.out.println("fingerprint is on");//non abstract method can be overridden in child class
    }

    void faceunlock() {
        System.out.println("face unlock is on");//non abstract method can be overridden in child class
    }

    void displayinfo() {
        System.out.println("display info is on: " + this.model_no);//non abstract method can be overridden in child class
    }
}

public class abstraction_exp {

    public static void main(String[] args) {
        nokia nokia = new nokia("Nokia 8");
        nokia.call(1234567890);
        nokia.message();
        nokia.camera(); //abstract method must be implemented in child class
        nokia.displayinfo(); //non abstract method can be overridden in child class

        samsung samsung = new samsung("Samsung Galaxy S21");

        samsung.call(1234567890);
        samsung.message();
        samsung.camera();
        samsung.fingerprint(); //non abstract method can be called in child class
        samsung.faceunlock(); //non abstract method can be called in child class
        samsung.hotspot(); //non abstract method can be called in child class
        samsung.aicamera(); //non abstract method can be called in child class
        samsung.displayinfo(); //non abstract method can be called in child class
    }
}
