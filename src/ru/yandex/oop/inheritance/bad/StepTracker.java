package ru.yandex.oop.inheritance.bad;

public class StepTracker extends Converter {

    public double getCaloriesByMonth(int month) {
        int steps = 0;
        //...
        return stepsToCalories(steps);
    }
}
