package Example;

import org.omg.PortableInterceptor.INACTIVE;

/**
 * Created by Harut on 06.06.2017.
 */
public final class IntegerNumber extends Number {

    private final int value;

    public int getValue() {
        return value;
    }

    public IntegerNumber(int value){
        this.value = value;
    }

    @Override
    public Number modul() {
        return null;
    }



    @Override
    public Number sum(Number number) {
        if(number instanceof IntegerNumber){
            IntegerNumber thatNumber = (IntegerNumber) number;
            return  new IntegerNumber(this.getValue() + thatNumber.getValue());
        }
        if(number instanceof  RealNumber){
            RealNumber thatNumber = (RealNumber) number;
            return  new RealNumber(this.getValue() + thatNumber.getValue());
        }
        return null; //exeption
    }
    @Override
    public Number sub(Number number) {
        if(number instanceof  IntegerNumber){
            IntegerNumber thatNumber = (IntegerNumber) number;
            return  new IntegerNumber(this.getValue() - thatNumber.getValue());
        }
        if(number instanceof  RealNumber){
            RealNumber thatNumber = (RealNumber) number;
            return  new RealNumber(this.getValue() - thatNumber.getValue());
        }
        return null;
    }

    @Override
    public Number multiply(Number number) {
        if(number instanceof  IntegerNumber){
            IntegerNumber thatNumber = (IntegerNumber) number;
            return  new IntegerNumber(this.getValue() * thatNumber.getValue());
        }
        if(number instanceof  RealNumber){
            RealNumber thatNumber = (RealNumber) number;
            return  new RealNumber(this.getValue() * thatNumber.getValue());
        }
        return null;
    }

    @Override
    public Number diviade(Number number) {
        if(number instanceof IntegerNumber){
            IntegerNumber thatNumber = (IntegerNumber) number;
            if( this.getValue() % thatNumber.getValue() == 0) {
                return new IntegerNumber(this.getValue() / thatNumber.getValue());
            }
            if( this.getValue() % thatNumber.getValue() != 0) {
                return new RealNumber(this.getValue() / thatNumber.getValue());
            }
        }
        return null;
    }
}
