package kz.solid.isp.shape_isp_solution;

public class Rectangle implements IRectangle{
    @Override
    public void drawRectangle(double width, double height) {
        System.out.println("Draw rectangle with width " + width + " and height " + height);
    }
}
