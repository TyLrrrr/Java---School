import java.util.*;
public class Circle {
public static void main(String[] args)
{
    double radius;
    double area;
    double diameter;
    
        radius = 1;
        computeDiameter(radius);
        computeArea(radius);
}   
    public static void computeDiameter(double radius); {
        diameter = 2 * radius;
    }
    public static void computeArea(double radius); {
        area = Math.PI * radius * radius;

    }
}