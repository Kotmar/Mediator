/**
 * Created by mariana.kotsko on 27-Feb-17.
 */
public class American {
    public String sendMessage () {
        String message = "Hello from America!";
        return message;
    }

    public String receiveMessage (String message) {
        if (message == "Hello from Ukraine!") {
            return "Cool from America!";
        }
        else return "Where are you, Ukraine?";
    }
}
