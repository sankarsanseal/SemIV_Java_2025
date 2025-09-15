import javax.swing.*;
import java.awt.event.*;

public class MouseClickSwing extends JFrame implements MouseListener {

    private int leftClickCount = 0;
    private int rightClickCount = 0;
    private int middleClickCount = 0;

    public MouseClickSwing() {
        setTitle("Mouse Click Event Example");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        addMouseListener(this);
        setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        int button = e.getButton();

        if (button == MouseEvent.BUTTON1) {
            leftClickCount++;
            JOptionPane.showMessageDialog(this, "Left button clicked " + leftClickCount + " times.");
        } else if (button == MouseEvent.BUTTON2) {
            middleClickCount++;
            JOptionPane.showMessageDialog(this, "Middle button clicked " + middleClickCount + " times.");
        } else if (button == MouseEvent.BUTTON3) {
            rightClickCount++;
            JOptionPane.showMessageDialog(this, "Right button clicked " + rightClickCount + " times.");
        }
    }

    @Override public void mousePressed(MouseEvent e) {}
    @Override public void mouseReleased(MouseEvent e) {}
    @Override public void mouseEntered(MouseEvent e) {}
    @Override public void mouseExited(MouseEvent e) {}

    public static void main(String[] args) {
        new MouseClickSwing();
    }
}