package com.jiaozhu.tower.model;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Person {
    public float hp = 0;
    public float mp = 0;

    private List<Status> statusList = new LinkedList<>();//状态列表
    private List<Point> pointList = new ArrayList<>();//状态列表

    public Point str = newPoint();//力量
    public Point dex = newPoint();//敏捷
    public Point con = newPoint();//体质
    public Point nt = newPoint();//智力
    public Point wis = newPoint();//感知


    public Point hpMax = newPoint();
    public Point mpMax = newPoint();
    public Point atk = newPoint();//基础攻击力 = 武器提供
    public Point def = newPoint();//基础防御力 = 护甲提供
    public Point res = newPoint();//基础抗性 =
    public Point eft = newPoint();//影响力
    public Point dge = newPoint();//闪避
    public Point crt = newPoint();//暴击


    public Person() {

    }

    public Person(float... num) {
        for (int i = 0; i < num.length && i < pointList.size(); i++) {
            pointList.get(i).base = num[i];
        }
        hp = hpMax.getReal();
        mp = mpMax.getReal();
    }

    /**
     * 获取新的point
     *
     * @return
     */
    private Point newPoint() {
        Point point = new Point();
        pointList.add(point);
        return point;
    }

    /**
     * 应用状态
     */
    public void actStatus() {
        for (Point point : pointList) {
            point.clearAddition();
        }
        for (int i = 0; i < statusList.size(); i++) {
            Status status = statusList.get(i);
            if (status.action(this) < 1) {
                statusList.remove(status);
                --i;
            }
        }
    }

    /**
     * 增加状态
     *
     * @param status
     */
    public void addStatus(Status status) {
        statusList.add(status);
    }

    @Override
    public String toString() {
        return "Person{" +
                "hp=" + hp +
                ", mp=" + mp +
                ", str=" + str +
                ", dex=" + dex +
                ", con=" + con +
                ", nt=" + nt +
                ", wis=" + wis +
                ", hpMax=" + hpMax +
                ", mpMax=" + mpMax +
                ", atk=" + atk +
                ", def=" + def +
                ", res=" + res +
                ", eft=" + eft +
                ", dge=" + dge +
                ", crt=" + crt +
                '}';
    }
}
