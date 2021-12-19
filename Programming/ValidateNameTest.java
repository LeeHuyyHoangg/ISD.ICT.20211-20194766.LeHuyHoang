import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import controller.PlaceOrderController;

class ValidateNameTest {

	private PlaceOrderController placeOrderController;

	@BeforeEach
	void setUp() throws Exception {
		placeOrderController = new PlaceOrderController();
	}
	
	@ParameterizedTest
	@CsvSource({
		"NguyenThiA,true",
		"@NguyenThiA,false",
		"NguyenTh1A,false",
		"Nguyen Thi A,true",
		"NGUYENTHIA,true",
		"@NGUYENTHIA,false",
		"NGUYENTH1A,false",
		"NGUYEN THI A,true",
		"Dr.James,true",
		"          ,false",
		",false"
	})

	public void test(String name, boolean expected) {
		assertEquals(expected, placeOrderController.validateName(name));
	}

}
