package sml.decoratorPattern;

/**
 * 实现shape接口的抽象类
 */
public abstract class ShapeDecorator {

    Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    public void draw(){
        this.decoratedShape.draw();
    }
}
