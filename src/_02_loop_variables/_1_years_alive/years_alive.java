package _02_loop_variables._1_years_alive;

import javax.swing.JOptionPane;

public class years_alive {
	
	public static void main(String[] args) {
		String age = JOptionPane.showInputDialog(null, "whats year were you born");
		int age_int = Integer.parseInt(age);
		
		for (int i = 2026; i >= age_int; i--) {
			JOptionPane.showMessageDialog(null, i);
		}
		
	}

}
