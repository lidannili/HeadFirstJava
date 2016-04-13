public class GuessGame
{
	Player p1;
	Player p2;
	Player p3; // Three instance variables for the three Player objects

	public void startGame()
	{
		p1 = new Player();
		p2 = new Player();
		p3 = new Player(); // create three player objects and assign them to the three Player instance variables

		int guessp1 = 0;
		int guessp2 = 0;
		int guessp3 = 0; // declare three variables to hold the three guesses the Players make

		boolean p1isRight = false;
		boolean p2isRight = false;
		boolean p3isRight = false; // declare three variables to hold a true of flase based on the player's answer

		int targetNumber = (int)(Math.random()*10); // make a "target" number that the players have to guess
		System.out.println("I'm thinking of a number between 0 and 9 ...");

		while(true)
		{
			System.out.println("Number to guess is " + targetNumber);

			p1.guess(); 
			p2.guess(); 
			p3.guess(); // call each player's guess() method

			guessp1 = p1.number;
			System.out.println("Player one guessed " + guessp1);

			guessp2 = p2.number;
			System.out.println("Player one guessed " + guessp2);

			guessp3 = p3.number;
			System.out.println("Player one guessed " + guessp3); // get each player's guess by accessing the number variable of each player

			if (guessp1 == targetNumber)
			{
				p1isRight = true;
			}

			if (guessp2 == targetNumber)
			{
				p2isRight = true;
			}

			if (guessp3 == targetNumber)
			{
				p3isRight = true;
			}

			if(p1isRight || p2isRight || p3isRight)
			{
				System.out.println("We have a winner!");
				System.out.println("Player one got it right?" + p1isRight);
				System.out.println("Player two got it right?" + p2isRight);
				System.out.println("Player three got it right?" + p3isRight);
				System.out.println("Game is over.");
				break;
			}
			else
			{
				System.out.println("Players will have to try again.");
			}

		}


	}
}