 // Copyright Wintriss Technical Schools 2013
import java.awt.Component;
import java.awt.Frame;
import java.net.MalformedURLException;
import java.net.URL;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public static void main(String[] args) throws Exception {
		JFrame quizWindow = new JFrame();
		quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 1. find an image on the internet, and put its URL in a String variable (from your browser, right click on the image, and select “Copy Image URL”)
		String cupcakeURL = "https://people.rit.edu/kge3737/320/project2/media/background-cupcake.png";
		// 2. create a variable of type "Component" that will hold your image
		Component cupcake = createImage(cupcakeURL);
		// 3. use the "createImage()" method below to initialize your Component
		// 4. add the image to the quiz window
		quizWindow.add(cupcake);
		// 5. call the pack() method on the quiz window
		quizWindow.pack();
		quizWindow.setVisible(true);
		// 6. ask a question that relates to the image
		String answer = JOptionPane.showInputDialog("What is this picture?");
		// 7. print "CORRECT" if the user gave the right answer
		if (answer.equals("cupcake") || answer.equals("Cupcake")) {
			System.out.println("CORRECT");
		} else {
			System.out.println("INCORRECT");
		}
		// 9. remove the component from the quiz window (you may not see the effect of this until step 12)
		quizWindow.remove(cupcake);
		// 10. find another image and create it (might take more than one line of code)
		String ladybugURL = "http://www.jigzone.com/p/jz/jz4/Ladybug.jpg";
		Component ladybug = createImage(ladybugURL);
		// 11. add the second image to the quiz window
		quizWindow.add(ladybug);
		// 12. pack the quiz window
		quizWindow.pack();
		// 13. ask another question
		String answer2 = JOptionPane.showInputDialog("What is this picture?");
		// 14+ check answer, say if correct or incorrect, etc.
		if (answer2.equals("ladybug") || answer2.equals("Ladybug")) {
			System.out.println("CORRECT");
		} else {
			System.out.println("INCORRECT");
		}
		quizWindow.remove(ladybug);
		String dogURL = "http://pets.petsmart.com/services/_images/grooming/dog/m_t/dog-aromatherapy.jpg";
		Component dog = createImage(dogURL);
		quizWindow.add(dog);
		quizWindow.pack();
		String answer3 = JOptionPane.showInputDialog("What is this picture?");
		if (answer3.equals("dog") || answer3.equals("Dog")) {
			System.out.println("CORRECT");
		} else {
			System.out.println("INCORRECT");
		}

	}

	private static Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image (imageComponent.addMouseMotionListener()) 
}