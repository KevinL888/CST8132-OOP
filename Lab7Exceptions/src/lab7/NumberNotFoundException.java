package lab7;

public class NumberNotFoundException extends Exception {						
	private static final long serialVersionUID = 1L;
	// no-argument constructor specifies default error message
	public NumberNotFoundException() {									
		super( "Number not found in array" );
	}				
	// constructor to allow customized error message 				
	public NumberNotFoundException( String message ) {	
		super( message );	// 		
	} // end class NumberNotFoundException 
}
