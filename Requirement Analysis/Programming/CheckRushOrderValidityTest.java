import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import entity.order.Order;

import java.util.Scanner;

class CheckRushOrderValidityTest {

	private Order order;
	
	@BeforeEach
	void setUp() throws Exception {
		order = new Order();
		Scanner scanner = new Scanner(System.in);
	}

	
	@ParameterizedTest
	@CsvSource({
		"An Giang,false",
		"Bà Rịa-Vũng Tàu,false",
		"Bình Dương,false",
		"Bình Phước,false",
		"Bình Thuận,false",
		"Bình Định,false",
		"Bạc Liêu,false",
		"Bắc Giang,false",
		"Bắc Kạn,false",
		"Bắc Ninh,false",
		"Bến Tre,false",
		"Cao Bằng,false",
		"Cà Mau,false",
		"Cần Thơ,false",
		"Gia Lai,false",
		"Hà Giang,false",
		"Hà Nam,false",
		"Hà Nội,true",
		"Hà Tĩnh,false",
		"Hòa Bình,false",
		"Hưng Yên,false",
		"Hải Dương,false",
		"Hải Phòng,false",
		"Hậu Giang,false",
		"Hồ Chí Minh,false",
		"Khánh Hòa,false",
		"Kiên Giang,false",
		"Kon Tum,false",
		"Lai Châu,false",
		"Long An,false",
		"Lâm Đồng,false",
		"Lạng Sơn,false",
		"Nam Định,false",
		"Nghệ An,false",
		"Ninh Bình,false",
		"Ninh Thuận,false",
		"Phú Thọ,false",
		"Phú Yên,false",
		"Quảng Bình,false",
		"Quảng Nam,false",
		"Quảng Ngãi,false",
		"Quảng Ninh,false",
		"Quảng Trị,false",
		"Sóc Trăng,false",
		"Sơn La,false",
		"Thanh Hóa,false",
		"Thái Bình,false",
		"Thái Nguyên,false",
		"Thừa Thiên-Huế,false",
		"Tiền Giang,false",
		"Trà Vinh,false",
		"Tuyên Quang,false",
		"Tây Ninh,false",
		"Vĩnh Long,false",
		"Vĩnh Phúc,false",
		"Yên Bái,false",
		"Điện Biên,false",
		"Đà Nẵng,false",
		"Đắk Lắk,false",
		"Đắk Nông,false",
		"Đồng Nai,false",
		"Đồng Tháp,false"
	})

	public void test(String city, boolean expected) {
		order.setCity(city);
		assertEquals(expected, order.checkRushOrderValidity());
	}

}
