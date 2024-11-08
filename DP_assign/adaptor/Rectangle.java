public class Rectangle {
    private int width, height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    // Legacy drawing method
    public void drawLegacy() {
        System.out.println("Drawing a rectangle with width " + width + " and height " + height);
    }
}
