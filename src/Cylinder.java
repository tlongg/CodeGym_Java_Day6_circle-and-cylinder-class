public class Cylinder extends Circle {
    double height = 1;

    public Cylinder() {
    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return getArea() * height;
    }

    @Override
    public String toString() {
        return "Cylinder with " +
                "height = " + getHeight() +
                ", radius = " + getRadius() +
                ", color = " + getColor() +
                " and volume = " + getVolume();
    }
}
