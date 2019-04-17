package com.hh.test.practice.design.adapter.twoway;

/**
 * TODO
 *
 * @author huhui
 * @since 2019/4/16 15:25
 */
public class TwowayAdapter implements TwowayTraget,TwowayAdaptee{

    private TwowayTraget traget;

    private TwowayAdaptee adaptee;

    public TwowayAdapter(TwowayTraget traget, TwowayAdaptee adaptee){
        this.traget = traget;
        this.adaptee = adaptee;
    }

    @Override
    public void specificRequest() {
        traget.request();
    }

    @Override
    public void request() {
        adaptee.specificRequest();
    }
}
