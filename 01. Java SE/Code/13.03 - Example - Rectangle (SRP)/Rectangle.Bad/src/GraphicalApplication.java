public class GraphicalApplication {

    public static void main(String[] args) {
        final Rectangle rectangle = new DefaultRectangle(200, 100);
        System.out.println(rectangle.getArea());
        rectangle.draw();
    }
}
