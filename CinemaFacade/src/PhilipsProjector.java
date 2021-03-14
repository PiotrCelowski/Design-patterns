public class PhilipsProjector implements Projector {
    public PhilipsProjector() {
    }

    @Override
    public void projectorOn() {
        System.out.println("Projector turning on!");
    }

    @Override
    public void projectorOff() {
        System.out.println("Projector turning off!");
    }
}
