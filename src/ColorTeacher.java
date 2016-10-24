import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ColorTeacher implements ActionListener{
	
	JFrame window = new JFrame();
	JPanel panel = new JPanel();
	JButton yellow = new JButton();
	JButton red = new JButton();
	JButton blue = new JButton();
	JButton green = new JButton();
	
	public static void main(String[] args) {
		ColorTeacher a = new ColorTeacher();
	}
	
	ColorTeacher() {
		window.setVisible(true);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(500, 100);
		yellow.setBackground(Color.yellow);
		yellow.setOpaque(true);
		yellow.addActionListener(this);
		red.setBackground(Color.red);
		red.setOpaque(true);
		red.addActionListener(this);
		blue.setBackground(Color.blue);
		blue.setOpaque(true);
		blue.addActionListener(this);
		green.setBackground(Color.green);
		green.setOpaque(true);
		green.addActionListener(this);
		panel.add(yellow);
		panel.add(red);
		panel.add(blue);
		panel.add(green);
		window.add(panel);
	}
	
	void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if ((JButton) e.getSource() == yellow) {
			speak("yellow");
		} else if ((JButton) e.getSource() == red) {
			speak("red");
		} else if ((JButton) e.getSource() == blue) {
			speak("blue");
		} else if ((JButton) e.getSource() == green) {
			speak("green");
		}
	}
	
	

}
