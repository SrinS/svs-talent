import javax.swing.*;

import java.awt.*;

public class DefaultRectangle extends DefaultGeometricRectangle implements GeometricRectangle, Rectangle {

    public DefaultRectangle(int width, int height) {
        super(width, height);
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
                g.drawRect(0, 0, getWidth(), getHeight());
            }
        });

        jFrame.setSize(jFrame.getMaximumSize());
        jFrame.setVisible(true);
    }
}
