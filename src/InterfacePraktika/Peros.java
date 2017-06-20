package InterfacePraktika;

import javax.sound.midi.Soundbank;
import java.util.function.IntConsumer;
import java.util.function.IntPredicate;
import java.util.function.IntSupplier;

/**
 * Created by Harut on 20.06.2017.
 */
public class Peros implements IntSupplier, IntConsumer, IntPredicate{
    private int salary;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Peros(int salary){
        this.salary  = salary;
    }

    @Override
    public int getAsInt() {
        return getSalary();
    }

    @Override
    public String toString(){
        return "salaery  : " +  getSalary();
    }

    @Override
    public void accept(int value) {
        setSalary(getSalary() * value);
    }

    @Override
    public boolean test(int value) {
        if(this.salary > value){
            return true;
        }
        return false;
    }

   /* public static void main(String[] args) {
        Peros[] arr = {
                new Peros(12),
                new Peros(95),
                new Peros(45),
                new Peros(45),
        };
        System.out.println(Test.maxElem(arr));
        System.out.println(Test.isRepeat(arr));
    }
*/
}
