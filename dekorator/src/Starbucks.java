public class Starbucks {
    public static void main(String args[]) {
        Napoj kawka = new Kawa();
        System.out.println("Obecnie napoj to: " + kawka.pobierzOpis() + " i kosztuje: " + kawka.koszt());

        kawka = new Czekolada(kawka);
        System.out.println("Obecnie napoj to: " + kawka.pobierzOpis() + " i kosztuje: " + kawka.koszt());

        kawka = new Czekolada(kawka);
        System.out.println("Obecnie napoj to: " + kawka.pobierzOpis() + " i kosztuje: " + kawka.koszt());
    }
}
