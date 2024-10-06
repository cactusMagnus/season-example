package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SeasonExample {

    public enum Season {
        WINTER, SPRING, SUMMER, AUTUMN
    }

    public static void printSeason() {
        String month = getMonth();
        Season season = checkSeason(month);
        if (season != null) {
            System.out.println("The season is " + season);
        }
    }

    public static String getMonth () {
        String month = "";
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            month = reader.readLine().toLowerCase();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return month;
    }

    public static Season checkSeason(String month) {
        Season season = null;
        switch (month) {
            case "december":
            case "january":
            case "february":
               season = Season.WINTER;
               break;
            case "march":
            case "april":
            case "may":
                season = Season.SPRING;
                break;
            case "june":
            case "july":
            case "august":
                season = Season.SUMMER;
                break;
            case "september":
            case "october":
            case "november":
                season = Season.AUTUMN;
                break;
            default:
                System.out.println("Invalid value: " + month);
                break;
        }
        return season;
    }
}
