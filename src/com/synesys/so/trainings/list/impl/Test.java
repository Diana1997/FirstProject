package com.synesys.so.trainings.list.impl;

/**
 * Created by Harut on 09.06.2017.
 */
public class Test {
    public static void main(String[] args) {
        LinkedIntegerList list = new LinkedIntegerList();
        System.out.println(list.isEmpty());
        list.add(10);
        list.add(5);
        list.add(6);
        list.add(3);
        list.add(3);

        System.out.println(list);

        //System.out.println(list.size());

       // System.out.println(list.get(3));

        //list.add(1,10);
       // System.out.println(list);

       // list.add(0,11);
       // System.out.println(list);

        //System.out.println(list.indexOf(3));
        //System.out.println(list.lastIndexOf(3));

       // list.clear();
        System.out.println(list.remove(4));
        System.out.println(list);

        System.out.println(list.contains(1000));
    }
}
