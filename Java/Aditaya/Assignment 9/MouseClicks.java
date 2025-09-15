/*
Program to implement Swing to capture mouse clicks event.
It displays which mouse button is clicked after every click.
It also displays total nummber of mouse clicks.

Author: Aditaya Samui
Date: 27-08-2025
*/

import javax.swing.JFrame;
import javax.swing.JOptionPane;         //Class that shows a message dialog box
import java.awt.event.MouseListener;    //Interface that includes mouseClicked() method to capture clicks
import java.awt.event.MouseEvent;       //Class that handles the details of mouse event

public class MouseClicks extends JFrame implements MouseListener{
    private int clicks = 0;     //variable to count total mouse clicks

    public MouseClicks() {      //Setting the components of frame
        setTitle("Mouse Clicks Counter");
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addMouseListener(this);
        setVisible(true);
    }
 
    @Override
    public void mouseClicked(MouseEvent e) {        //Defining the mouseClicked() method
        clicks++;

        String button = "";
        if (e.getButton() == MouseEvent.BUTTON1) {  //getButton() returns which button was pressed
            button = "Left Button";
        } 
        else if (e.getButton() == MouseEvent.BUTTON2) {
            button = "Middle Button";
        } 
        else if (e.getButton() == MouseEvent.BUTTON3) {
            button = "Right Button";
        }

        //Shows which button is clicked and total clicks in a message dialog Box 
        JOptionPane.showMessageDialog(this, button+" clicked!\nTotal Clicks:"+clicks);
    }   

    //Unused methods of MouseListener interface, defining them to do nothing
    @Override public void mousePressed(MouseEvent e) {}
    @Override public void mouseReleased(MouseEvent e) {}
    @Override public void mouseEntered(MouseEvent e) {}
    @Override public void mouseExited(MouseEvent e) {}

    public static void main(String[] args) {
        new MouseClicks();      //Creating instance
    }
}
