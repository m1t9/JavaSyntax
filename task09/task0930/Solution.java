package com.javarush.task.task09.task0930;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        while (true) {
            try {
                String s = reader.readLine();
                if (s.isEmpty()) {
                    break;
                }
                list.add(s);
            } catch (Exception e) {
                break;
            }
        }

        String[] array = list.toArray(new String[0]);
        String[] arrayCopy = new String[array.length];
        for (int i = 0; i < arrayCopy.length; i++)
            arrayCopy[i] = array[i];
        sort(arrayCopy);

        for (String x : arrayCopy) {
            System.out.println(x);
        }
    }

    public static void sort(String[] array) {
        // напишите тут ваш код

        // for numbers
        for (int i = 0; i < array.length - 1; i++) {
            if (isNumber(array[i])) {
                for (int j = i + 1; j < array.length; j++) {
                    if (isNumber(array[j])) {

                        if (Integer.parseInt(array[j]) > Integer.parseInt(array[i])) {
                            String num = array[i];
                            array[i] = array[j];
                            array[j] = num;

                        }
                    }
                }

            } else {
                // for words
                for (int k = i + 1; k < array.length; k++) {
                    if (!isNumber(array[k]) && !array[i].equals(array[k])) {

                        String[] word1 = array[i].split("");
                        String[] word2 = array[k].split("");
                        int l = 0;

                        while (word1[l].toLowerCase().equals(word2[l].toLowerCase())) {
                            System.out.println(l);
                            l++;
                        }

                        if (isGreaterThan( word1[l].toLowerCase(), word2[l].toLowerCase() )) {
                            String word = array[i];
                            array[i] = array[k];
                            array[k] = word;
                        }

                    }
                }
            }
        }
    }

    // Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }


    // Переданная строка - это число?
    public static boolean isNumber(String s) {
        if (s.length() == 0) return false;

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if ((i != 0 && c == '-') // Строка содержит '-'
                    || (!Character.isDigit(c) && c != '-') // или не цифра и не начинается с '-'
                    || (chars.length == 1 && c == '-')) // или одиночный '-'
            {
                return false;
            }
        }
        return true;
    }
}
