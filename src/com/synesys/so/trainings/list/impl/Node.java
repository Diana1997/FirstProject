package com.synesys.so.trainings.list.impl;

/**
 * Created by Harut on 09.06.2017.
 */
final class Node {

    private int value;

    private Node next;

    Node(int value){
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    int getValue() {
        return value;
    }

    void setValue(int value) {
        this.value = value;
    }
}
