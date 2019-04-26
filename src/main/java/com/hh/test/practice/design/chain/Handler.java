package com.hh.test.practice.design.chain;

public abstract class Handler {

    private Handler next;

    public void setNext(Handler next){
        this.next = next;
    }

    public Handler getNext(){
        return this.next;
    }

    public abstract void handleRequest(String request);

}
