package Box;
public class BoxRunner {
    public static void main(String[] args) {
        Box bob = new Box(2,6);
        double jd = bob.getArea();
        System.out.println("The area is: " + jd);

        bob.bigger(2);
        double ld = bob.getPerimeter();
        System.out.println("The double perimeter is " + ld);
    }
}
