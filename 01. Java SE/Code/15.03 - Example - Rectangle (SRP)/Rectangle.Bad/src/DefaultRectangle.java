import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class DefaultRectangle implements Rectangle {

    private int width;
    private int height;

    public DefaultRectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public int getArea() {
        return width * height;
    }

    @SuppressWarnings("serial")
	@Override
    public void draw() {

        final JFrame jFrame = new JFrame();
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.add(new JPanel() {

            @Override
            public void paint(Graphics g) {
                super.paint(g);
                g.drawRect(0, 0, width, height);
            }
        });

        jFrame.setSize(jFrame.getMaximumSize());
        jFrame.setVisible(true);
    }
}
