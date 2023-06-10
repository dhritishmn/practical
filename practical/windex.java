//29. Write a program to generate a window without an applet window using main() function

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class windex {
    public static void main(String[] args) {
        // Create a frame (window)
        Frame frame = new Frame("Window Example");

        // Add a window listener to handle closing the window
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        // Set the size of the frame
        frame.setSize(400, 300);

        // Make the frame visible
        frame.setVisible(true);
    }
}
