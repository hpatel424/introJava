package Methods;

public class area {
    public static void main (String[] arg){
        System.out.println("Hello area!");
        System.out.println(areaOfCircle(5));
        System.out.println(areaOfRectangle(5,6));
    }
    public static double areaOfCircle (double radius){
        return Math.PI * Math.pow(radius,2);
    }

    public static double areaOfRectangle(double length, double width){
        return length * width;
    }
}
