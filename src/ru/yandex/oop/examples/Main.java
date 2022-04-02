package ru.yandex.oop.examples;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // Наследование
        Integer i = 5;
        Double d = 3.14;
        Number n = i;
        n = d;

        // Инкапсуляция, перегрузка
        System.out.println("Hello world!");

        // Переопределение
        String doubleString = d.toString();

        // Дженерики, полиморфизм
        Map<Integer, String> map = new HashMap<Integer, String>();
        Set<Integer> set = new HashSet<>();
    }
}
