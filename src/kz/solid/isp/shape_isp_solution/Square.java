package kz.solid.isp.shape_isp_solution;

public class Square implements ISquare{
    @Override
    public void drawSquare(double side) {
        System.out.println("Draw square with side " + side);
    }
}
