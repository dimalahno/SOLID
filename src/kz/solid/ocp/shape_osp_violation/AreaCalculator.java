package kz.solid.ocp.shape_osp_violation;

public class AreaCalculator {

/*    public double areaCalcRectangle(Rectangle... rectangles) {
        double area = 0;

        for (var rectangle: rectangles) {
            area += rectangle.getHeight() * rectangle.getWidth();
        }

        return area;
    }*/

    public double areaCalc(Object... shapes) {
        double area = 0;

        for (var shape: shapes) {
            if (shape instanceof Rectangle){
                Rectangle rectangle = (Rectangle) shape;
                area += rectangle.getHeight() * rectangle.getWidth();
            } else {
                Circle circle = (Circle) shape;
                area += Math.PI * Math.pow(circle.getRadius(), 2);
            }


        }

        return area;
    }
}
