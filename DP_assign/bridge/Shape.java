// Interface Abstraction
interface Shape {
    void draw(); // Low-level method
    void resizeByPercentage(double pct); // High-level method
}

// Refined Abstraction
class CircleShape implements Shape {
    private double x, y, radius;
    private DrawingAPI drawingAPI;

    // Constructor binds an instance of CircleShape with a DrawingAPI implementation
    public CircleShape(double x, double y, double radius, DrawingAPI drawingAPI) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.drawingAPI = drawingAPI;
    }

    // Low-level method specific to the implementation
    public void draw() {
        drawingAPI.drawCircle(x, y, radius);
    }

    // High-level method specific to the abstraction
    public void resizeByPercentage(double pct) {
        radius *= pct;
    }
}
