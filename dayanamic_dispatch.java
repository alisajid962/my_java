
class car {

    void start() {
        System.out.println("car is starting");
    }

    void stop() {
        System.out.println("car is stopping");
    }

    void brake() {
        System.out.println("car is braking");
    }

    void accelerate() {
        System.out.println("car is accelerating");
    }
}

class bmw extends car {

    void start() {
        System.out.println("bmw is starting");
    }

    void stop() {
        System.out.println("bmw is stopping");
    }

    void brake() {
        System.out.println("bmw is braking");
    }

    void accelerate() {
        System.out.println("bmw is accelerating");
    }

    void playmusic() {
        System.out.println("bmw is playing music");
    }

    void turnOnac() {
        System.out.println("bmw is turning on ac");
    }
}

public class dayanamic_dispatch {

    public static void main(String[] args) {
        /* dynamic dispatch is a process of selecting which method to call at runtime.
        superClass obj = new subClass(); // this is called dynamic dispatch
        when we call a method on the superClass object, the method of the subClass will be called.
         */

        car mehran = new bmw();
        mehran.start();
        mehran.stop();
        mehran.brake();
        mehran.accelerate();
        //mehran.playmusic(); // this will give an error because playmusic is not a method of car class
        bmw bmw1 = new bmw();
        bmw1.playmusic(); // this will work because playmusic is a method of bmw class
        bmw1.turnOnac();

    }
}
