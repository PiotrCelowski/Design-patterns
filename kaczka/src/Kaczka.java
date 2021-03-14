import Kwakanie.KwakanieInterfejs;
import Latanie.LatanieInterfejs;

public abstract class Kaczka {
    LatanieInterfejs latanieInterfejs;
    KwakanieInterfejs kwakanieInterfejs;

    void wykonajKwakanie() {
        kwakanieInterfejs.kwacz();
    }

    void wykonajLatanie() {
        latanieInterfejs.lec();
    }
}
