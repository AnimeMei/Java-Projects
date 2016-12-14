
public class TestQuadratic {
    public static void main (String [] args){
        Quadratic myEquation = new Quadratic();
        System.out.println(myEquation.getA() + " " + myEquation.getB() + " "
                            + myEquation.getC() + "\n" + " Solution " +
                             myEquation.eval(1.0));
    }
}
