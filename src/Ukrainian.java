/**
 * Created by mariana.kotsko on 27-Feb-17.
 */
public class Ukrainian {
    public String sendMessage () {
        String message = "Hello from Ukraine!";
        return message;
    }

    public String receiveMessage (String message) {
        if (message == "Hello from America!") {
            return "Cool from Ukraine!";
        }
        else return "Where are you, America?";
    }
}
