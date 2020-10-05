package sml.principle.ocp.improve;

public class Ocp {
    public static void main(String[] args) {
        //增加功能时，使用方尽量不修改代码
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drawShape(new Circle());
        graphicEditor.drawShape(new Rectangle());
    }
}

//这是一个用于绘图的类
class GraphicEditor {

    public void drawShape(Shape s) {
        s.draw();
    }

}

//Shape类，基类
abstract class Shape {
    int m_type;
    public abstract void draw();//抽象方法
}

class Rectangle extends Shape {
    Rectangle() {
        super.m_type = 1;
    }

    @Override
    public void draw() {
        System.out.println("矩形");
    }
}

class Circle extends Shape {
    Circle() {
        super.m_type = 2;
    }

    @Override
    public void draw() {
        System.out.println("圆形");
    }
}