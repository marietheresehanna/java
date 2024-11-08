public class Circle {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    // Legacy drawing method
    public void drawLegacy() {
        System.out.println("Drawing a circle with radius " + radius);
    }
}
