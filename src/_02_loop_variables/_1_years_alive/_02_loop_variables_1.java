package _02_loop_variables._1_years_alive;

import javax.swing.JOptionPane;

public class _02_loop_variables_1 {
	public static void main(String[] args) {
		String age = JOptionPane.showInputDialog("whats your age");
		int ageInt = Integer.parseInt(age);

		for (int i = 0; i < ageInt; i += 1) {
			JOptionPane.showMessageDialog(null, "you were " + i + " in the year " + (2026 + i - ageInt));		
		}
		JOptionPane.showMessageDialog(null, "you are " + ageInt + " in this year, 2026");	
	}
}
