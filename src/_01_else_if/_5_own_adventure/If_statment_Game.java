package _01_else_if._5_own_adventure;

import java.util.Random;

import javax.swing.JOptionPane;

public class If_statment_Game {
	
	
	static int Player_HP = 100;
	
	static void bush() {
		Player_HP -= 10;
		JOptionPane.showMessageDialog(null, "you fall on a bush and take 10 damage" + "| hp =" + Player_HP);
	}
	
	static void medkit() {
		Player_HP += 10;
		JOptionPane.showMessageDialog(null, "you find a medkit" + "| hp =" + Player_HP);
	}
	
	static void random_pick() {
		int random = new Random().nextInt(2 - 1) + 1;
		if(random == 1) {
			bush();
		}
		if(random == 2) {
			medkit();
		}
	}
	
	public static void main(String[] args) {
		for (int i = 0; i == 0;) {
			String crossroads = JOptionPane.showInputDialog("you see a crossroads left and right (left or right)" + "| hp =" + Player_HP);
			if (crossroads.equals("left")) {
				JOptionPane.showMessageDialog(null, "you go left");
				random_pick();
			}
			else if (crossroads.equals("right")) {
				JOptionPane.showMessageDialog(null, "you go right");
				random_pick();
			}
			else if (crossroads.equals("backwards")) {
				JOptionPane.showMessageDialog(null, "you go and leave the crossroads");
				JOptionPane.showMessageDialog(null, "you win");
			}
		}
		
	}
}
