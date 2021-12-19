import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import controller.PlaceOrderController;

class ValidateAddressTest {

	private PlaceOrderController placeOrderController;

	@BeforeEach
	void setUp() throws Exception {
		placeOrderController = new PlaceOrderController();
	}
	
	@ParameterizedTest
	@CsvSource({
		"jdhcbudy,true",
		"156 Dai Co Viet,true",
		"156 Dai Co Viet Hai Ba Trung Ha Noi,true",
		"@DongNai!,false",
		"tp. Ho Chi Minh,true",
		"          ,false",
		",false"
	})

	public void test(String address, boolean expected) {
		assertEquals(expected, placeOrderController.validateAddress(address));
	}

}
