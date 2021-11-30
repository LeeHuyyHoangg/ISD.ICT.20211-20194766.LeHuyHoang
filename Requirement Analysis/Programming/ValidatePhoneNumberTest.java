import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import controller.PlaceOrderController;

class ValidatePhoneNumberTest {

	private PlaceOrderController placeOrderController;

	@BeforeEach
	void setUp() throws Exception {
		placeOrderController = new PlaceOrderController();
	}
	
	@ParameterizedTest
	@CsvSource({
		"0123456789,true",
		"012345,false",
		"0123456a89,false",
		"0123456a89s,false",
		"f123456a89,false",
		"f123456a89s,false",
		"          ,false",
		",false"
	})

	public void test(String phoneNumber, boolean expected) {
		assertEquals(expected, placeOrderController.validatePhoneNumber(phoneNumber));
	}

}
