package ucu.edu.ua.task2;

public class BirthdayMailCode implements MailCode{

    @Override
    public String generateText(Client client) {
        return "Happy Birthday, {{NAME}}".replaceAll("{{NAME}}", client.getName());
    }
}
