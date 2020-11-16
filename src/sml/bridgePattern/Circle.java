package sml.bridgePattern;

public class Circle extends Shape {

    int x,y,radius;

    public Circle(DrawApi drawApi, int x, int y, int radius) {
        super(drawApi);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        drawApi.drawCircle(this.radius,this.x,this.y);
    }
}
