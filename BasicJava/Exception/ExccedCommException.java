class ExceedCommException extends Exception{
	ExceedCommException(){
	super("The Comm should not be more than 40% of the salary");
	}
}