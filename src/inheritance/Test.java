package inheritance;


public class Test {

    public static Point1D maxModul(Point1D[] arr){
        //double  max  = arr[0].modul();
        Point1D  p = arr[0];
        for (int i = 1; i<arr.length; ++i){
            if(p.modul() < arr[i].modul()){
                p = arr[i];
            }
        }
        return  p;
    }


    public static void main(String[] args) {
        Point1D[] arr = new Point1D[6];
        arr[0]  = new Point1D(5);
        arr[1]  = new Point1D(3);
        arr[2]  = new Point2D(3,5);
        arr[3]  = new Point2D(8,6);
        arr[4]  = new Point3D(3,1,2);
        arr[5]  = new Point3D(9,5,4);

        System.out.println(maxModul(arr));

        System.out.println(5/0);
    }
}
