import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.UIManager;
import javax.swing.ImageIcon;
import javax.swing.border.Border;
import javax.swing.BorderFactory;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window extends JFrame implements ActionListener{
    private final int WINDOW_WIDTH = 300;
    private final int WINDOW_HEIGHT = 400;

    public Window() {
        try {
            UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
        } catch (Exception e) {
            e.printStackTrace();
        }

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        // this.setLayout(new FlowLayout());
        this.setResizable(false);
        this.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        this.setTitle("Calculator");

        ImageIcon image = new ImageIcon("calculator.jpeg");
        this.setIconImage(image.getImage());

        this.getContentPane().setBackground(Color.black);

         Border displayBorder = BorderFactory.createLineBorder(Color.gray, 1);
         Border buttonBorder = BorderFactory.createLineBorder(Color.black, 1);

        JLabel display = new JLabel("0");
        display.setBounds(0, 0, WINDOW_WIDTH, 72);
        display.setForeground(Color.white);
        display.setFont(new Font("Sans-serif", Font.PLAIN, 70));
        // display.setBorder(displayBorder);
        display.setVerticalAlignment(JLabel.CENTER);
        display.setHorizontalAlignment(JLabel.RIGHT);
        this.add(display);

        JButton allClear = new JButton("AC");
        allClear.setBounds(0, 72, WINDOW_WIDTH / 4, 36);
//        button.setOpaque(true);
        allClear.setBackground(Color.darkGray);
        allClear.setForeground(Color.white);
//        button.setBorderPainted(false);
        allClear.setBorder(buttonBorder);
        this.add(allClear);

        JButton sign = new JButton("+/-");
        sign.setBounds(WINDOW_WIDTH / 4 , 72, WINDOW_WIDTH / 4, 36);
        sign.setBackground(Color.darkGray);
        sign.setForeground(Color.white);
        sign.setBorder(buttonBorder);
        this.add(sign);

        JButton percent = new JButton("%");
        percent.setBounds(WINDOW_WIDTH / 2 , 72, WINDOW_WIDTH / 4, 36);
        percent.setBackground(Color.darkGray);
        percent.setForeground(Color.white);
        percent.setBorder(buttonBorder);
        this.add(percent);

        JButton divide = new JButton("÷");
        divide.setBounds((WINDOW_WIDTH / 4 ) * 3, 72, WINDOW_WIDTH / 4, 36);
        divide.setBackground(new Color(0xFE9900));
        divide.setForeground(Color.white);
        divide.setBorder(buttonBorder);
        this.add(divide);

        JButton multiply = new JButton("×");
        multiply.setBounds((WINDOW_WIDTH / 4 ) * 3, 108, WINDOW_WIDTH / 4, 36);
        multiply.setBackground(new Color(0xFE9900));
        multiply.setForeground(Color.white);
        multiply.setBorder(buttonBorder);
        this.add(multiply);

        JButton subtract = new JButton("-");
        subtract.setBounds((WINDOW_WIDTH / 4 ) * 3, 144, WINDOW_WIDTH / 4, 36);
        subtract.setBackground(new Color(0xFE9900));
        subtract.setForeground(Color.white);
        subtract.setBorder(buttonBorder);
        this.add(subtract);

        JButton add = new JButton("+");
        add.setBounds((WINDOW_WIDTH / 4 ) * 3, 180, WINDOW_WIDTH / 4, 36);
        add.setBackground(new Color(0xFE9900));
        add.setForeground(Color.white);
        add.setBorder(buttonBorder);
        this.add(add);

        JButton equals = new JButton("=");
        equals.setBounds((WINDOW_WIDTH / 4 ) * 3, 216, WINDOW_WIDTH / 4, 36);
        equals.setBackground(new Color(0xFE9900));
        equals.setForeground(Color.white);
        equals.setBorder(buttonBorder);
        this.add(equals);

        JButton seven = new JButton("7");
        seven.setBounds(0, 108, WINDOW_WIDTH / 4, 36);
        seven.setBackground(Color.gray);
        seven.setForeground(Color.white);
        seven.setBorder(buttonBorder);
        this.add(seven);

        JButton eight = new JButton("8");
        eight.setBounds(WINDOW_WIDTH / 4, 108, WINDOW_WIDTH / 4, 36);
        eight.setBackground(Color.gray);
        eight.setForeground(Color.white);
        eight.setBorder(buttonBorder);
        this.add(eight);

        JButton nine = new JButton("9");
        nine.setBounds(WINDOW_WIDTH / 2, 108, WINDOW_WIDTH / 4, 36);
        nine.setBackground(Color.gray);
        nine.setForeground(Color.white);
        nine.setBorder(buttonBorder);
        this.add(nine);

        JButton four = new JButton("4");
        four.setBounds(0, 144, WINDOW_WIDTH / 4, 36);
        four.setBackground(Color.gray);
        four.setForeground(Color.white);
        four.setBorder(buttonBorder);
        this.add(four);

        JButton five = new JButton("5");
        five.setBounds(WINDOW_WIDTH / 4, 144, WINDOW_WIDTH / 4, 36);
        five.setBackground(Color.gray);
        five.setForeground(Color.white);
        five.setBorder(buttonBorder);
        this.add(five);

        JButton six = new JButton("6");
        six.setBounds(WINDOW_WIDTH / 2, 144, WINDOW_WIDTH / 4, 36);
        six.setBackground(Color.gray);
        six.setForeground(Color.white);
        six.setBorder(buttonBorder);
        this.add(six);

        JButton one = new JButton("1");
        one.setBounds(0, 180, WINDOW_WIDTH / 4, 36);
        one.setBackground(Color.gray);
        one.setForeground(Color.white);
        one.setBorder(buttonBorder);
        this.add(one);

        JButton two = new JButton("2");
        two.setBounds(WINDOW_WIDTH / 4, 180, WINDOW_WIDTH / 4, 36);
        two.setBackground(Color.gray);
        two.setForeground(Color.white);
        two.setBorder(buttonBorder);
        this.add(two);

        JButton three = new JButton("3");
        three.setBounds(WINDOW_WIDTH / 2, 180, WINDOW_WIDTH / 4, 36);
        three.setBackground(Color.gray);
        three.setForeground(Color.white);
        three.setBorder(buttonBorder);
        this.add(three);

        JButton zero = new JButton("0");
        zero.setBounds(0, 216, WINDOW_WIDTH / 2, 36);
        zero.setBackground(Color.gray);
        zero.setForeground(Color.white);
        zero.setBorder(buttonBorder);
        this.add(zero);

        JButton decimal = new JButton(".");
        decimal.setBounds(WINDOW_WIDTH / 2, 216, WINDOW_WIDTH / 4, 36);
        decimal.setBackground(Color.gray);
        decimal.setForeground(Color.white);
        decimal.setBorder(buttonBorder);
        this.add(decimal);

        this.setVisible(true);
        // this.pack();

    }

    public void actionPerformed(ActionEvent e) {

    }

}

