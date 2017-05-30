package inheritance;

/**
 * Created by Harut on 30.05.2017.
 */
public class Point3D  extends Point2D{

    final double z;

    public double getZ() {
        return z;
    }

    public Point3D(){
        super(0,0);
        this.z = 0;
    }

    public Point3D(double x, double y, double z){
        super(x,y);
        this.z = z;
    }

    @Override
    public String toString(){
        return  "( " + getX() + "," + getY() + "," + getZ() + ")";
    }

    @Override
    public double modul(){
        return  Math.sqrt(getX() * getX() + getY() * getY() + getZ() * getZ());
    }
}
