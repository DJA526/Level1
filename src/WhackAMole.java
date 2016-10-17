import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class WhackAMole implements ActionListener {

	JFrame window = new JFrame();
	JPanel panel = new JPanel();
	int score = 0;
	int wrong = 0;
	static Date d;

	public static void main(String[] args) {
		WhackAMole a = new WhackAMole();
		d = new Date();
		a.drawButtons(new Random().nextInt(24));
	}

	void drawButtons(int x) {
		window.setVisible(true);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		for (int i = 0; i < 24; i++) {
			if (i == x) {
				JButton button = new JButton();
				panel.add(button);
				button.setText("mole!");
				button.addActionListener(this);
			} else {
				JButton b = new JButton();
				b.addActionListener(this);
				panel.add(b);
			}
		}
		window.add(panel);
		window.setSize(300, 320);
		window.setTitle("Whack a Button for Fame and Glory");
	}

	void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void endGame(Date timeAtStart, int molesWhacked) {
		Date timeAtEnd = new Date();
		JOptionPane.showMessageDialog(null, "Your whack rate is "
		+ ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked) + " moles per second.");
		}
	
	private void playSound(String fileName) {
		AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
		sound.play();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton t = (JButton)e.getSource();
		if (t.getText().equals("mole!")) {
			score++;
			wrong = 0;
			window.dispose();
			panel.removeAll();
			drawButtons(new Random().nextInt(24));	
		} else {
			wrong++;
			window.dispose();
			panel.removeAll();
			drawButtons(new Random().nextInt(24));
		}
		if (score == 10) {
			endGame(d, score);
		}
		if (wrong == 1) {
			speak("dork");
		} else if (wrong == 2) {
			speak("idiot");
		} else if (wrong == 3) {
			speak("moron");
		} else if (wrong == 4) {
			speak("you're a complete waste of atoms!");
		}
		
	}

}