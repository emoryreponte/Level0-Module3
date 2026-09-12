
package _01_else_if._2_crazy_cat_lady;

import java.net.URI;

import javax.swing.JOptionPane;

public class CrazyCatLady {
	public static void main(String[] args) {
		
		// 1. Ask the user how many cats they have
		String cats =JOptionPane.showInputDialog("how many cats do you have? number answer ex- 1,2,3,4 ect");
		// 2. Convert their answer into an int
		int kats = Integer.parseInt(cats);
		// 3. If they have 3 or more cats, tell them they are a crazy cat lady
		if (kats>=(3)){
			JOptionPane.showMessageDialog(null,"you are a crazy cat lady");
		}
		else if (kats<3&&(kats>0)){
			playVideo("https://www.youtube.com/watch?v=uFq2zqo8mqo&pp=ygUfY2F0c3ludGggICd0aGUgd29ybGQgcmV2b2x2aW5nJw%3D%3D");
		}
		else {
			playVideo("https://www.youtube.com/watch?v=VLVdjLbXdm4");
		}
		// 4. If they have less than 3 cats AND more than 0 cats, call the method below to show them a cat video
		//    Hint: You can use the && operator 
		// 5. If they have 0 cats, show them a video of A Frog Sitting on a Bench Like a Human
		
		
		
		
		
		
	}

	static void playVideo(String videoURL) {
		try {
			URI uri = new URI(videoURL);
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

