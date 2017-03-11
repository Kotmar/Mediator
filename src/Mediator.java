import java.util.ArrayList;
import java.util.List;

/**
 * Created by mariana.kotsko on 27-Feb-17.
 */
public class Mediator {
    List<Client> clients = new ArrayList<> ();

    public void addClient (Client client) {
        clients.add(client);
    }

    public void sendMessage (String message, Client client) {
        for (Client currentClient : clients) {
            if (currentClient != client){
                currentClient.receiveMessage(message);
            }
        }
    }
}
