public class WhiteScreen implements Screen {
    public WhiteScreen() {
    }

    @Override
    public void screenUp() {
        System.out.println("Screen goes up!");
    }

    @Override
    public void screenDown() {
        System.out.println("Screen goes down");
    }
}
