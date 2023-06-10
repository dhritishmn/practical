import java.awt.*;
import java.awt.event.*;

public class KeyboardEventsDemo extends Frame implements KeyListener {
    private TextArea textArea;

    public KeyboardEventsDemo() {
        super("Keyboard Events Demo");
        textArea = new TextArea();
        textArea.addKeyListener(this);
        add(textArea, BorderLayout.CENTER);
        setSize(400, 300);
        setVisible(true);
    }

    public void keyTyped(KeyEvent e) {
        textArea.append("Key Typed: " + e.getKeyChar() + "\n");
    }

    public void keyPressed(KeyEvent e) {
        textArea.append("Key Pressed: " + e.getKeyCode() + "\n");
    }

    public void keyReleased(KeyEvent e) {
        textArea.append("Key Released: " + e.getKeyCode() + "\n");
    }

    public static void main(String[] args) {
        new KeyboardEventsDemo();
    }
}
