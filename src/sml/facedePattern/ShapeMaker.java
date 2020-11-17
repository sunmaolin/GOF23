package sml.facedePattern;

public class ShapeMaker {
    private Shape circle;
    private Shape square;
    private Shape rectangle;

    public ShapeMaker() {
        this.circle = new Circle();
        this.square = new Square();
        this.rectangle = new Rectangle();
    }

    public void drawCircle(){
        this.circle.draw();
    }

    public void drawSquare(){
        this.square.draw();
    }

    public void drawRectangle(){
        this.rectangle.draw();
    }
}
