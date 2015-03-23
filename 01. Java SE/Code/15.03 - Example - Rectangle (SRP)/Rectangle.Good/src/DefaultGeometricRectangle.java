public class DefaultGeometricRectangle implements GeometricRectangle {

    private int width;
    private int height;

    public DefaultGeometricRectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public int getArea() {
        return width * height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
