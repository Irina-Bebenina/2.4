package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StatsServiceTest {


    @Test
    void calculateSum() {

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
    void shouldCalculateFindMax() {

        StatsService service = new StatsService();

        int[] salesAmount = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 8;

        int actual = service.findMax(salesAmount);

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
    void shouldCalculateBelowAverageSales() {

        StatsService service = new StatsService();

        int[] salesAmount = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 5;

        int actual = service.AverageSales(salesAmount);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateAboveAverageSales() {

        StatsService service = new StatsService();

        int[] salesAmount = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 5;

        int actual = service.AboveAverageSales(salesAmount);

        assertEquals(expected, actual);
    }
}




