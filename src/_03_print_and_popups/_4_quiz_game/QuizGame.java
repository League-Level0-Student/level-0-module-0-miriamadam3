package _03_print_and_popups._4_quiz_game;

import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {
		
		// Create a variable to hold the user's score. Set it equal to zero. 
		int baseScore =0;
		
		// ASK A QUESTION AND CHECK THE ANSWER
		String answer=JOptionPane.showInputDialog("What is 2+2?");

				// 2.  Ask the user a question 
				
				// 3.  Use an if statement to check if their answer is correct
			if(answer.equals("4")) {
				System.out.println("true");
				baseScore++;
			}	else {
				JOptionPane.showMessageDialog(null, "false");
				baseScore--;
			}
				
				answer=JOptionPane.showInputDialog(" What does red and blue make?");	
			if(answer.equals ("purple")) {
				System.out.println("true");
				baseScore++;
			}
			else {
				JOptionPane.showMessageDialog(null, "false");
				baseScore--;
			}
				answer=JOptionPane.showInputDialog("What color is the sky");
				if(answer.contentEquals("blue")) {
				System.out.println("true");
				baseScore++;
				}	
				else {
					JOptionPane.showMessageDialog(null, "false");
					baseScore--;
				}
				answer=JOptionPane.showInputDialog("what is 3+5?");
				if(answer.contentEquals("8")) {
				System.out.println("true");
				baseScore++;
				}
				else {
					JOptionPane.showMessageDialog(null, "false");
					baseScore--;
				}
				// 4.  if the user's answer was correct, add one to their score 
		
		// MAKE MORE QUESTIONS. Ask more questions by repeating the above 
				// Option: Subtract a point from their score for a wrong answer
		
		
		// After all the questions have been asked, tell the user their final score 
		JOptionPane.showMessageDialog(null, "Final Score "+baseScore);
	}
}
/*
 * What is 2+2?
 * 4
 * 
 * What does red and blue make?
 * Purple
 * 
 * What color is the sky?
 * Blue
 * 
 * What is 3+5?
 * 8
 
*/