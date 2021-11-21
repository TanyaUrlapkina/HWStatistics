package ru.netology.stats;

public class StatsService {

    public int saleSum (int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int findAvg (int[] sales){
        return saleSum(sales) / sales.length;
    }

    public int findMax (int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int findMin (int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }
    public int findMinAvg (int[] sales) {
        int count = 0;
        int sumAvg = saleSum(sales) / sales.length;
        for (int sale : sales) {
            if (sale < sumAvg) {
                count++;
            }
        }
        return count;
    }

    public int findMaxAvg (int[] sales) {
        int count = 0;
        int sumAvg = saleSum(sales) / sales.length;
        for (int sale : sales) {
            if (sale > sumAvg) {
                count++;
            }
        }
        return count;
    }
}
