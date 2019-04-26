package com.hh.test.practice.design.interpreter;

/**
 * TODO
 *
 * @author huhui
 * @since 2019/4/25 8:35
 */
public class Context {

    private String[] citys = {"深圳","南昌"};

    private String [] persons = {"老人","妇女","儿童"};

    private AbstractExpression cityPerson;

    public Context(){
        AbstractExpression city = new TerminalExpression(citys);

        AbstractExpression person = new TerminalExpression(persons);

        cityPerson = new NonTerminalExpression(city, person);
    }

    public void freeRide(String info){
        boolean ok = cityPerson.interpret(info);
        if(ok){
            System.out.println("您是"+info+"，您本次乘车免费！");
        }else{
            System.out.println(info+"，您不是免费人员，本次乘车扣费2元！");
        }
    }


}
