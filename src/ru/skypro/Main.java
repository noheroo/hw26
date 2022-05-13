package ru.skypro;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	   task1();
       task2();
       task3();
    }
    public static void task1() {
        List<Integer> nums1 = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        System.out.print("Задание 1. Нечетные числа из списка: ");
        for (Integer integer : nums1) {
            if ((integer % 2) != 0) {
                System.out.print(integer + ", ");
            }
        }
    }

    public static void task2() {
        List<Integer> nums1 = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        Set<Integer> nums2 = new LinkedHashSet<>();
        System.out.println();
        System.out.print("Задание 2. Четные числа из списка (без повторов): ");
        for (Integer integer : nums1) {
            if (integer % 2 == 0) {
                nums2.add(integer);
            }
        }
        System.out.println(nums2);
    }

    public static void task3() {

        String s = "Напишите код, который который выводит в консоль все уникальные уникальные слова из списка слов, в котором могут могут встречаться дубли. ";
        String s1 = s.replaceAll("\\pP", "");
        List<String> strings = new ArrayList<>(List.of(s1.split(" ")));
        Set<String> result = Set.copyOf(strings);
        System.out.print("Задание 3. Уникальные слова " );
        System.out.println(result);
    }






}
