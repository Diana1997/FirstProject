package inheritance;


public class Point1D {

    final double x;

    public double getX() {
        return x;
    }

    public Point1D(double x){
        this.x = x;
    }

    public  Point1D(){
        this.x  = 0;
    }

    @Override
    public String toString(){
        return  "( " + getX() + ")";
    }

    public double modul(){
        return Math.abs(getX());
    }
}
