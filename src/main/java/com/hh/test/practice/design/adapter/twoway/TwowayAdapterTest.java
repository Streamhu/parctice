package com.hh.test.practice.design.adapter.twoway;

/**
 * TODO
 *
 * @author huhui
 * @since 2019/4/16 15:28
 */
public class TwowayAdapterTest {

    public static void main(String[] args) {
        TwowayTraget twowayTraget = new TargetRealize();
        TwowayAdaptee twowayAdapter = new AdapteeRealize();

        TwowayAdapter adapter = new TwowayAdapter(twowayTraget, twowayAdapter);

        adapter.request();
        adapter.specificRequest();

    }
}
