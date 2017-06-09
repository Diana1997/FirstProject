package com.synesys.so.trainings.list.api;

/**
 * Created by albert.ohanyan on 6/8/2017.
 */
public abstract class IntegerList {

    public abstract int size();

    public abstract boolean isEmpty();

    public abstract int get(int index);

    public abstract void add(int element);

    public abstract void add(int index, int element);

    public abstract boolean set(int index, int element);

    public abstract int indexOf(int element);

    public abstract int lastIndexOf(int element);

    public abstract void clear();

    public abstract int remove(int index);

    public abstract boolean contains(int element);
}
