package ru.netology.stats;

public class StatsService {

    public long calculateTotalSalesSum(long[] salesMonthly) {
        long totalSalesSum = 0;
        for (long salesPerMonth : salesMonthly) {
            totalSalesSum = totalSalesSum + salesPerMonth;
        }
        return totalSalesSum;

    }

    public double calculateAverageSalesSum(long[] salesMonthly) {
        int amountMonths = salesMonthly.length;
        StatsService service = new StatsService();
        long totalSales = service.calculateTotalSalesSum(salesMonthly);
        double averageSalesSum = totalSales / amountMonths;
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

    public int calculateMonthsUnderAverage(long[] salesMonthly) {
       StatsService service = new StatsService() ;
       double averageSalesSum = service.calculateAverageSalesSum(salesMonthly);

        int monthsUnderAverage = 0;
        for (long underAverage : salesMonthly) {
            if (underAverage < averageSalesSum) {
                monthsUnderAverage++;
            }
        }
        return monthsUnderAverage;
    }

    public int calculateMonthsAboveAverage(long[] salesMonthly) {
        StatsService service = new StatsService() ;
        double averageSalesSum = service.calculateAverageSalesSum(salesMonthly);
        int monthsAboveAverage = 0;
        for (long aboveAverage : salesMonthly) {
            if (aboveAverage > averageSalesSum) {
                monthsAboveAverage++;
            }
        }
        return monthsAboveAverage;
    }


}
