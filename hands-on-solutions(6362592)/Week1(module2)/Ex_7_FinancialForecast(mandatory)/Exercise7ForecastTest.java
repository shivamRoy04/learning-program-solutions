// JUnit Test
import org.junit.jupiter.api.*;

public class Exercise7ForecastTest {
    @Test
    void testForecast() {
        double result = Exercise7Forecast.futureValue(1000, 0.05, 2);
        Assertions.assertTrue(result > 1100 && result < 1110);
    }
}
