package com.jiaozhu.tower.pannel;

import com.jiaozhu.tower.model.Person;
import com.jiaozhu.tower.model.PersonStack;
import com.jiaozhu.tower.model.StatusStack;

/**
 * Created by jiaozhu on 2016/10/28.
 */

public class Test {
    public static void main(String s[]) {
        Person p = PersonStack.human;
        p.addStatus(StatusStack.status1);
        System.out.println(p);
        for (int i = 0; i < 5; i++) {
            p.actStatus();
            System.out.println(p);
        }
    }
}
