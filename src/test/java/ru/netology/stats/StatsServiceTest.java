package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StatsServiceTest {


    @Test
    void shouldCalculateSum() {

        StatsService service = new StatsService();

        int[] salesAmount = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 180;

        int actual = service.calculateSum(salesAmount);

        assertEquals(expected, actual);

    }

    @Test
    void shouldCalculateAverage() {

        StatsService service = new StatsService();

        int[] salesAmount = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 15;

        int actual = service.calculateAverage(salesAmount);

        assertEquals(expected, actual);
    }


    @Test
    void shouldMaxSales() {

        StatsService service = new StatsService();

        int[] salesAmount = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 8;

        int actual = service.maxSales(salesAmount);

        assertEquals(expected, actual);
    }

    @Test
    void shouldMinimumSales() {

        StatsService service = new StatsService();

        int[] salesAmount = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 9;

        int actual = service.minimumSales(salesAmount);

        assertEquals(expected, actual);
    }


    @Test
    void shouldBelowAverageSales() {

        StatsService service = new StatsService();

        int[] salesAmount = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 5;

        int actual = service.belowAverageSales(salesAmount);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalcAboveAverageSales() {

        StatsService service = new StatsService();

        int[] salesAmount = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 5;

        int actual = service.aboveAverageSales(salesAmount);

        assertEquals(expected, actual);
    }
}




