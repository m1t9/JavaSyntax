package com.javarush.task.task09.task0926;

import java.util.ArrayList;

/* 
Список из массивов чисел
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        //напишите тут ваш код
        ArrayList<int []> list = new ArrayList<>();
        int[] lengths = {5, 2, 4, 7, 0};
        
        for (int ln : lengths) {
            int[] arr = new int[ln];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = (int) (Math.random() * 10);
            }
            list.add(arr);
        }

        return list;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
