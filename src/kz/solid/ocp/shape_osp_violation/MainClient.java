package kz.solid.ocp.shape_osp_violation;

public class MainClient {
    public static void main(String[] args) {
        var r1 = new Rectangle(10, 5);
        var r2 = new Rectangle(20, 37.3);

        var areaCalculator = new AreaCalculator();

        System.out.println(areaCalculator.areaCalc(r1, r2));
    }
}
