public class SimpleDotCom {
	int[] locationCells;
	int numOfHits = 0;

	public void setLocationCells(int[] locs){
		locationCells = locs;
	}

	public String checkYourself(String stringGuess) {

	// convert the String to an int
	int guess = Integer.parseInt(stringGuess);

	//make a variable to hold the result we'll return. put "miss" in as the default
	String result = "miss";

	//repeat with each cell in the locationCells array(each cell location of the object)
	for (int cell : locationCells) {
		if (guess == cell){
			result = "hit";
			numOfHits++;

			//get out of the loop,no need to test the other cells.
			break;
		} // end if
	} // end for

	if(numOfHits == locationCells.length){
	result = "kill";
	}//end if

	System.out.println(result);
	//return the result back to the calling method
	return result;
	} //end method
}