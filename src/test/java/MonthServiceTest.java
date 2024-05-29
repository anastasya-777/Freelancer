import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;


public class MonthServiceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/month.csv")
    public void testMonth(int income, int expenses, int threshold, int expected) {
        MonthService service = new MonthService();
        int actual = service.calculate(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);


    }
}
