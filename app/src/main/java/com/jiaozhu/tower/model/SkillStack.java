package com.jiaozhu.tower.model;

import java.util.Random;

/**
 * Created by jiaozhu on 2016/12/14.
 */

public class SkillStack {
    private static Random random = new Random();

    /**
     * 计算随机伤害
     *
     * @param since
     * @param to
     * @return
     */
    public static float random(float since, float to) {
        return since + (to - since) * random.nextFloat();
    }

    /**
     * 物理伤害计算
     *
     * @param attack 攻击
     * @param define 防御
     * @return
     */
    public static float getAtkDamage(float attack, float define) {
        if (attack - define < 1)
            return 1;
        return attack - define;
    }

    /**
     * 计算魔法伤害
     *
     * @param attack
     * @param define
     * @return
     */
    public static float getMgcDamage(float attack, float define) {
        return attack * (1 - define / 100 + define);
    }

    static class Skill01 extends Skill {

        {
            name = "火球术";
            description = "造成少量伤害";
        }

        @Override
        public boolean actionable(Person source, Person target) {
            return source.mp >= 2 + lv;
        }

        @Override
        public String act(Person source, Person target) {
            source.mp -= 2 + lv;
            float num = source.nt.getReal() * 0.1f + random(2, 4);
            num = getMgcDamage(num, target.res.getReal());
            return "造成" + num + "点伤害";
        }
    }
}
