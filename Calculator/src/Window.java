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

public class Window extends JFrame{
    private final int WINDOW_WIDTH = 300;
    private final int WINDOW_HEIGHT = 400;
    private final int DISPLAY_HEIGHT = 106;
    private final int BUTTON_WIDTH = WINDOW_WIDTH / 4;
    private final int BUTTON_HEIGHT = DISPLAY_HEIGHT / 2;
    JLabel display;

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

        display = new JLabel("0");
        display.setBounds(0, 0, WINDOW_WIDTH, DISPLAY_HEIGHT);
        display.setForeground(Color.white);
        display.setFont(new Font("Sans-serif", Font.PLAIN, 70));
        // display.setBorder(displayBorder);
        display.setVerticalAlignment(JLabel.CENTER);
        display.setHorizontalAlignment(JLabel.RIGHT);
        this.add(display);

        JButton allClear = new JButton("AC");
        allClear.setBounds(0, DISPLAY_HEIGHT, BUTTON_WIDTH, BUTTON_HEIGHT);
//        button.setOpaque(true);
        allClear.setBackground(Color.darkGray);
        allClear.setForeground(Color.white);
//        button.setBorderPainted(false);
        allClear.setBorder(buttonBorder);
        allClear.setFocusable(false);
        allClear.addActionListener(e -> this.allClear());
        this.add(allClear);

        JButton sign = new JButton("+/-");
        sign.setBounds(BUTTON_WIDTH , DISPLAY_HEIGHT, BUTTON_WIDTH, BUTTON_HEIGHT);
        sign.setBackground(Color.darkGray);
        sign.setForeground(Color.white);
        sign.setBorder(buttonBorder);
        sign.setFocusable(false);
        this.add(sign);

        JButton percent = new JButton("%");
        percent.setBounds(BUTTON_WIDTH * 2 , DISPLAY_HEIGHT, BUTTON_WIDTH, BUTTON_HEIGHT);
        percent.setBackground(Color.darkGray);
        percent.setForeground(Color.white);
        percent.setBorder(buttonBorder);
        percent.setFocusable(false);
        this.add(percent);

        JButton divide = new JButton("÷");
        divide.setBounds(BUTTON_WIDTH * 3, DISPLAY_HEIGHT, BUTTON_WIDTH,  BUTTON_HEIGHT);
        divide.setBackground(new Color(0xFE9900));
        divide.setForeground(Color.white);
        divide.setBorder(buttonBorder);
        divide.setFocusable(false);
        this.add(divide);

        JButton multiply = new JButton("×");
        multiply.setBounds(BUTTON_WIDTH * 3, BUTTON_HEIGHT * 3, BUTTON_WIDTH, BUTTON_HEIGHT);
        multiply.setBackground(new Color(0xFE9900));
        multiply.setForeground(Color.white);
        multiply.setBorder(buttonBorder);
        multiply.setFocusable(false);
        this.add(multiply);

        JButton subtract = new JButton("-");
        subtract.setBounds(BUTTON_WIDTH * 3, BUTTON_HEIGHT * 4, BUTTON_WIDTH, BUTTON_HEIGHT);
        subtract.setBackground(new Color(0xFE9900));
        subtract.setForeground(Color.white);
        subtract.setBorder(buttonBorder);
        subtract.setFocusable(false);
        this.add(subtract);

        JButton add = new JButton("+");
        add.setBounds(BUTTON_WIDTH * 3, BUTTON_HEIGHT * 5, BUTTON_WIDTH, BUTTON_HEIGHT);
        add.setBackground(new Color(0xFE9900));
        add.setForeground(Color.white);
        add.setBorder(buttonBorder);
        add.setFocusable(false);
        this.add(add);

        JButton equals = new JButton("=");
        equals.setBounds((WINDOW_WIDTH / 4 ) * 3, BUTTON_HEIGHT * 6, BUTTON_WIDTH, BUTTON_HEIGHT);
        equals.setBackground(new Color(0xFE9900));
        equals.setForeground(Color.white);
        equals.setBorder(buttonBorder);
        equals.setFocusable(false);
        this.add(equals);

        JButton seven = new JButton("7");
        seven.setBounds(0, BUTTON_HEIGHT * 3, BUTTON_WIDTH, BUTTON_HEIGHT);
        seven.setBackground(Color.gray);
        seven.setForeground(Color.white);
        seven.setBorder(buttonBorder);
        seven.setFocusable(false);
        seven.addActionListener(e -> this.append(seven));
        this.add(seven);

        JButton eight = new JButton("8");
        eight.setBounds(BUTTON_WIDTH, BUTTON_HEIGHT * 3, BUTTON_WIDTH, BUTTON_HEIGHT);
        eight.setBackground(Color.gray);
        eight.setForeground(Color.white);
        eight.setBorder(buttonBorder);
        eight.setFocusable(false);
        eight.addActionListener(e -> this.append(eight));
        this.add(eight);

        JButton nine = new JButton("9");
        nine.setBounds(BUTTON_WIDTH * 2, BUTTON_HEIGHT * 3, BUTTON_WIDTH, BUTTON_HEIGHT);
        nine.setBackground(Color.gray);
        nine.setForeground(Color.white);
        nine.setBorder(buttonBorder);
        nine.setFocusable(false);
        nine.addActionListener(e -> this.append(nine));
        this.add(nine);

        JButton four = new JButton("4");
        four.setBounds(0, BUTTON_HEIGHT * 4, BUTTON_WIDTH, BUTTON_HEIGHT);
        four.setBackground(Color.gray);
        four.setForeground(Color.white);
        four.setBorder(buttonBorder);
        four.setFocusable(false);
        four.addActionListener(e -> this.append(four));
        this.add(four);

        JButton five = new JButton("5");
        five.setBounds(BUTTON_WIDTH, BUTTON_HEIGHT * 4, BUTTON_WIDTH, BUTTON_HEIGHT);
        five.setBackground(Color.gray);
        five.setForeground(Color.white);
        five.setBorder(buttonBorder);
        five.setFocusable(false);
        five.addActionListener(e -> this.append(five));
        this.add(five);

        JButton six = new JButton("6");
        six.setBounds(BUTTON_WIDTH * 2, BUTTON_HEIGHT * 4, BUTTON_WIDTH, BUTTON_HEIGHT);
        six.setBackground(Color.gray);
        six.setForeground(Color.white);
        six.setBorder(buttonBorder);
        six.setFocusable(false);
        six.addActionListener(e -> this.append(six));
        this.add(six);

        JButton one = new JButton("1");
        one.setBounds(0, BUTTON_HEIGHT * 5, BUTTON_WIDTH, BUTTON_HEIGHT);
        one.setBackground(Color.gray);
        one.setForeground(Color.white);
        one.setBorder(buttonBorder);
        one.setFocusable(false);
        one.addActionListener(e -> this.append(one));
        this.add(one);

        JButton two = new JButton("2");
        two.setBounds(BUTTON_WIDTH, BUTTON_HEIGHT * 5, BUTTON_WIDTH, BUTTON_HEIGHT);
        two.setBackground(Color.gray);
        two.setForeground(Color.white);
        two.setBorder(buttonBorder);
        two.setFocusable(false);
        two.addActionListener(e -> this.append(two));
        this.add(two);

        JButton three = new JButton("3");
        three.setBounds(BUTTON_WIDTH * 2, BUTTON_HEIGHT * 5, BUTTON_WIDTH, BUTTON_HEIGHT);
        three.setBackground(Color.gray);
        three.setForeground(Color.white);
        three.setBorder(buttonBorder);
        three.setFocusable(false);
        three.addActionListener(e -> this.append(three));
        this.add(three);

        JButton zero = new JButton("0");
        zero.setBounds(0, BUTTON_HEIGHT * 6, BUTTON_WIDTH * 2, BUTTON_HEIGHT);
        zero.setBackground(Color.gray);
        zero.setForeground(Color.white);
        zero.setBorder(buttonBorder);
        zero.setFocusable(false);
        zero.addActionListener(e -> this.append(zero));
        this.add(zero);

        JButton decimal = new JButton(".");
        decimal.setBounds(BUTTON_WIDTH * 2, BUTTON_HEIGHT * 6, BUTTON_WIDTH, BUTTON_HEIGHT);
        decimal.setBackground(Color.gray);
        decimal.setForeground(Color.white);
        decimal.setBorder(buttonBorder);
        decimal.setFocusable(false);
        decimal.addActionListener(e -> this.appendDecimal());
        this.add(decimal);

        this.setVisible(true);
        // this.pack();

    }

    public void allClear() {
        display.setText("0");
    }

    public void append(JButton button) {
        if (display.getText().equals("0")) {
            display.setText(button.getText());
        } else {
            display.setText(display.getText() + button.getText());
        }
    }

    public void appendDecimal() {
        if (!display.getText().contains(".") && !display.getText().equals("0")) {
            display.setText(display.getText() + ".");
        }
    }


}

