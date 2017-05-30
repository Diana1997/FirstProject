package inheritance;


public class Point2D extends  Point1D{

    final double y;

    public double getY() {
        return y;
    }

    public Point2D(){
        super(0);
        this.y = 0;
    }

    public  Point2D(double x, double y){
        super(x);
        this.y = 0;
    }

    @Override
    public String toString(){
        return  "( " + getX() + "," + getY() + ")";
    }

    @Override
    public double modul(){
        return  Math.sqrt(getX() * getX() + getY() * getY());
    }

}
