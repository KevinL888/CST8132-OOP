package vehicles;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * This class implements comparator and has a method to compare Vehicle objects
 * CST8132_303
 * 
 * @author Kevin Lai
 */
// Object Oriented Programming Lab 9 - Kevin Lai - Lai00035

// Class for Vehicle Comparator
class VehicleComparator implements Comparator<Vehicle>
{

	/**
	 * Method takes in 2 arguments and compares the speed
	 * 
	 * @param o1
	 *            first vehicle object
	 * @param o2
	 *            second vehicle object
	 * 
	 */
	@Override
	public int compare(Vehicle o1, Vehicle o2)
	{
		int speed1 = o1.speed;
		int speed2 = o2.speed;

		if (speed1 == speed2)
		{
			if (o1 instanceof Bicycle)
			{
				return -1;
			} else
			{
				return 1;
			}
		}

		if (speed1 > speed2)
		{
			return -1;
		} else if (speed1 < speed2)
		{
			return 1;
		}

		return 0;

	}
}

/**
 * This program is a simulation of a street with cars and bicycles CST8132_303
 * 
 * @author Kevin Lai
 */
// Object Oriented Programming Lab 9 - Kevin Lai - Lai00035

public class Street implements SimInterface
{
	// Variables
	private static final Random RANDOMNUMBERS = new Random();
	private JFrame ui = new JFrame("Street Simulation");
	private JPanel frame = new JPanel();
	private JTextField outputField = new JTextField(40);
	private ArrayList<Vehicle> vehicles;
	private int counter;

	// Constructor
	/**
	 * Instantiate Vehicle ArrayList and initialize counter
	 */

	public Street() {
		vehicles = new ArrayList<Vehicle>();
		counter = 0;
	}// Ends Constructor for Street

	/**
	 * Method to create GUI and Simulate street
	 */

	public void launch()
	{

		JButton a = new JButton("Add Bicycle");

		a.addActionListener(new ActionListener()
		{

			public void actionPerformed(ActionEvent e)
			{
				vehicles.add(new Bicycle());
				outputField.setText(vehicles.get(counter).name + " got added");
				counter++;

			}
		});

		JButton b = new JButton("Add Car");
		b.addActionListener(new ActionListener()
		{

			public void actionPerformed(ActionEvent e)
			{
				vehicles.add(new Car());

				outputField.setText(vehicles.get(counter).name + " got added");

				counter++;

			}
		});
		JButton c = new JButton("Done");
		c.addActionListener(new ActionListener()
		{

			public void actionPerformed(ActionEvent e)
			{
				if (vehicles.size() == 0)
				{
					System.out.println("There are no vehicles");
				} else
				{
					simulate();
				}

			}
		});

		MouseListener listener = new MouseListener()
		{

			@Override
			public void mouseReleased(MouseEvent e)
			{
				if (e.getSource() == a)
				{
					a.setBackground(Color.CYAN);
				}

				if (e.getSource() == b)
				{
					b.setBackground(Color.CYAN);
				}

				if (e.getSource() == c)
				{
					c.setBackground(Color.CYAN);
				}
			}

			@Override
			public void mousePressed(MouseEvent e)
			{
				if (e.getSource() == a)
				{
					a.setBackground(Color.GREEN);
				}

				if (e.getSource() == b)
				{
					b.setBackground(Color.GREEN);
				}

				if (e.getSource() == c)
				{
					c.setBackground(Color.GREEN);
				}

			}

			@Override
			public void mouseExited(MouseEvent e)
			{
				if (e.getSource() == a)
				{
					a.setBackground(Color.CYAN);
				}

				if (e.getSource() == b)
				{
					b.setBackground(Color.CYAN);
				}

				if (e.getSource() == c)
				{
					c.setBackground(Color.CYAN);
				}

			}

			@Override
			public void mouseEntered(MouseEvent e)
			{
				if (e.getSource() == a)
				{
					a.setBackground(Color.GREEN);
				}

				if (e.getSource() == b)
				{
					b.setBackground(Color.GREEN);
				}

				if (e.getSource() == c)
				{
					c.setBackground(Color.GREEN);
				}

			}

			@Override
			public void mouseClicked(MouseEvent e)
			{
				if (e.getSource() == a)
				{
					a.setBackground(Color.CYAN);
				}

				if (e.getSource() == b)
				{
					b.setBackground(Color.CYAN);
				}

				if (e.getSource() == c)
				{
					c.setBackground(Color.CYAN);
				}

			}
		};

		a.addMouseListener(listener); // add mouse listener for bicycle button
		b.addMouseListener(listener); // add mouse listener for car button
		c.addMouseListener(listener); // add mouse listener for done button
		ui.setLayout(new FlowLayout()); // set background JFrame layout model
		frame.setLayout(new GridLayout(1, 3, 10, 10)); // Add Panel for buttons
		a.setPreferredSize(new Dimension(100, 45)); // set size bicycle button
		b.setPreferredSize(new Dimension(100, 45)); // set size for car button
													// button
		c.setPreferredSize(new Dimension(100, 45)); // set size for done button

		outputField.setForeground(Color.RED); // set color for text in
												// JTextField
		frame.add(a); // add bicycle button component to the JPanel container
		frame.add(b); // add car button component to the JPanel container
		frame.add(c); // add done button component to the JPanel container
		frame.setLocation(200, 200); // set JPanel container location
		ui.add(frame); // add JPanel container onto JFrame container
		ui.add(outputField); // add JText component to JFrame container

		ui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ui.setSize(600, 280); // set frame size
		ui.setVisible(true); // display frame
	}

	/**
	 * Method used to create street simulation
	 */
	@Override
	public void simulate()
	{

		for (int i = 0; i < 6; i++)
		{
			System.out.println("Update on the street " + i + ":");
			update();
			System.out.println();

		}
	}// Ends method simulate

	/**
	 * Method used to print all vehicles with their speed and noise, than press
	 * the pedal of a random vehicle
	 */

	public void update()
	{
		// Sorted

		System.out.println("--- sorted:");

		Collections.sort(vehicles, new VehicleComparator());

		Iterator<Vehicle> it = vehicles.iterator();

		while (it.hasNext())
		{
			Vehicle vehicle = it.next();
			System.out.println(vehicle.name + " speed: " + vehicle.speed + ", " + vehicle.noise());
		}

		// Shuffled

		System.out.println("--- shuffled:");

		Collections.shuffle(vehicles);

		it = vehicles.iterator();

		while (it.hasNext())
		{
			Vehicle vehicle = it.next();
			System.out.println(vehicle.name + " speed: " + vehicle.speed + ", " + vehicle.noise());
		}
		int random = RANDOMNUMBERS.nextInt(vehicles.size());
		vehicles.get(random).pedal();
		System.out.println("The pedal of " + vehicles.get(random).name + " was pushed ");

	} // Ends method update

	/**
	 * Main for Street
	 * 
	 * @param args
	 *            used to declare main class
	 */

	public static void main(String[] args)
	{
		Street gui = new Street();
		gui.launch();

	}// Ends Main

	/**
	 * Takes in an array of Strings and creates vehicle objects corresponding to
	 * the Strings
	 * 
	 * @param s
	 *            Array of strings getting passed in to create vehicle objects
	 */

	@Override
	public void parse(String[] s)
	{

		for (int i = 0; i < s.length; i++)
		{
			try
			{
				if (s[i].equals("car"))
				{
					vehicles.add(new Car());
				} else if (s[i].equals("bicycle"))
				{
					vehicles.add(new Bicycle());
				} else
				{
					throw new Exception("Invalid input");
				}
			} catch (Exception e)
			{
				System.err.println(e.getMessage());
			}

		}

	}

	/**
	 * Method to get sum of all bicycle speeds
	 */

	@Override
	public int getSumBicyleSpeeds()
	{
		int sum = 0;

		for (Vehicle vehicle : vehicles)
		{
			if (vehicle instanceof Bicycle)
			{
				sum += vehicle.speed;

			}
		}

		return sum;
	}

	/**
	 * Method used to get sum of all Car speeds
	 */

	@Override
	public int getSumCarSpeeds()
	{

		int sum = 0;

		for (Vehicle vehicle : vehicles)
		{
			if (vehicle instanceof Car)
			{
				sum += vehicle.speed;

			}
		}

		return sum;
	}
}// Ends class Street
