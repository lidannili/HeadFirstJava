public class SimpleDotComTestDrive {
	public static void main(String[] args){
		//make a variable to track how many guesses the user makes
		int numOfGuesses = 0;

		//this is a special class we wrote that has the method for getting user input for now, pretend it's part of java
		GameHelper helper = new GameHelper();

		//make the dot com object
		SimpleDotCom theDotCom = new SimpleDotCom();

		//make a random number for the first cell, and use it to make the cell locations array
		int randomNum = (int)(Math.random()*5);
		int[] locations = {randomNum,randomNum+1,randomNum+2};

		//give the dot com its locations(the array)
		theDotCom.setLocationCells(locations);

		//make a boolean variable to track whether the game is still alive
		//to use in the while loop test repeat while game is alive
		boolean isAlive = true;
	
		while(isAlive == true){
			//get user input String
			String guess = helper.getUserInput("enter a number");

			//ask the dot com to check the guess;save the returned result in a string
			String result = theDotCom.checkYourself(guess);

			//increment guess count
			numOfGuesses++;
			if(result.equals("kill")){
				isAlive = false;
				System.out.println("You took " + numOfGuesses + " guesses");
			}
		}

	}
}

	//public static void main (String[] args){
	
	// instantiate a SimpleDotCom Object
	//SimpleDotCom dot = new SimpleDotCom();

	// make an int array for the location of the dot com (3 consecutive ints out of a possible 7)
	//int[] locations = {2,3,4};

	// invoke the setter method on the dot com
	//dot.setLocationCells(locations);

	//String userGuess = "2";

	// invoke the checkYourself() method on the dot com object, and pass it the fake guess
	//String result = dot.checkYourself(userGuess);
	//}
//}

