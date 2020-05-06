package basicparti.iii;

public class Exercise34areaofhexagon {
    public static void main(String[] args) {
        int s = 6;

        double area = (6 * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / 6));
        System.out.println("The area of the hexagon is : " + area);
    }
}
