import java.io.*;
public class UserDefinedException{
	public static void main(String[] args) throws AgeException{
	int age=17;
	try{
		if (age<18){
			throw new AgeException("Sorry!");
		}
		else{
		System.out.println("Please vote!");
		
		}
	
	}
	catch(AgeException e){
	System.out.println(e.getMessage());
	}
	
	}
}
class AgeException extends Exception{ 
	AgeException(String message){
	super(message);
	}
}
