public class CylinderTest {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);

        cylinder = new Cylinder(7.8);
        System.out.println(cylinder);

        cylinder = new Cylinder(7.8, "red", 6.7);
        System.out.println(cylinder);
    }
}
