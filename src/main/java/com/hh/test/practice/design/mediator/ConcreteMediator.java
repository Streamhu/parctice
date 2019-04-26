package com.hh.test.practice.design.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * TODO
 *
 * @author huhui
 * @since 2019/4/18 15:52
 */
public class ConcreteMediator implements Mediator {

    private List<Colleague> colleagues = new ArrayList<>();

    @Override
    public void register(Colleague colleague) {
        if(! colleagues.contains(colleague)){
            colleagues.add(colleague);
            colleague.setMediator(this);
        }
    }

    @Override
    public void relay(Colleague colleague) {
        for(Colleague colleagueTemp : colleagues){
            if(! colleagueTemp.equals(colleague)){
                colleagueTemp.receiver();
            }
        }
    }
}
