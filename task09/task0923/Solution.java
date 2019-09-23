package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
//        ArrayList<String> vowelList = new ArrayList<String>();
//        ArrayList<String> consList = new ArrayList<String>();
        String vowelString = "";
        String consString = "";

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();

        String[] splitStr = str.split("");
        for (String i : splitStr) {
//            System.out.println(i);
            if (isVowel(i.charAt(0)) && !i.equals(" ")) {
//                vowelList.add(i);
                vowelString += i;
                vowelString += " ";
//                vowelList.add();
            } else if(!i.equals(" ")){
//                consList.add(i);
                consString += i;
                consString += " ";
            }
        }

        System.out.println(vowelString);
        System.out.println(consString);

    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : vowels)   // ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }
}