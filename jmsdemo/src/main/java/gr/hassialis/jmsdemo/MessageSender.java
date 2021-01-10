package gr.hassialis.jmsdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Component;

@Component
public class MessageSender {

    @Autowired
    private JmsTemplate jmsTemplate;

    @Value("${spring.jms.myQueue}")
    private String queue;

    public void send(String message) {
        System.out.println("Message to be sent: " + message);
        // jmsTemplate.convertAndSend(queue, message);

        MessageCreator messageCreator = s -> s.createTextMessage(message);
        jmsTemplate.send(queue, messageCreator);
    }

}
