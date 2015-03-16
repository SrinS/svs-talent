public class ComputationalGeometryApplication {

    public static void main(String[] args) {
        final GeometricRectangle rectangle = new DefaultGeometricRectangle(200, 100);
        System.out.println(rectangle.getArea());
        // rectangle.draw(); // The compiler won't allow this any more.
    }
}
