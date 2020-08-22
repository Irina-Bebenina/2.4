package ru.netology.stats;

public class StatsService {
    public int calculateSum(int[] salesAmount) {
        int sum = 0;
        for (int item : salesAmount) {
            sum += item;
        }
        return sum;
    }

    public int calculateAverage(int[] salesAmount) {
        int average = 0;
        int sum = 180;
        for (int item : salesAmount) {
            average = sum / salesAmount.length;
        }
        return average;
    }


    public int findMax(int[] salesAmount) {
        int currentMax = salesAmount[0];
        int numberMax = 0;
        int count = 0;
        for (int item : salesAmount) {
            count++;
            if (currentMax <= item) {
                currentMax = item;
                numberMax = count;
            }
        }
        return numberMax;
    }

    public int minimumSales(int[] salesAmount) {
        int currentMin = salesAmount[0];
        int numberMin = 0;
        int count = 0;
        for (int item : salesAmount) {
            count++;
            if (currentMin >= item) {
                currentMin = item;
                numberMin = count;
            }
        }
        return numberMin;
    }


    public int AverageSales(int[] salesAmount) {
        int salesBelow = calculateAverage(salesAmount);
        int monthNumber = 0;
        int count = 0;
        for (int item : salesAmount) {
            if (item < salesBelow) {
                count++;
                monthNumber = count;
            }
        }
        return monthNumber;
    }


    public int AboveAverageSales(int[] salesAmount) {
        int salesBelow = calculateAverage(salesAmount);
        int monthNumber = 0;
        int count = 0;
        for (int item : salesAmount) {
            if (item > salesBelow) {
                count++;
                monthNumber = count;
            }
        }
        return monthNumber;
    }
}



















