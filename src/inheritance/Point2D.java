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
        this.y = y;
    }

    @Override
    public String toString(){
        return  "( " + getX() + "," + getY() + ")";
    }

    @Override
    public double modul(){
        return  Math.sqrt(getX() * getX() + getY() * getY());
    }

    public Point2D move(double dx, double dy){
        return  new Point2D(getX() + dx, getY() + dy);
    }


    @Override
    public double distance(Point3D p){
        return Math.sqrt( Math.pow((p.getX()- getX()), 2)+ Math.pow((p.getY()-getY()), 2) + Math.pow(p.getZ(), 2));
    }
}
