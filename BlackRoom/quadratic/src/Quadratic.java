
public class Quadratic {
    private double aCoef;
    private double bCoef;
    private double cCoef;

    public Quadratic(){
        aCoef = 10;
        bCoef = 6;
        cCoef = 12;
    }

    public double eval(double x){
        return (aCoef * x * x + bCoef * x + cCoef);
    }

    public double getA(){
        return aCoef;
    }

    public double getB(){
        return bCoef;
    }

    public double getC(){
        return cCoef;
    }

}
