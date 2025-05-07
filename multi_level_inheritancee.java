import java.util.*;
class cellPhone {

    void call() {
        System.out.println("Calling...");
    }

    void text() {
        System.out.println("Texting...");
    }

}

interface camera {

    void takePhoto();

    void recordVideo();
}

interface musicPlayer {

    void playMusic();

    void stopMusic();
}

interface gps {

    void getLocation();

    void setDestination();

}

class smartPhone extends cellPhone implements camera, musicPlayer, gps {

    @Override
    public void takePhoto() {
        System.out.println("Taking photo...");
    }

    @Override
    public void recordVideo() {
        System.out.println("Recording video...");
    }

    @Override
    public void playMusic() {
        System.out.println("Playing music...");
    }

    @Override
    public void stopMusic() {
        System.out.println("Stopping music...");
    }

    @Override
    public void getLocation() {
        System.out.println("Getting location...");
    }

    @Override
    public void setDestination() {
        System.out.println("Setting destination...");
    }

    void call() {
        System.out.println("Calling from smartphone...");
    }

    void text() {
        System.out.println("Texting from smartphone...");
    }

    void browseInternet() {
        System.out.println("Browsing internet...");
    }

    void useApps() {
        System.out.println("Using apps...");
    }
}

public class multi_level_inheritancee {

    public static void main(String[] args) {
     smartPhone Nothing21 = new smartPhone();
        Nothing21.call();
        Nothing21.text();
        Nothing21.takePhoto();
        Nothing21.recordVideo();
        Nothing21.playMusic();
        Nothing21.stopMusic();
        Nothing21.getLocation();
        Nothing21.setDestination();
        Nothing21.browseInternet();
        Nothing21.useApps();
    }
}
