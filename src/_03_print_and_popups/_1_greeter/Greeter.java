package _03_print_and_popups._1_greeter;

import javax.swing.JOptionPane;

import _02_code_flow._3_pentagon_crazy.PentagonCrazy;

public class Greeter {
	public static void main(String[] args) {
		System.out.println("hellooooo");
		String input = JOptionPane.showInputDialog("What is your name?");
		JOptionPane.showMessageDialog(null,"Hello "+input);
	}
}
