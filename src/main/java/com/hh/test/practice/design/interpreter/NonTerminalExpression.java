package com.hh.test.practice.design.interpreter;

/**
 * TODO
 *
 * @author huhui
 * @since 2019/4/25 8:34
 */
public class NonTerminalExpression implements AbstractExpression{

    private AbstractExpression city = null;

    private AbstractExpression person = null;

    public NonTerminalExpression(AbstractExpression city, AbstractExpression person){
        this.city = city;
        this.person = person;
    }

    @Override
    public Boolean interpret(String info) {
        String[] s = info.split("的");
        return city.interpret(s[0])&&person.interpret(s[1]);
    }
}
