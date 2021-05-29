package kz.solid.ocp.shape_osp_solution;

public class MainClientSolution {
    public static void main(String[] args) {
        var r1 = new Rectangle(10, 5);
        var r2 = new Rectangle(20, 37.3);

        var c1 = new Circle(5);

        var areaCalculator = new AreaCalculator();

        System.out.println(areaCalculator.areaCalc(r1, r2, c1));
    }
}
