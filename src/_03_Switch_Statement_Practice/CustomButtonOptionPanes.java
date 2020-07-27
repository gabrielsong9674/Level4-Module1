package _03_Switch_Statement_Practice;

import javax.swing.JOptionPane;

public class CustomButtonOptionPanes {
	public static void main(String[] args) {
		String[] options = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

		int input = JOptionPane.showOptionDialog(null, "Choose a day of the week", "Custom Buttons", 0, -1, null,
				options, 0);

		String choice = options[input];
		
		//use a switch statement to do something cool for each option
		switch(choice) {
		case "Sunday":
			JOptionPane.showMessageDialog(null, "Relax!");
			break;
		case "Monday":
			JOptionPane.showMessageDialog(null, "Time for work");
			break;
		case "Tuesday":
			JOptionPane.showMessageDialog(null, "It's pizza night");
			break;
		case "Wednesday":
			JOptionPane.showMessageDialog(null, "Middle of the week");
			break;
		case "Thursday":
			JOptionPane.showMessageDialog(null, "Go to the gym");
			break;
		case "Friday":
			JOptionPane.showMessageDialog(null, "TGIF");
			break;
		case "Saturday":
			JOptionPane.showMessageDialog(null, "Relax!");
			break;
		}
	}
}
