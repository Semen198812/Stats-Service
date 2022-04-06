package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void shouldCalculateMin() {
        StatsService service = new StatsService();
        int[] salesMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int actual = service.minSales(salesMonth);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateMax() {
        StatsService service = new StatsService();
        int[] salesMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        int actual = service.maxSales(salesMonth);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateSum() {
        StatsService service = new StatsService();
        int[] salesMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        int actual = service.sumSales(salesMonth);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateAvg() {
        StatsService service = new StatsService();
        int[] salesMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;
        int actual = service.avgSales(salesMonth);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateMinAvg() {
        StatsService service = new StatsService();
        int[] salesMonth = {13, 15, 13, 15, 17, 20, 23, 20, 10, 14, 14, 18};
        int expected = 7;
        int actual = service.minAvgSales(salesMonth);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateMaxAvg() {
        StatsService service = new StatsService();
        int[] salesMonth = {14, 22, 13, 26, 17, 2, 13, 20, 5, 14, 14, 8};
        int expected = 4;
        int actual = service.maxAvgSales(salesMonth);
        assertEquals(expected, actual);
    }
}