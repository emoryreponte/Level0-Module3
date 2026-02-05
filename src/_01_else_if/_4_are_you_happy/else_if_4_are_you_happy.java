package _01_else_if._4_are_you_happy;

import javax.swing.JOptionPane;

public class else_if_4_are_you_happy {

	public static void main(String[] args) {
		 String Are_you_happy = JOptionPane.showInputDialog("are you happy (yes or no)");
		 if (Are_you_happy.equals("yes")) {
			 JOptionPane.showMessageDialog(null, "keep doing whatever your doing");
		 }
		 else if (Are_you_happy.equals("no")) {
			 String Do_you_want_to_be_happy = JOptionPane.showInputDialog("do you want to be happy (yes or no)");
			 if (Do_you_want_to_be_happy.equals("yes")) {
				 JOptionPane.showMessageDialog(null, "change something");
			 }
			 else if (Do_you_want_to_be_happy.equals("no")) {
				 JOptionPane.showMessageDialog(null, "keep doing whatever your doing");
			 }
		 }
		 else {
			 System.exit(0);
		 }
		 
	}

}
