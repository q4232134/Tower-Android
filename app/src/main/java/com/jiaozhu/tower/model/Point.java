package com.jiaozhu.tower.model;

/**
 * Created by jiaozhu on 2016/10/28.
 */

public class Point {
    public float base = 0;
    public float add = 0;

    Point() {

    }

    Point(float base) {
        this.base = base;
    }

    /**
     * 增加
     *
     * @param num
     * @return
     */
    public float add(float num) {
        add += num;
        return getReal();
    }

    /**
     * 按百分比增加
     *
     * @param num
     * @return
     */
    public float addPercent(float num) {
        return add(base * num);
    }


    public float getReal() {
        return base + add;
    }

    /**
     * 清除附加属性
     *
     * @return
     */
    public void clearAddition() {
        add = 0;
    }

    @Override
    public String toString() {
        return String.valueOf(getReal());
    }
}
