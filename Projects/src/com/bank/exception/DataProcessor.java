package com.bank.exception;

public class DataProcessor {

	public void processData(int accbal, int amount) throws CustomException {
		// TODO Auto-generated method stub
		
		 if(accbal<amount) {

			   throw new CustomException("Invalid data Enter:Insuffeciant balance.");
		   }
		
	}

	
	public void processData(int amount) throws CustomException {
	
		 if (amount < 0) {
		     throw new CustomException("Invalid data: Negative values not allowed.");
		   }

	}

	public void processData2(int amount) throws CustomException {
	
		 if (amount < 0) {
		     throw new CustomException("Invalid data: Negative values not allowed.");
		   }

	}
	
	
	
	
	

	  public void processInput(Object input) throws InvalidInputTypeException {
		  
	  
	        if (!(input instanceof Integer)) {
	            throw new InvalidInputTypeException("Invalid input type. Expected Integer.");
	        }

	        // Your processing logic for valid input type goes here
	        System.out.println("Processing input: " + input);
	
	
	
	
	
}
}