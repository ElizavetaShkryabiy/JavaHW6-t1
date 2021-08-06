package ru.netology.stats;

public class StatsService {
    int[] salesMonthly = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    public long calculateTotalSalesSum(long[] salesMonthly) {
        long totalSalesSum = 0;
        for (long salesPerMonth : salesMonthly) {
            totalSalesSum = totalSalesSum + salesPerMonth;
        }
        return totalSalesSum;
    }

    public double calculateAverageSalesSum(long totalSalesSum, long[] salesMonthly) {
        int amountMonths = salesMonthly.length;
        long averageSalesSum = totalSalesSum / amountMonths;
        return averageSalesSum;
    }

    public int calculateMaxSales(long[] salesMonthly) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : salesMonthly) {
            if (sale >= salesMonthly[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int calculateMinSales(long[] salesMonthly) {
        int minMonth = 0;
        int month = 0;
        for (long sale : salesMonthly) {
            if (sale <= salesMonthly[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int calculateMonthsAboveAverage (long[] salesMonthly) {


    }
}
