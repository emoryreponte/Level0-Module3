
package _01_else_if._1_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		
		//1. Create a new Robot
		Robot rob = new Robot();
		int sides = 4;
		
		rob.setSpeed(1000);
		rob.penDown();
		for(int i = 0; i <= 1;) {
			for (int b = 0; b <= sides; b++) {
				rob.turn(360 / sides);
				rob.move(50);
			}
			rob.setPenWidth(10);
			String color_string = JOptionPane.showInputDialog(null, "what color do you want");
			if (color_string == "red") {
				rob.setPenColor(255,0,0);
			}
		}
	    //2. Make the robot draw a shape (this will take more than one line of code)		
		//3. Set the pen width to 10
		//4. Ask the user what color pen they would like the robot to draw with
		//5. Use an if/else statement to set the pen color that the user requested
        //6. If the user doesn't enter anything, choose a random color
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		

		



	}
}
