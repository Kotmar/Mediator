/**
 * Created by mandarinka on 11.03.2017.
 */
public class Main {
    public static void main(String[] args) {
        Mediator med = new Mediator ();
        Client ukr = new Client (med);
        Client nor = new Client (med);

        med.addClient(ukr);
        med.addClient(nor);

        ukr.sendMessage("Hello!");
        nor.sendMessage("Hello to you too!");
    }
}
