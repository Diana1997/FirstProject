package Example;

/**
 * Created by Harut on 06.06.2017.
 */
public final class RealNumber  extends  Number{
    private final double value;

    public double getValue() {
        return value;
    }

    public RealNumber(double value){
        this.value = value;
    }


    @Override
    public Number modul() {
        return null;
    }

    @Override
    public Number sum(Number number) {
        return null;
    }

    @Override
    public Number sub(Number number) {
        return null;
    }

    @Override
    public Number multiply(Number number) {
        return null;
    }

    @Override
    public Number diviade(Number number) {
        return null;
    }
}
