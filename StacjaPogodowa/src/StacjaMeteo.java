public class StacjaMeteo {
    public static void main(String[] args) {
        DanePogodowe dane = new DanePogodowe();

        WarunkiBiezaceWyswietl warunkiBiezaceWyswietl = new WarunkiBiezaceWyswietl(dane);

        dane.ustawOdczyty((float) 20.7,77,1000);
        dane.ustawOdczyty((float) 21.5,23,1013);
        dane.ustawOdczyty((float) 24.2,50,1005);


    }
}
