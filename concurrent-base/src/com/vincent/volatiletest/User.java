package com.vincent.volatiletest;

/**
 * �û�
 * @ClassName: User
 * @Description: �û�
 * @author: VincentHo
 * @date: 2019��3��30�� ����12:39:40
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
