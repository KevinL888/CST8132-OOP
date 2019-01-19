package guitar;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * This program is a simulation of a guitar CST8132_303
 * 
 * @author Kevin Lai
 */
// Object Oriented Programming Lab 8 - Kevin Lai - Lai00035

public class PlayGuitar
{

	public static void main(String[] args)
	{
		// create JFrame
		JFrame application = new JFrame("A simple guitar program");

		GuitarPanel guitarPanel = new GuitarPanel(); // create paint panel
		application.add(guitarPanel, BorderLayout.CENTER); // in center

		// create a label and place it in SOUTH of BorderLayout
		application.add(new JLabel("Drag the mouse to strum or pluck guitar"), BorderLayout.SOUTH);

		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.setSize(1024, 680); // set frame size
		application.setVisible(true); // display frame

	}// end main

}// end class PlayGuitar
