import org.junit.jupiter.api.Test;
import ru.netology.stats.StatsService;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StatsServiceTest {
    long[] salesMonthly = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    void shouldCalculateTotalSalesSum() {
        StatsService service = new StatsService();
        long actual = service.calculateTotalSalesSum(salesMonthly);
        long expected = 180;
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateAverageSalesSum() {
        StatsService service = new StatsService();
        double actual = service.calculateAverageSalesSum(salesMonthly);
        double expected = 15;
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateMaxSales() {
        StatsService service = new StatsService();
        int actual = service.calculateMaxSales(salesMonthly);
        int expected = 8;
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateMinSales() {
        StatsService service = new StatsService();
        int actual = service.calculateMinSales(salesMonthly);
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateMonthsUnderAverage() {
        StatsService service = new StatsService();
        int actual = service.calculateMonthsUnderAverage(salesMonthly);
        int expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateMonthsAboveAverage() {
        StatsService service = new StatsService();
        int actual = service.calculateMonthsAboveAverage(salesMonthly);
        int expected = 5;
        assertEquals(expected, actual);
    }
}
