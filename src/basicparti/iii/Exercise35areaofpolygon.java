package basicparti.iii;

public class Exercise35areaofpolygon {
    public static void main(String[] args) {
        int n = 7;
        int s =6;
        double area=(n*Math.pow(s, 2))/(4*Math.tan(Math.PI/n));
        System.out.println("The area is : "+area);
    }
}
