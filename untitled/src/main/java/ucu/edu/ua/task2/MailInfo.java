package ucu.edu.ua.task2;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class MailInfo {
    private Client client;
    private MailCode code;
    public String generateText() {
        return code.generateText(client);
    }
}
