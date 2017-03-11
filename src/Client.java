/**
 * Created by mandarinka on 11.03.2017.
 */
public class Client {
    private Mediator mediator;
    public Client (Mediator med) {
        this.mediator = med;
    }
    public void sendMessage (String message) {
        mediator.sendMessage (message, this);
    }

    public void receiveMessage (String message) {
        System.out.println(message);
    }
}