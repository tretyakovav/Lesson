package Monday;

public class WhatToDo {
    public static void main(String[] args) {
        int time = 15;
        boolean isGoodWeather = false;
        boolean late = time >= 23 || time <= 5;
        if (late) {
            System.out.println("Спать");
        }
        if (!late && isGoodWeather) {
            System.out.println("Гулять");
        }
        if (!late && !isGoodWeather) {
            System.out.println("Читать книгу");
        }
    }
}
