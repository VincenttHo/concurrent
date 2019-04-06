package com.vincent.volatiletest;

/**
 * 用户
 * @ClassName: User
 * @Description: 用户
 * @author: VincentHo
 * @date: 2019年3月30日 下午12:39:40
 */
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
