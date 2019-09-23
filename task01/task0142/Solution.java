package com.javarush.task.task01.task0142;//package com.javarush.task.task01.task0142;
//
///*
//Амиго очень умный
//*/
//
//public class Solution {
//    public static void main(String[] args) {
//        //напишите тут ваш код
//        System.out.println("Амиго очень умный");
//    }
//}

public class Solution {
    public static void main(String[] args) {
        for (int i = 30; i >= 0; i--) {
            System.out.println(i);

            //напишите тут ваш код
            try {
                Thread.sleep(100);
            } catch (Exception e) {

            }
        }

        System.out.println("Бум!");
    }
}