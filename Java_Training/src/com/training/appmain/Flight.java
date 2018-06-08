/**
 * 
 */
package com.training.appmain;

/**
 * @author Swapnil
 *
 */
//A class is made up of both state and executable code
public class Flight {
	//When marked as public, file name and class name has to be same
	//first character of name has to be upper case and its always a letter. All other are lower case
	//Use descriptive name like full words
	    //Fields
	    //If marked private, can not be accessed out side of the class
	    public int passangers;
	    public int seats;

	    //constructor - executable code used during object creation to set the initial state
	    public Flight (){
	        seats = 150;
	        passangers = 0;
	    }

	    //methods - Executable code that manipulates state and performs operations
	    //Three reason to exit method - end of the method reached, return statement is encountered, an error occurred
	    //Method only returns only one value. It can return value, reference to an object or method, or array
	    //When reference to
	    public boolean add1Passenger(){ //void means not returning any value

	        if (passangers == this.seats)
	            //this is an implicit reference to the current object
	            //Useful for reducing ambiguity and Allows an object to pass itself as a parameter
	            return false;

	        if (passangers < seats)
	            passangers += 1;
	        else
	            tooMany(); //This is how to call method within class

	        return true;
	    }
	    private void tooMany(){ //Private method can not be accessed out side of class
	        System.out.println("Too Many");
	    }

	    public void add2Passenger(int add2p, int add2s, Flight add3Passenger){ //void means not returning any value

	        if (add2p < add2s)
	            add2p += 1;
	        else if (add2p < add3Passenger.seats)
	            System.out.println("add3 has room");
	        else
	            tooMany();
	    }



}
