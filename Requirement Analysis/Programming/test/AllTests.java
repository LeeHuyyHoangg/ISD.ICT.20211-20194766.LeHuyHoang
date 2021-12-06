import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ValidateNameTest.class, ValidatePhoneNumberTest.class, ValidateAddressTest.class, CheckRushOrderValidityTest.class})
public class AllTests {

}
