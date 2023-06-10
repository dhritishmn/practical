//30. Write a program to demonstrate the use of push buttons.


import java.awt.*;
import java.awt.event.*;

public class ButtonDemo extends Frame {
    private Button clickMeButton;
    private Label label;

    public ButtonDemo() {
        
        setLayout(new FlowLayout());

        clickMeButton = new Button("Click Me");
        
        label = new Label("Button not clicked");

        add(clickMeButton);
        add(label);

        
        clickMeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Button clicked");
            }
        });

       
        setTitle("Button Demo");
        setSize(300, 200);
        setVisible(true);

       
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
