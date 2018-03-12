package jp.techacademy.kenzou.nakase.javalog;

/**
 * Created by kenzo on 2018/02/18.
 */

abstract class Animal {
    String name;
    int age;

    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    abstract public void say();
}
