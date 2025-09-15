import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import java.awt.LayoutManager;

public class App extends JFrame{

    public App(){
        setSize(400, 300);
        JPanel panel = new JPanel();
        add(panel);
        JButton button_quit = new JButton();
        add(button_quit);
        button_quit.setText("Quit");
        button_quit.addActionListener(e -> {
            JOptionPane.showMessageDialog(this, "Closing the application!");
            dispose();
        });
        setTitle("My First GUI Application");
        button_quit.setVerticalAlignment(button_quit.TOP);
    }


    public static void main(String[] args) {
        System.out.println("Hello, World!");

        App first_window = new App();
        first_window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        first_window.setVisible(true);
    }
}
