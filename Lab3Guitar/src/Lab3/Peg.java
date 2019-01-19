// Object Oriented Programming Lab 3 - Kevin Lai - Lai00035

package Lab3;

public class Peg
{

	// Variables
	private Wire wire;

	// Constructor
	public Peg(Wire wire) {
		this.wire = wire;
	}

	// Change in tension to wire
	public void turn(int deltaTension)
	{
		wire.changeTension(deltaTension);
	}

}
