package com.hh.test.practice.design.prototype;

import java.util.HashMap;
import java.util.Map;

/**
 * TODO
 *
 * @author huhui
 * @since 2019/4/12 14:20
 */
public class ProtoTypeManager {

    private Map<String, Shape> ht = new HashMap<String, Shape>();

    public ProtoTypeManager(){
        ht.put("Circle", new Circle());
        ht.put("Square", new Square());
    }

    public void addShape(String key, Shape obj){
        ht.put(key, obj);
    }

    public Shape getShape(String key){
        Shape prototypeEntity = ht.get(key);
        return (Shape)prototypeEntity.clone();
    }


    public static void main(String[] args) {
        ProtoTypeManager manager = new ProtoTypeManager();
        Shape obj1 = manager.getShape("Circle");
        obj1.countArea();
        Shape obj2 = manager.getShape("Square");
        obj2.countArea();
    }
}
