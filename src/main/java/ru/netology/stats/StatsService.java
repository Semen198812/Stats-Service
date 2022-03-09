package ru.netology.stats;

public class StatsService {

    public int minSales(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {

            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int maxSales(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {

            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int sumSales(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum = sum + sale;
        }
        return sum;
    }

    public int avgSales(int[] sales) {
        return sumSales(sales) / sales.length;
    }

    public int minAvgSales(int[] sales) {
        int month = 0;
        for (long sale : sales) {

            if (sale < sumSales(sales) / sales.length)
                month = month + 1;
        }
        return month;
    }

    public int maxAvgSales(int[] sales) {
        int month = 0;
        for (long sale : sales) {

            if (sale > sumSales(sales) / sales.length)
                month = month + 1;
        }
        return month;
    }
}
