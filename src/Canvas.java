package src;

import javax.swing.JFrame;
import javax.swing.ImageIcon;

public class Canvas {
    public static void main(String[] args) {
        Frame();
    }

    public static void Frame()
    {
        JFrame frame = new JFrame("Canvas");
        frame.setSize(1024,720);
        frame.setVisible(true);

        ImageIcon img = new ImageIcon("Study/Github/Canvas/Images/2391021-200.png");
        frame.setIconImage(img.getImage());
    }
}
