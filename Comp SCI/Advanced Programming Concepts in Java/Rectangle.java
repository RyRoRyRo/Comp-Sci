public class Rectangle {
    private double length;
    private double width;
    private double height;

    public Rectangle(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double volume() {
        return length * width * height;
    }

    public double surfaceArea() {
        return 2 * (length * width + length * height + width * height);
    }
}
