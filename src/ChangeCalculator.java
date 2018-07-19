//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0


import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
String answer=JOptionPane.showInputDialog(null,"How many nickels you have?");
		// Convert their answer to an int using Integer.parseInt()
int nickels=Integer.parseInt(answer);
		// Ask the user how many dimes they have, and convert their answer
String answer1=JOptionPane.showInputDialog(null,"How many dimes you have?");
int dimes=Integer.parseInt(answer);
		// Ask the user how many quarters they have, and convert their answer
String answer2=JOptionPane.showInputDialog(null,"How many quarters you have?");
int quarters=Integer.parseInt(answer);
		// Calculate how much money the user has and save it in a double variable 
double dollars=nickels*0.05+dimes*0.1+quarters*0.25;
		// Tell the user how much money they have
JOptionPane.showMessageDialog(null,dollars);
	}
}

