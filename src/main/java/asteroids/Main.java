package asteroids;
// Java program using label (swing)
// to display the message “GFG WEB Site Click”
import javax.swing.*;

// Main class
class Main {

    // Main driver method
    public static void main(String[] args)
    {
        
        // Creating instance of JFrame
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Creating instance of JButton
        JButton button = new JButton("Hello button!");
        
        // x axis, y axis, width, height
        button.setBounds(-50, 0, 100, 100);

        // adding button in JFrame
        frame.add(button);

        // 400 width and 500 height
        frame.setSize(500, 600);

        // using no layout managers
        frame.setLayout(null);

        // making the frame visible
        frame.setVisible(true);
    }
}
