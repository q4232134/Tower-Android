package com.jiaozhu.tower.model;

/**
 * Created by jiaozhu on 2016/10/28.
 */

public abstract class Status {
    public int duration = 0;
    public String name = "";
    public String description = "";

    public Status() {
        super();
    }

    public Status(String name, int duration, String content) {
        this.name = name;
        this.duration = duration;
        this.description = content;
    }

    /**
     * 执行状态
     *
     * @param person
     * @return <=0说明状态已经失效
     */
    public int action(Person person) {
        if (duration > 0) {
            onStart(person);
            return --duration;
        } else {
            return duration;
        }
    }

    abstract void onStart(Person person);

}
