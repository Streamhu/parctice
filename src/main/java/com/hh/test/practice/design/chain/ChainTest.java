package com.hh.test.practice.design.chain;

/**
 * TODO
 *
 * @author huhui
 * @since 2019/4/18 10:53
 */
public class ChainTest {

    public static void main(String[] args) {
        // 组长责任链
        Handler handler1 = new Handler1();
        Handler2 handler2 = new Handler2();
        handler1.setNext(handler2);
        // 提交强求
        handler1.handleRequest("two");
    }
}
