package kz.solid.isp.shape_isp_solution;

public class Triangle implements ITriangle{
    @Override
    public void drawTriangle(double a, double b, double c) {
        System.out.println("Draw triangle with sides a, b, c: " + a + ", " + b + ", " + c);
    }
}
