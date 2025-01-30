package _03_if_else._1_unbirthday;

import javax.swing.JOptionPane;

public class UnBday {
	public static void main(String[] args) {
		String bday = JOptionPane.showInputDialog("When is your bday? eg. 6/15 ");
				if (bday.equals("1/29")) {
					JOptionPane.showMessageDialog(null,"Happy Birthday");

				}		
				else {
					JOptionPane.showMessageDialog(null,"Have a merry Unbirthday");
				}
	}
}
