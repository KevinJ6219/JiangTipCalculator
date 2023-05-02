import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;

public class TipCalculatorGUI extends JFrame implements ActionListener, KeyListener {
    private JTextField billTextField;
    private JTextArea textArea1;
    private JTextField tipTextField;
    private JTextArea textArea2;
    private JTextField numberOfPeopleTextField;
    private JTextArea textArea3;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JTextField tipTextField1;
    private JTextArea textArea4;
    private JTextField totalTextField;
    private JTextArea textArea5;
    private JPanel mainPanel;

    public TipCalculatorGUI() {
        createUIComponents();
    }
    private void createUIComponents() {
        setContentPane(mainPanel);
        setTitle("Tip Calculator");
        setSize(300,400);
        setLocation(450,100);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
