package InterfacePraktika;

import java.util.Arrays;
import java.util.function.IntConsumer;
import java.util.function.IntPredicate;
import java.util.function.IntSupplier;

/**
 * Created by Harut on 20.06.2017.
 */
public class Test {
    public static   IntSupplier maxElem(IntSupplier[] arr){
        IntSupplier max = arr[0];
        for(int i=1; i<arr.length; ++i){
            if(max.getAsInt() < arr[i].getAsInt()){
                max = arr[i];
            }
        }
        return max;
    }

    public static boolean isRepeat(IntSupplier[] arr){
        for(int i = 0; i<arr.length; ++i){
            for(int j = i+1 ; j<arr.length; ++j){
                if(arr[i].getAsInt() == arr[j].getAsInt()){
                    return  true;
                }
            }
        }
        return false;
    }
    public static void acceptAll(IntConsumer[] arr, int value){
        for(int i = 0; i<arr.length; ++i){
            arr[i].accept(value);
        }
    }

    public static boolean testAll(IntPredicate[] arr, int value){
        for(int i=0; i<arr.length; ++i){
            if(!arr[i].test(value)){
                return false;
            }
        }
        return true;

    }
    public static void main(String[] args) {
        Peros[] arr = {
                new Peros(12),
                new Peros(95),
                new Peros(45),
                new Peros(45),
        };
        System.out.println(Test.maxElem(arr));
        System.out.println(Test.isRepeat(arr));
        Test.acceptAll(arr, 2);
        System.out.println(Arrays.toString(arr));
    }
}
