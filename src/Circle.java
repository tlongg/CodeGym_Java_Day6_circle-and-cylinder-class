public class Circle {
    double radius = 1;
    String color = "Green";

    public Circle() {
    }


    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }


    @Override
    public String toString() {
        return "A Circle with a radius equals to " + getRadius()
                + " color " + getColor()
                + " and has Area which equals to " + getArea();
    }
}
