import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JFrameSpinGame implements ActionListener {

	JFrame window = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton();
	JLabel num1 = new JLabel();
	JLabel num2 = new JLabel();
	JLabel num3 = new JLabel();
	JLabel bet = new JLabel();
	JLabel total = new JLabel();
	JLabel totalvalue = new JLabel();
	JTextField betvalue = new JTextField(5);
	String x = "";
	String y = "";
	String z = "";
	String totalString = "";
	int totalInt = 1000;

	public static void main(String[] args) {
		JFrameSpinGame a = new JFrameSpinGame();
	}

	JFrameSpinGame() {
		window.setVisible(true);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button.setText("SPIN");
		button.addActionListener(this);
		num1.setText("0");
		num2.setText("1");
		num3.setText("2");
		bet.setText("BET");
		total.setText("TOTAL");
		totalvalue.setText("1000");
		panel.add(button);
		panel.add(num1);
		panel.add(num2);
		panel.add(num3);
		panel.add(bet);
		panel.add(betvalue);
		panel.add(total);
		panel.add(totalvalue);
		window.add(panel);
		window.setSize(400, 100);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == button) {
			int a = new Random().nextInt(5);
			x = "";
			x += a;
			int b = new Random().nextInt(5);
			y = "";
			y += b;
			int c = new Random().nextInt(5);
			z = "";
			z += c;
			num1.setText(x);
			num2.setText(y);
			num3.setText(z);
			if (a == b && b == c) {
				int wager = Integer.parseInt(betvalue.getText());
				totalInt += wager;
				totalString = "";
				totalString += totalInt;
				totalvalue.setText(totalString);
				betvalue.setText("");
			}
			else {
				int wager = Integer.parseInt(betvalue.getText());
				totalInt -= wager;
				totalString = "";
				totalString += totalInt;
				totalvalue.setText(totalString);
				betvalue.setText("");
			}
		}
	}

}