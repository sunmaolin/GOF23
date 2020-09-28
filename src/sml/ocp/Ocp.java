package sml.ocp;

public class Ocp {
    public static void main(String[] args) {
        //存在的问题
        //如果新增一一个三角形，修改的代码比较多
        //同时违反了ocp开闭原则，即对扩展开放（提供方），对修改关闭（使用方）
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drawCircle(new Circle());
        graphicEditor.drawRectangle(new Rectangle());
    }
}

//这是一个用于绘图的类
class GraphicEditor {
    //接受shape对象，然后根据type来绘制不同的图形
    public void drawShape(Shape s) {
        if (s.m_type == 1) {
            drawRectangle(s);
        } else if (s.m_type == 2) {
            drawCircle(s);
        }
    }

    public void drawRectangle(Shape r) {
        System.out.println("矩形");
    }

    public void drawCircle(Shape r) {
        System.out.println("圆形");
    }
}

//Shape类，基类
class Shape {
    int m_type;
}

class Rectangle extends Shape {
    Rectangle() {
        super.m_type = 1;
    }
}

class Circle extends Shape {
    Circle() {
        super.m_type = 2;
    }
}