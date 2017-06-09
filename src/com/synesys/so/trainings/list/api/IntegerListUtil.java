package com.synesys.so.trainings.list.api;

/**
 * Created by albert.ohanyan on 6/8/2017.
 */
public final class IntegerListUtil {

    public static void sortAsc(IntegerList list) {
        if(list != null) {
            for(int i = 0; i < list.size() - 1; ++i) {
                for(int j = 0; j < list.size() - 1; ++j) {
                    if(list.get(j) > list.get(j + 1)) {
                        int t = list.get(j);
                        list.set(j, list.get(j + 1));
                        list.set(j + 1, t);
                    }
                }
            }
        }
    }

    public static int sumElements(IntegerList list) {
        int sum = 0;
        if(list != null) {
            for(int i = 0; i < list.size(); ++i) {
                sum += list.get(i);
            }
        }
        return sum;
    }

    private IntegerListUtil() { }
}
