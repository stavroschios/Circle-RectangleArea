public class areacalculator {
    private  static final int ERROR_NEGATIVE = -1;


    public static double area(double radius){
        if ( radius < 0) {
            return ERROR_NEGATIVE;
        }
        double area = Math.PI * radius * radius;
        return area;

    }

    public static double area(double a, double b) {
        if( (a < 0) | (b < 0)) {
            return ERROR_NEGATIVE;
        }

        double rectangleArea = a * b;

        return rectangleArea;

    }




    public static void main(String[] args) {
        System.out.println(area(-9));
        System.out.println(area(2, -9));


    }


}
