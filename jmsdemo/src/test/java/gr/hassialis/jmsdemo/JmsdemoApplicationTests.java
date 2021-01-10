package gr.hassialis.jmsdemo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JmsdemoApplicationTests {

	@Autowired
	MessageSender sender;

	@Test
	void testSendAndReceive() {
		sender.send("Hello from JMS");
	}

}
