package Circle;
public class CircleRunner {
    public static void main(String[] args){
        Circle ian = new Circle(3);
        double ik = ian.getC();
        System.out.println("The circumference is: " + ik);

        double jd = ian.getArea();
        System.out.println("The area is: " + jd);

        ian.changeR(1);

        double ww = ian.getArea();
        System.out.println("The new area is: " + ww);
    }
}
