package com.javarush.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Количество букв
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Алфавит
        String abc = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        char[] abcArray = abc.toCharArray();

        ArrayList<Character> alphabet = new ArrayList<Character>();
        for (int i = 0; i < abcArray.length; i++) {
            alphabet.add(abcArray[i]);
        }

        // Ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }


        // напишите тут ваш код
        int[] count = new int[abcArray.length];
        for (int i = 0; i < count.length; i++) {
            count[i] = 0;
        }

        for (int n = 0; n < list.size(); n++) {
            String[] str = list.get(n).split("");
            for (int i = 0; i < str.length; i++) {
                for (int j = 0; j < abcArray.length; j++) {
                    String abcArrayString = String.valueOf(abcArray[j]);
                    if (str[i].equals(abcArrayString)) {
                        count[j] += 1;
                    }
                }
            }
        }

        for (int i = 0; i < count.length; i++) {
            System.out.print(abcArray[i] + " ");
            System.out.println(count[i]);
        }

    }

}
