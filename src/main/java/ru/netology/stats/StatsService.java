package ru.netology.stats;

public class StatsService {
    public long sumOfSales(long[] sales){
        long sum = 0;

        // sales[i] - продажа в месяц итый
        for (int i = 0; i < sales.length; i++){
            sum = sum + sales[i];
        }
        return sum;
    }

    public long averageSumOfSales(long [] sales){
        long sum = sumOfSales(sales); // сумма всех продаж
        long len = sales.length; // количество месяцев
        long averageSum = sum / len; // среднее арифметическое всех продаж
        return averageSum;
    }

    public int maxSales (long[] sales){
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {

            // sales[maxMonth] - продажи в месяце maxMonth
            // sale - продажи в рассматриваемом месяце
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }

            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int countSalesBelowAverage(long[] sales){
        long averageSumOfSales = averageSumOfSales(sales); // среднее арифметическое сумм продаж в месяц
        int counter = 0; // переменная для количества месяцев с суммой продаж ниже среднего

        for (int i = 0; i < sales.length; i++){
            if (averageSumOfSales > sales[i]){
                counter++;
            }
        }
        return counter;
    }

    public int countSalesUnderAverage(long[] sales){
        long averageSumOfSales = averageSumOfSales(sales); // среднее арифметическое сумм продаж в месяц
        int counter = 0; // переменная для количества месяцев с суммой продаж ниже среднего

        for (int i = 0; i < sales.length; i++){
            if (averageSumOfSales < sales[i]){
                counter++;
            }
        }
        return counter;
    }
}


