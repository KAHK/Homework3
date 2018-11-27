package shapes;

public class Triangle extends Shape {
    public Triangle(double parA, double parB) {
        super(parA, parB);
        setParams(2,3);
    }
    public double calculateSurface(){
        return 0.5 * parA * parB;
    }
}
