package receivers;

public class Light {
    private int brightnessLevel = 0;

    public void on() {
        System.out.println("Light is on");
    }
    public void off() {
        System.out.println("Light is off");
    }
    public void dimUp() {
        System.out.println("Brightness level is " + ++brightnessLevel);
    }
    public void dimDown() {
        System.out.println("Brightness level is " + --brightnessLevel);
    }
}
