package com.javarush.task.task09.task0927;

import java.util.*;

/* 
Десять котов
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        //напишите тут ваш код
        HashMap<String, Cat> catMap = new HashMap<String, Cat>();
        for (int i = 0; i < 10; i++) {
            String name = "catName_" + i;
            Cat cat = new Cat(name);
            catMap.put(cat.name, cat);
        }
        return catMap;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        //напишите тут ваш код

        HashSet<Cat> cats = new HashSet<Cat>();
        for (Map.Entry<String, Cat> entry : map.entrySet()) {
            cats.add(entry.getValue());
        }

        return cats;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
