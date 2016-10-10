import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Riddle implements ActionListener {

	JFrame window = new JFrame();
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	JTextField answer = new JTextField(15);

	public static void main(String[] args) {
		Riddle a = new Riddle();
	}

	Riddle() {
		window.setVisible(true);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(700, 100);
		label.setText("What is a seven letter word containing thousands of letters?");
		button1.setText("Submit");
		button1.addActionListener(this);
		button2.setText("Hint");
		button2.addActionListener(this);
		panel.add(label);
		panel.add(button1);
		panel.add(button2);
		panel.add(answer);
		window.add(panel);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == button1) {
			if (answer.getText().equals("mailbox") || answer.getText().equals("Mailbox")) {
				JOptionPane.showMessageDialog(null, "Correct!");
			} else {
				JOptionPane.showMessageDialog(null, "Incorrect.");
			}
		} else if (e.getSource() == button2) {
			JOptionPane.showMessageDialog(null, "'Letter' has more than one meaning!");
		}
	}

}
