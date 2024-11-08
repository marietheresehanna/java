public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 20);
        Circle circle = new Circle(15);

        Shape rectangleShape = new RectangleAdapter(rectangle);
        Shape circleShape = new CircleAdapter(circle);

        // Now you can use the Shape interface to draw both rectangles and circles
        rectangleShape.draw();
        circleShape.draw();
    }
}
