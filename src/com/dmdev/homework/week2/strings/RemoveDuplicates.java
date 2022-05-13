package com.dmdev.homework.week2.strings;
/*
Дана строка.
Удалить из нее все повторяющиеся символы без учета регистра, если они идут друг за другом. Также удалить пробелы.
Результат привести к верхнему регистру.

Например:
"abc Cpddd Dio OsfWw" -> "ABCPDIOSFW"
 */


import java.util.Locale;

public class RemoveDuplicates {

    public static void main(String[] args) {
        String originalString = "#abc Cpddd Dio OsfWw";
        System.out.println(collectChars(originalString));

    }

    public static StringBuilder collectChars(String value) {
        StringBuilder result = new StringBuilder();
        value = value.toUpperCase();

        for (int i = 0; i < value.length(); i++) {
            char cur = value.charAt(i);
            if (isValidToAdd(result, cur)) {
                result.append(cur);
            }
        }

        return result;
    }
    private static boolean isValidToAdd(StringBuilder result, char cur) {
        return cur != ' ' && (result.isEmpty() || result.charAt(result.length() - 1) != cur);
    }


}
