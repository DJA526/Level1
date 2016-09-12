import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JavaGUI implements ActionListener {
	JFrame window;
	JPanel panel;
	JLabel label;
	JButton button;
	JButton button2;
	
	public static void main(String[] args) {
		JavaGUI a = new JavaGUI(500, 500);
	}
	
	JavaGUI(int x, int y) {
		window = new JFrame();
		window.setVisible(true);
		window.setSize(x, y);
		panel = new JPanel();
		window.add(panel);
		label = new JLabel("text");
		panel.add(label);
		button = new JButton("button");
		panel.add(button);
		button.addActionListener(this);
		button2 = new JButton();
		button2.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("button clicked!");		
	}

}
