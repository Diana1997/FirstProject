package inheritance;


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

    public Point2D move(double dx, double dy, double dz){
        return  new Point3D(getX() + dx, getY() + dy, getZ() + dz);
    }

    @Override
    public double distance(Point3D p){
        return Math.sqrt( Math.pow((p.getX()- getX()), 2)+ Math.pow((p.getY()-getY()), 2) + Math.pow((p.getZ()- getZ()), 2));
    }
}
