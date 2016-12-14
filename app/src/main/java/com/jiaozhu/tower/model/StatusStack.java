package com.jiaozhu.tower.model;

/**
 * Created by jiaozhu on 2016/10/28.
 */

public class StatusStack {
    public static Status status1 = new Status("攻击上升", 3, "攻击力上升2") {
        @Override
        void onStart(Person person) {
            person.atk.add(2);
        }
    };
}
