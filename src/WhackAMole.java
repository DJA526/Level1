import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class WhackAMole {
	
	JFrame window = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton();
	
	public static void main(String[] args) {
		WhackAMole a = new WhackAMole();
		a.drawButtons();
	}
	
	public void drawButtons() {
		window.setVisible(true);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel.add(button);
		window.add(panel);
	}

}
