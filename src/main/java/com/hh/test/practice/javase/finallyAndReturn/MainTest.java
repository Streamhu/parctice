package com.hh.test.practice.javase.finallyAndReturn;

/**
 * TODO
 *
 * @author huhui
 * @since 2019/8/21 15:01
 */
public class MainTest {

    public static void main(String[] args) {
        System.out.println("return返回 = " + test5());

    }

    /**
     * 当finally调用的任何可变API，会修改返回值；当finally调用任何的不可变API，对返回值没有影响。
     * 也就是先执行return的语句，然后再执行finally块，块里面如果有对引用对象里面某个属性的改变是会修改的，但是赋值不变（值引用，基本数据类型或地址）
     * 返回结果：hello world finally
     * */
    public static String test5(){
        StringBuffer sb = new StringBuffer("hello ");
        try{
            sb.append("world ");
            return sb.toString();
        }finally {
            System.out.println("finaly模块被执行");
            sb.append("finally ");
        }
    }

    /**
     * try块中有return
     * 且finally对返回变量做修改
     * finally块先执行，再执行finally块里的return(但是finally不会影响到return返回的变量)
     * */
    public static int test4(){
        int result = 1;
        try{
            return result;
        }finally {
            System.out.println("finaly模块被执行");
            result = 3;
            System.out.println(result);
        }
    }

    /**
     * try块中有return，且catch块中有return,且 finally块中也有return，有异常时，finally块先执行，再执行finally块里的return
     * */
    public static int test3(){
        try{
            int a = 2/0;
            return 1;
        }catch (Exception e){
            return 2;
        }finally {
            System.out.println("finaly模块被执行");
            return 3;
        }
    }

    /**
     * try块中有return，且catch块中有return，有异常时，finally块先执行，再执行return
     * */
    public static int test2(){
        try{
            int a = 2/0;
            return 1;
        }catch (Exception e){
            return 2;
        }finally {
            System.out.println("finaly模块被执行");
        }
    }

    /**
     * try块中有return，且catch块中无return，finally块先执行，再执行return
     * */
    public static int test1(){
        try{
            return 1;
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("finaly模块被执行");
        }
        return 0;
    }
}
