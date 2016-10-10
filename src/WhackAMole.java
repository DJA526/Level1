import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class WhackAMole implements ActionListener {

	JFrame window = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton();

	public static void main(String[] args) {
		WhackAMole a = new WhackAMole();
		a.drawButtons(new Random().nextInt(24));
	}

	void drawButtons(int x) {
		window.setVisible(true);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		for (int i = 0; i < 24; i++) {
			if (i == x) {
				panel.add(button);
				button.setText("mole!");
			} else {
				panel.add(new JButton());
			}
		}
		window.add(panel);
		window.setSize(300, 320);
	}

	void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {

	}

}