package States;

import java.io.Serializable;

public interface State extends Serializable {
    void insertCoin();
    void returnCoin();
    void turnTheSwitch();
    void returnGum();
}
