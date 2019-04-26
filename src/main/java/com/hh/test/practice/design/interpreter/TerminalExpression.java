package com.hh.test.practice.design.interpreter;

import java.util.HashSet;
import java.util.Set;

/**
 * TODO
 *
 * @author huhui
 * @since 2019/4/25 8:33
 */
public class TerminalExpression implements AbstractExpression{

    private Set<String> set = new HashSet<>();

    public TerminalExpression(String[] data){
        for(int i = 0; i<data.length; i++){
            set.add(data[i]);
        }
    }

    @Override
    public Boolean interpret(String info) {
        if(set.contains(info)){
            return true;
        }
        return false;
    }
}
