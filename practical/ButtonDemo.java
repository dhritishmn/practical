//30. Write a program to demonstrate the use of push buttons.


import java.awt.*;
import java.awt.event.*;

public class ButtonDemo extends Frame {
    private Button clickMeButton;
    private Label label;

    public ButtonDemo() {
        // Set layout manager
        setLayout(new FlowLayout());

        // Create button
        clickMeButton = new Button("Click Me");

        // Create label
        label = new Label("Button not clicked");

        // Add button and label to the frame
        add(clickMeButton);
        add(label);

        // Add action listener to the button
        clickMeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Button clicked");
            }
        });

        // Set frame properties
        setTitle("Button Demo");
        setSize(300, 200);
        setVisible(true);

        // Add window listener to handle closing of the frame
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        ButtonDemo buttonDemo = new ButtonDemo();
    }
}
