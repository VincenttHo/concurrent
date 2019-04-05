package com.vincent.volatiletest;

public class User {
    private volatile  int age = 0;

    public int getAge() {
        return age;
    }

    public void addAge() {
        this.age ++;
    }

    public static void main(String[] args) {
        boolean a = false;
        a = true;
    }
}
