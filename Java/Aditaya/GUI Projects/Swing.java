import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;

public class Swing {
    static int i=0;
    public static void main(String[] args) {
        // Create the main window (JFrame)
        JFrame frame = new JFrame("My Swing App");

        // Set default close operation
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a label
        JLabel label = new JLabel("Don't Click the button!");

        // Create a button
        JButton button = new JButton("Click Me");

        // Create a panel and add components to it
        JPanel panel = new JPanel();
        panel.add(label);
        panel.add(button);

        // Add the panel to the frame
        frame.getContentPane().add(panel);

        // Set the size of the window
        frame.setSize(300, 200);

        // Center the window
        frame.setLocationRelativeTo(null);

        // Make the window visible
        frame.setVisible(true);

        button.addActionListener(e -> {
            if (i==0) 
                label.setText("Why did you click it?");
            else if (i==1)
                label.setText("I told You twice now");
            else
                frame.dispose();

            i++;
        } );

    }
}