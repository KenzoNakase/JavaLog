package jp.techacademy.kenzou.nakase.javalog;

/**
 * Created by kenzo on 2018/02/18.
 */

import android.util.Log;

class Human extends Animal implements Thinkable {

    String hobby;

    Human(String name, int age, String hobby){
        super(name, age);
        this.hobby = hobby;
    }

    public void say() {
        Log.d("javatest", "私の名前は" + this.name + "です。 " + "歳は" + this.age + "歳です。");
    }

    public void think() {
        Log.d("javatest", "私は" + this.hobby + "について考える。");
    }
}
