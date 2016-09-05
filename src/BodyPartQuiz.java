import java.awt.Frame;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class BodyPartQuiz {

	// Get 3 celebrity photos from the internet, save them to your computer, and fill
	// in their paths here. To get the path, right click on the image, and copy its Location.
	String firstImage = "michaelJackson.jpg";
	String secondImage = "beyonce.jpg";
	String thirdImage = "steveCarell.jpg";

	Frame window = new Frame();
	
	private void startQuiz() {
		window.setSize(100,150);
		int score = 0;
		String answer1 = JOptionPane.showInputDialog("Who is this?");
		if (answer1.equals("Michael Jackson") || answer1.equals("michael jackson")) {
			JOptionPane.showMessageDialog(null, "Correct!");
			score++;
		} else {
			JOptionPane.showMessageDialog(null, "Incorrect.");
		}
		JOptionPane.showMessageDialog(null, "Score: " + score);
		
		showNextImage();
		window.setSize(380, 400);
		String answer2 = JOptionPane.showInputDialog("Who is this?");
		if (answer2.equals("Beyonce") || answer2.equals("beyonce")) {
			JOptionPane.showMessageDialog(null, "Correct!");
			score++;
		} else {
			JOptionPane.showMessageDialog(null, "Incorrect.");
		}
		JOptionPane.showMessageDialog(null, "Score: " + score);

		showNextImage();
		window.setSize(200, 130);
		String answer3 = JOptionPane.showInputDialog("Who is this?");
		if (answer3.equals("Steve Carell") || answer3.equals("steve carell")) {
			JOptionPane.showMessageDialog(null, "Correct!");
			score++;
		} else {
			JOptionPane.showMessageDialog(null, "Incorrect.");
		}
		JOptionPane.showMessageDialog(null, "Score: " + score);
	}

	public void showNextImage() {
		window.removeAll();
		window.add(getNextImage());
		window.pack();
	}

	public static void main(String[] args) {
		BodyPartQuiz quiz = new BodyPartQuiz();
		quiz.initializeGui();
		quiz.startQuiz();
	}

	private void initializeGui() {
		initializeImageList();
		imageIterator = imageList.iterator();
		window.setVisible(true);
		showNextImage();
	}

	private JLabel loadImage(String fileName) {
		Icon icon = new ImageIcon(fileName);
		JLabel image = new JLabel(icon);
		return image;
	}

	ArrayList<JLabel> imageList = new ArrayList<JLabel>();
	Iterator<JLabel> imageIterator;

	private void initializeImageList() {
		JLabel imageLabel = loadImage(firstImage);
		imageList.add(imageLabel);
		imageLabel = loadImage(secondImage);
		imageList.add(imageLabel);
		imageLabel = loadImage(thirdImage);
		imageList.add(imageLabel);
	}

	private JLabel getNextImage() {
		if (imageIterator.hasNext())
			return imageIterator.next();
		window.dispose();
		return new JLabel();
	}
}