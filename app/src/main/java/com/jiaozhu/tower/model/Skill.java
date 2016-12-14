package com.jiaozhu.tower.model;

/**
 * Created by jiaozhu on 2016/12/14.
 */

public abstract class Skill {
    public String name = "";
    public String description = "";
    public int lv = 1;

    /**
     * 是否能够发动技能
     *
     * @param source
     * @param target
     * @return
     */
    public abstract boolean actionable(Person source, Person target);

    /**
     * 技能发动效果
     *
     * @param source
     * @param target
     * @return
     */
    public abstract String act(Person source, Person target);

    /**
     * 技能发动
     *
     * @param source
     * @param target
     * @return
     */
    public String doAct(Person source, Person target) {
        return act(source, target);
    }
}
