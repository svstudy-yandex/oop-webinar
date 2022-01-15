package ru.yandex.oop.inheritance.good;

import ru.yandex.oop.inheritance.bad.Converter;

public class StepTracker {
    private final Converter converter;

    StepTracker() {
        converter = new Converter();
    }

    public double getCaloriesByMonth(int month) {
        int steps = 0;
        //...
        return converter.stepsToCalories(steps);
    }
}

