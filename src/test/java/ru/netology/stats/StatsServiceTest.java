package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void shouldSaleSum() {
        StatsService service = new StatsService();
        int[] managerSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        int actual = service.saleSum(managerSales);

        assertEquals(expected, actual);

    }

    @Test
    void shouldFindAvg() {
        StatsService service = new StatsService();
        int[] managerSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;
        int actual = service.findAvg(managerSales);

        assertEquals(expected, actual);

    }

    @Test
    void shouldFindMax() {
        StatsService service = new StatsService();
        int[] managerSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        int actual = service.findMax(managerSales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldFindMin() {
        StatsService service = new StatsService();
        int[] managerSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int actual = service.findMin(managerSales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldFindMinAvg() {
        StatsService service = new StatsService();
        int[] managerSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.findMinAvg(managerSales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldFindMaxAvg() {
        StatsService service = new StatsService();
        int[] managerSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.findMaxAvg(managerSales);

        assertEquals(expected, actual);
    }
}