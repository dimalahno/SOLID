package kz.solid.ocp.shape_osp_solution;

import kz.solid.ocp.shape_osp_violation.Circle;
import kz.solid.ocp.shape_osp_violation.Rectangle;

public class AreaCalculator {

    public double areaCalc(Shape... shapes) {
        double totalArea = 0;

        for (var shape: shapes) {
            totalArea += shape.area();
        }

        return totalArea;
    }
}
