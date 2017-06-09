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

    public Point1D move(double dx){
        return new Point1D(getX() + dx);
    }

    public double distance(Point3D p){
        return Math.sqrt( Math.pow((p.getX()- getX()), 2)+ Math.pow(p.getY(), 2) + Math.pow(p.getZ(), 2));
    }
}
