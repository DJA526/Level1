import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JFramePractice {
	
	public static void main(String[] args) {
		JFrame window = new JFrame();
		window.setVisible(true);
		JPanel panel = new JPanel();
		JTextField field = new JTextField(15);
		panel.add(field);
		window.add(panel);
		String x = field.getText();
		System.out.println(x);
		window.setSize(500, 500);
	}

}
