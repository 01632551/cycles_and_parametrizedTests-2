package ru.netology.stats;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
    static long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    static  StatsService service = new StatsService();

    // 1
    @Test
    void shouldCalculateSumOfSales(){

        long expected = 180;

        long actual = service.sumOfSales(sales);

        assertEquals(expected, actual);
    }

    // 2
    @Test
    void shouldCalculateAverageSumOfSales(){

        long expected = 15;

        long actual = service.averageSumOfSales(sales);

        assertEquals(expected, actual);
    }

    // 3
    @Test
    void shouldCalculateMonthWithMaxSales(){

        long expected = 8;

        long actual = service.maxSales(sales);

        assertEquals(expected, actual);
    }

    // 4
    @Test
    void shouldCalculateMonthWithMinSales(){

        long expected = 9;

        long actual = service.minSales(sales);

        assertEquals(expected, actual);
    }


    // 5
    @Test
    void shouldCountSalesBelowAverage(){

        long expected = 5;

        long actual = service.countSalesBelowAverage(sales);

        assertEquals(expected, actual);
    }

    // 6
    @Test
    void shouldCountSalesUnderAverage(){

        long expected = 5;

        long actual = service.countSalesUnderAverage(sales);

        assertEquals(expected, actual);
    }
}