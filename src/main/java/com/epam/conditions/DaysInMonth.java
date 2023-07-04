package com.epam.conditions;

/*
Create a program that will consume a year and a month (validation is required)
and will print amount of days in this month considering also if a year is leap or not.
(prints amount of days or else "invalid date", negative years are not accepted)
 */
public class DaysInMonth {

    public void printDays(int year, int month) {
        if (year < 0 || month < 1 || month > 12) {
            System.out.println("invalid date");
            return;
        }

        int days = 0;
        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> days = 31;
            case 2 -> days = isLeapYear(year) ? 29 : 28;
            case 4, 6, 9, 11 -> days = 30;
        }
        System.out.println(days);
    }

    private boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

}
