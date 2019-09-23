package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        // Напишите тут ваши переменные и конструкторы
        private String firstName;
        private String lastName;
        private int age;
        private boolean sex;
        private int weight;
        private String address;

        public Human(String firstName, String lastName, int age, boolean sex, int weight, String address) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.sex = sex;
            this.weight = weight;
            this.address = address;
        }

        public Human(String firstName, String lastName, int age, boolean sex, int weight) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.sex = sex;
            this.weight = weight;
        }

        public Human(String firstName, String lastName, int age, boolean sex) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.sex = sex;
        }

        public Human(String firstName, String lastName, int age) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
        }

        public Human(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public Human(String firstName, String lastName, boolean sex, int weight, String address) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.sex = sex;
            this.weight = weight;
            this.address = address;
        }

        public Human(String firstName, String lastName, int age, boolean sex, String address) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.sex = sex;
            this.address = address;
        }

        public Human(String firstName, int age, boolean sex, int weight, String address) {
            this.firstName = firstName;
            this.age = age;
            this.sex = sex;
            this.weight = weight;
            this.address = address;
        }

        public Human(String firstName, int age, boolean sex, int weight) {
            this.firstName = firstName;
            this.age = age;
            this.sex = sex;
            this.weight = weight;
        }

        public Human(String firstName) {
            this.firstName = firstName;
        }
    }
}
