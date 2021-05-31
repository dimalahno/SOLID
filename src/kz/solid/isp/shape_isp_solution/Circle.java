package kz.solid.isp.shape_isp_solution;

import javax.swing.*;
import java.awt.*;

public class Circle implements ICircle{

    @Override
    public void drawCircle(double radius) {
        System.out.println("Draw circle with radius: " + radius);
    }
}
