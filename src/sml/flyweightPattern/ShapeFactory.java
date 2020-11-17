package sml.flyweightPattern;

import java.util.HashMap;

public class ShapeFactory {
    private static final HashMap<String,Circle> circleMap = new HashMap<>();

    public static Circle getCircle(String color){
        Circle circle = circleMap.get(color);
        if(circle == null){
            circle = new Circle(color);
            System.out.println("Creating circle of color : " + color);
            circleMap.put(color,circle);
        }
        return circle;
    }
}
