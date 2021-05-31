package kz.solid.isp.shape_isp_solution;

public class TestClient {
    public static void main(String[] args) {
        ICircle circle = new Circle();
        circle.drawCircle(5);

        ITriangle triangle = new Triangle();
        triangle.drawTriangle(3, 4, 5);
    }
}
