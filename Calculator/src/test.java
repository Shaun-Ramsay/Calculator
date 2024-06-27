import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;

public class test {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(500, 500);
        frame.add(new JLabel("Hello World"));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
