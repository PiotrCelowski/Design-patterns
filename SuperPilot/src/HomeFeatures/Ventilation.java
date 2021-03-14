package HomeFeatures;

public class Ventilation {
    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;
    int gear;

    public Ventilation() {
    }

    public void ventOn() {
        System.out.println("Ventilation is ON!");
    }

    public void ventOff() {
        gear = OFF;
        System.out.println("Ventilation is OFF!");
    }

    public void setHighSpeed() {
        gear = HIGH;
        System.out.println("Ventilation speed changed to HIGH.");
    }

    public void setMediumSpeed() {
        gear = MEDIUM;
        System.out.println("Ventilation speed changed to MEDIUM.");
    }

    public void setLowSpeed() {
        gear = MEDIUM;
        System.out.println("Ventilation speed changed to LOW.");
    }

    public int getGear() {
        return gear;
    }
}
