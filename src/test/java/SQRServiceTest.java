import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.javaqa.javaqamvn.services.SQRService;

public class SQRServiceTest {
    @ParameterizedTest
    @CsvSource({
            "1,100,120",
            "3,100,145"
    })
    public void testSumOfTheNumbersOfSqr(int expected, int lowRangeLimit, int hiRangeLimit) {
        SQRService service = new SQRService();
        int actual = service.calcSqrt(lowRangeLimit, hiRangeLimit);
        Assertions.assertEquals(expected, actual);
    }


}
