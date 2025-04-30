
interface SmartDevice {

    void turnOn();

    void turnOff();

    void getStatus();
}

class remote {

    void setManually() {
        System.out.println("remote is turning on");
    }
}

class SmartLight extends remote implements SmartDevice {

    private boolean isOn;
    private int brightness;

    public SmartLight(boolean isOn, int brightness) {
        this.isOn = isOn;
        this.brightness = brightness;
    }

    @Override
    public void turnOn() {
        isOn = true;
        System.out.println("Light is turned on");
    }

    @Override
    public void turnOff() {
        isOn = false;
        System.out.println("Light is turned off");
    }

    @Override
    public void getStatus() {
        System.out.println("Light is " + isOn + " with brightness level: " + brightness);
    }

}

class SmartThermostat implements SmartDevice {

    private boolean isOn;
    private int temperature;

    public SmartThermostat(boolean isOn, int temperature) {
        this.isOn = isOn;
        this.temperature = temperature;
    }

    @Override
    public void turnOn() {
        isOn = true;
        System.out.println("Thermostat is turned on");
    }

    @Override
    public void turnOff() {
        isOn = false;
        System.out.println("Thermostat is turned off");
    }

    @Override
    public void getStatus() {
        System.out.println("Thermostat is " + isOn + " with temperature set to: " + temperature);
    }

}

class SmartFan implements SmartDevice {

    private boolean isOn;
    private int speed;

    public SmartFan(boolean isOn, int speed) {
        this.isOn = isOn;
        this.speed = speed;
    }

    @Override
    public void turnOn() {
        isOn = true;
        System.out.println("Fan is turned on");
    }

    @Override
    public void turnOff() {
        isOn = false;
        System.out.println("Fan is turned off");
    }

    @Override
    public void getStatus() {
        System.out.println("Fan is " + isOn + " with speed level: " + speed);
    }

    void setSpeed(int speed) {
        this.speed = speed;
        System.out.println("Fan speed set to: " + speed);
    }

}

public class interfaces {

    public static void main(String[] args) {

        SmartLight light = new SmartLight(false, 50);
        SmartDevice thermostat = new SmartThermostat(false, 22);
        SmartFan fan = new SmartFan(false, 3);

        light.turnOn();
        light.getStatus();
        light.setManually();

        thermostat.turnOn();
        thermostat.getStatus();

        fan.turnOn();
        fan.getStatus();

        fan.setSpeed(5);

    }
}
