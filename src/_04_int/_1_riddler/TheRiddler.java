package _04_int._1_riddler;

import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
		String answer1 = JOptionPane.showInputDialog(null,"What has hands but can't clap?");
		// 4. If they got the answer right, pop up "correct!" and increase ;the score by one
		if (answer1.equals("a clock")) {
			JOptionPane.showMessageDialog(null,("Correct!!!!!!!!!"));
			score += 1 ;
		}
		// 5. Otherwise, say "wrong" and tell them the answer
		else {
			JOptionPane.showMessageDialog(null,"Sorry, that is wrong the correct answer is a clock");
		}
		// 6. Add some more riddles
		String answer2 = JOptionPane.showInputDialog(null,"Where does today come before yesterday");
		if(answer2.equals("a dictionary")){
			score += 1 ;
		}
		else {
			JOptionPane.showMessageDialog(null, "Sorry, the answer was a dictionary");
		}
		// 2. Make a pop up to show the score.
		JOptionPane.showMessageDialog(null, "Your score was " +score+ " out of two.");
	}
}

