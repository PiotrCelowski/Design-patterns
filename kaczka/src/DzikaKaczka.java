import Kwakanie.Kwacz;
import Kwakanie.NieKwacze;
import Latanie.LatamBoMamSkrzydla;
import Latanie.NieLatam;

public class DzikaKaczka extends Kaczka {

    public DzikaKaczka() {
        kwakanieInterfejs = new NieKwacze();
        latanieInterfejs = new NieLatam();
    }
}
