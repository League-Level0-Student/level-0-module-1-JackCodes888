package _03_if_else._2_remarkable;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class Remarkable {
public static void main(String[] args) {

		// 1. Save something remarkable about each person in a variable.
		String Ananya = "Ananya likes to play the piano. ";
		String Aaraf = "Aaraf has a dog.";
		String Nick = "Nick is on three different pool teams. As in the sticks and balls pool.";
		String Evan = "Evan can do ten pushups.";
		String Jack = "I can solve a Rubik's cube in eight seconds";
		// 2. Ask the user to enter a name. Store their answer in a variable.
		String person = JOptionPane.showInputDialog(null,"Please enter the name of a person you want to learn something remarkable about who is at League.");
		// 3. In a pop-up, tell the user what is remarkable about that person. 
		
		
		
		switch (person) {
		case "Ananya":
			JOptionPane.showMessageDialog(null, Ananya);
			break;
		case "Aaraf":
			JOptionPane.showMessageDialog(null, Aaraf);
			break;
			case "Nick":
				JOptionPane.showMessageDialog(null, Nick);
				break;
				case "Evan":
					JOptionPane.showMessageDialog(null, Evan);
					break;
					case "Jack":
						JOptionPane.showMessageDialog(null, Jack);
						break;
			
		
		}
		
	}
}

