/**
 * Created by mariana.kotsko on 27-Feb-17.
 */
public class Mediator {
    public String receiveMessageAmericam (American am) {
        String message = am.sendMessage();
        return message;
    }

    public String receiveMessageUkrainian (Ukrainian ukr) {
        String message = ukr.sendMessage();
        return message;
    }


    public void sendAnswertoAmerican (American am, String message) {
        System.out.println(message);
        String answer = am.receiveMessage(message);
        System.out.println(answer);
    }

    public void sendAnswertoUkrainian (Ukrainian ukr, String message) {
        System.out.println(message);
        String answer = ukr.receiveMessage(message);
        System.out.println(answer);
    }

    public static void main (String[] args) {
        Mediator med = new Mediator();
        American am = new American();
        Ukrainian ukr = new Ukrainian();

        String messagefromUkraine = med.receiveMessageUkrainian(ukr);
        med.sendAnswertoAmerican(am, messagefromUkraine);

        String messagefromAmerica = med.receiveMessageAmericam(am);
        med.sendAnswertoUkrainian(ukr, messagefromAmerica);

    }
}
