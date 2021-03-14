public class WarunkiBiezaceWyswietl implements Obserwator, WyswietlElement {
    private float temperatura;
    private float wilgotnosc;
    private Podmiot DanePogodowe;

    public WarunkiBiezaceWyswietl(Podmiot DanePogodowe) {
        this.DanePogodowe = DanePogodowe;
        DanePogodowe.zarejestrujObserwatora(this);
    }

    @Override
    public void aktualizacja(float temp, float wilogtnosc, float cisnienie) {
        this.temperatura = temp;
        this.wilgotnosc = wilogtnosc;
        wyswietl();
    }

    @Override
    public void wyswietl() {
        System.out.println("Warunki biezace " + temperatura + " stopni C oraz " + wilgotnosc + "% wilgotnosc");
    }
}
