package by.itacademy.сredits;

import java.util.Scanner;

//Напишите программу расчета даты следующего дня введя 3 числа - день, месяц и год.
public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите день: ");
        int day = scanner.nextInt();
        System.out.print("Введите месяц: ");
        int month = scanner.nextInt();
        System.out.print("Введите год: ");
        int year = scanner.nextInt();

        if (day < 1 || day > 31 || month < 1 || month > 12) {
            System.out.println("Проверьте корректность ввода!!!");
            return;
        }
        int daysInMonth = getDaysInMonth(month, leapYear(year));
        if (day > daysInMonth) {
            System.out.println("Проверьте корректность ввода!!!");
            return;
        }
        int nextDay = day + 1;
        int nextMonth = month;
        int nextYear = year;

        if (nextDay > daysInMonth) {
            nextDay -= daysInMonth;
            nextMonth++;
            if (nextMonth > 12) {
                nextMonth = 1;
                nextYear++;
            }
        }
        System.out.println("Следующий день: " + nextDay + " " + nextMonth + " " + nextYear);
    }
    private static int getDaysInMonth(int month, boolean isLeapYear) {
        switch (month) {
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                return isLeapYear ? 29 : 28;
            default:
                return 31;
        }
    }
    public static boolean leapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
