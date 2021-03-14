import commands.Command;

public interface Pilot {
    void setCommand(int socket, Command commandOn, Command commandOff);
    void buttonClicked(int socket);
    void buttonUnclicked(int socket);
    void buttonUndo();
}
