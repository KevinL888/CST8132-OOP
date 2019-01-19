package guitar;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 * This class is used to add Mouse motion listener (mouse dragged, mouse moved)
 * 
 * @author Kevin Lai
 */
// Object Oriented Programming Lab 8 - Kevin Lai - Lai00035

public class GuitarPanel extends JPanel
{

	// Instance Variables
	private static final long serialVersionUID = 1L;
	private Image img = new ImageIcon(getClass().getResource("/guitar.jpg")).getImage();
	private int[] y = { 0, 408, 381, 356, 327, 300, 272 };
	private int previousY;
	private int currentX;
	private int currentY;
	private Guitar guitar;

	// set up GUI and register mouse event handler
	public GuitarPanel() {
		previousY = 0;
		currentY = 0;
		currentX = 0;
		guitar = new Guitar();

		// handle frame mouse motion event
		addMouseMotionListener(

				new MouseMotionAdapter() // anonymous inner class
				{

					public void mouseMoved(MouseEvent event)
					{
						previousY = event.getY();

					}

					// store drag coordinates and repaint
					public void mouseDragged(MouseEvent event)
					{
						currentY = event.getY();
						currentX = event.getX();
						if (currentX > 113 && currentY < 410 && currentY > 270)
						{

							for (int i = (y.length - 1); i > 0; i--)
							{
								if (previousY < y[i] && currentY >= y[i] || previousY > y[i] && currentY <= y[i])
								{
									guitar.pluck(i);

								}

							}
							previousY = currentY;

						}

					} // end method mouseDragged
				} // end anonymous inner class
		); // end call to addMouseMotionListener
	} // end GuitarPanel constructor

	public void paintComponent(Graphics g)
	{
		super.paintComponent(g); // clears drawing area
		g.drawImage(img, 0, 0, null);

	}// end method paintComponent

}// end class GuitarPanel
