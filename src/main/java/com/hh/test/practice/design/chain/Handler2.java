package com.hh.test.practice.design.chain;

/**
 * TODO
 *
 * @author huhui
 * @since 2019/4/18 10:52
 */
public class Handler2 extends Handler{

    @Override
    public void handleRequest(String request) {
        if("two".equals(request)){
            System.out.println("处理器2处理请求");
        }else if(getNext() != null){
            getNext().handleRequest(request);
        }else{
            System.out.println("没有人处理该请求");
        }
    }
}
