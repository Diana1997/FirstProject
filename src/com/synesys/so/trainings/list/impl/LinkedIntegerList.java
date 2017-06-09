package com.synesys.so.trainings.list.impl;

/**
 * Created by Harut on 09.06.2017.
 */
public class LinkedIntegerList extends com.synesys.so.trainings.list.api.IntegerList {

    private Node head;


    @Override
    public int size() {
        if(this.isEmpty()){
            return 0;
        }
        int count  = 1;
        Node currentNode = head;
        while (currentNode.getNext() != null){
            ++count;
            currentNode = currentNode.getNext();
        }
        return count;
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public int get(int index) {
        if(index < 0 || index>= this.size()){
            System.err.println("index must be in range: [0, " + (this.size() - 1) + "]");
        }
        int currentIndex = 0;
        Node currentNode = head;
        while (currentIndex != index){
            currentNode = currentNode.getNext();
            ++currentIndex;
        }
        return currentNode.getValue();
    }

    @Override
    public void add(int element) {
        Node addingNode = new Node(element);
        if(this.isEmpty()){
            head = addingNode;
        }else {
            Node currentNode = head;
            while (currentNode.getNext() != null){
                currentNode = currentNode.getNext();
            }
            currentNode.setNext(addingNode);
        }
    }

    @Override
    public void add(int index, int element) {
        if(index<0 || index>size()){

        }

        Node addingNode = new Node(element);
        if(index == 0 ) {
            addingNode.setNext(head);
            head = addingNode;
        }
        if (index > 0) {
            Node currentNode = head;
            int currentIndex = 0;
            while (currentIndex < index){
                currentNode = currentNode.getNext();
                ++currentIndex;
            }
            addingNode.setNext(currentNode.getNext());
            currentNode.setNext(addingNode);
        }


    }

    @Override
    public boolean set(int index, int element) {
        return false;
    }

    @Override
    public int indexOf(int element) {
        Node currentNode = head;
        int index  = -1;
        for(int i = 0; i<size(); ++i){
            if(currentNode.getValue() == element){
                return i;
            }
            currentNode = currentNode.getNext();
        }
        return index;

       /*int index = 0;
        while (currentNode.getValue() != element && index<size()){
            currentNode = currentNode.getNext();
            ++index;
        }
        if(index == 0  || index>0) {
            return index;
        }
        return  -1;
        */
    }

    @Override
    public int lastIndexOf(int element) {
        Node currentNode = head;
        int index  = -1;
        for(int i = 0; i<size(); ++i){
            if(currentNode.getValue() == element){
                index =  i;
            }
            currentNode = currentNode.getNext();
        }

        return index;
    }

    @Override
    public void clear() {
        head = null;
    }

    @Override
    public int remove(int index) {
        Node currentNode = head;
        int currentIndex = 0;

        if(index == 0){
            int value = head.getValue();
            head = head.getNext();
            return value;
        }
        if(size()-1 == index){
            while (currentIndex < size()-2 ){
                currentNode = currentNode.getNext();
                ++currentIndex;
            }
            int value = currentNode.getNext().getValue();
            currentNode.setNext(null);
            return value;
        }
        while (currentIndex < index-1){
            currentNode = currentNode.getNext();
            ++currentIndex;
        }
        int k =    currentNode.getValue();
        currentNode.setNext(currentNode.getNext().getNext());


        return k;
    }


    @Override
    public boolean contains(int element) {
        Node currentNode = head;
        for(int i = 0; i<size(); ++i){
            if(currentNode.getValue() == element){
                return true;
            }
            currentNode = currentNode.getNext();
        }
        return false;
    }

    @Override
    public String toString(){
        if(this.isEmpty()){
            return  "[]";
        }
        Node currentNode = head;
        String res = "[";
        while(currentNode != null){
            res  += currentNode.getValue() + ",";
            currentNode = currentNode.getNext();
        }
        res = res.substring(0, res.length() - 1);
        res  += "]";
        return  res;
    }
}
