
import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class NewCalculator implements ActionListener {

    Label l1, l2, l3;
    TextField tx1, tx2;
    Button b1, b2, b3, b4;

    public NewCalculator() {
        Frame f = new Frame("Simple Calculator");

        l1 = new Label("Enter First Number : ");
        l1.setBounds(50, 50, 150, 30);
        f.add(l1);

        tx1 = new TextField();
        tx1.setBounds(200, 50, 100, 30);
        f.add(tx1);

        l2 = new Label("Enter Second Number : ");
        l2.setBounds(50, 100, 150, 30);
        f.add(l2);

        tx2 = new TextField();
        tx2.setBounds(200, 100, 100, 30);
        f.add(tx2);

        l3 = new Label("Result : ");
        l3.setBounds(100, 150, 150, 30);
        f.add(l3);

        b1 = new Button("additon");
        b1.setBounds(70, 200, 50, 50);
        f.add(b1);
        b1.addActionListener(this);

        b2 = new Button("sutract");
        b2.setBounds(150, 200, 50, 50);
        f.add(b2);
        b2.addActionListener(this);

        b3 = new Button("multiply");
        b3.setBounds(230, 200, 50, 50);
        f.add(b3);
        b3.addActionListener(this);

        b4 = new Button("division");
        b4.setBounds(310, 200, 50, 50);
        f.add(b4);
        b4.addActionListener(this);

        f.setLayout(null);
        f.setSize(500, 500);
        f.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int num1 = Integer.parseInt(tx1.getText());
        int num2 = Integer.parseInt(tx2.getText());
        int ans = 0;
        if (e.getSource().equals(b1)) {
            ans = num1 + num2;
            l3.setText(String.valueOf("Result :     " + ans));
        } else if (e.getSource().equals(b2)) {
            ans = num1 - num2;
            l3.setText(String.valueOf("Result :     " + ans));
        } else if (e.getSource().equals(b3)) {
            ans = num1 * num2;
            l3.setText(String.valueOf("Result :     " + ans));
        } else if (e.getSource().equals(b4)) {
            double anss = (num1 * 1.0) / num2;
            l3.setText(String.valueOf("Result :     " + anss));
        }
    }

    public static void main(String[] args) {
        NewCalculator newCalculator = new NewCalculator();
    }

}
