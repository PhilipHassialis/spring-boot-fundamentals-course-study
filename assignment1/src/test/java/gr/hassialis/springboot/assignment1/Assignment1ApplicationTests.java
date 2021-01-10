package gr.hassialis.springboot.assignment1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Assignment1ApplicationTests {

	@Autowired
	CalculateTwoNumbersSum ctns;

	@Test
	void verifyCalcTwoNumberSum() {
		ctns.setX(5);
		ctns.setY(6);
		assertEquals(11, ctns.getSum());
	}

}
