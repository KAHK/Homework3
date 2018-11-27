package shapes;

public class Circle extends Shape {
    public Circle(double parA, double parB){
        super(parA, parB);
        setParams(2, 3.1415926535797);
    }
    public double calculateSurface(){
        return parA*parB*parB;
    }
}
