import java.util.Scanner;

class Guesser
{
	int guessNum;
	
	int guessNum()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Guesser kindly guess the num: ");
		guessNum=s.nextInt();
		return guessNum;
	}
}

class Player
{
	int guessNum;
	
	int guessNum()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Player kindly guess the num: ");
		guessNum=s.nextInt();
		return guessNum;
	}
}

class Umpire
{
	int numFromGuesser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;
	
	void collectNumFromGuesser()
	{
		Guesser g=new Guesser();
		numFromGuesser=g.guessNum();
	}
	
	void collectNumFromPlayer()
	{
		Player P1=new Player();
		Player P2=new Player();
		Player P3=new Player();
		
		numFromPlayer1=P1.guessNum();
		numFromPlayer2=P2.guessNum();
		numFromPlayer3=P3.guessNum();
	}
	
	void compare()
	{
		if(numFromGuesser==numFromPlayer1)
		{
			if(numFromGuesser==numFromPlayer2 && numFromGuesser==numFromPlayer3)
			{
				System.out.println("All players won the game!");
			}
			else if(numFromGuesser==numFromPlayer2)
			{
				System.out.println("Player 1 & Player 2 Won the game");
			}
			else if(numFromGuesser==numFromPlayer3)
			{
				System.out.println("Player 1 & Player3 Won the game");
			}
			else
			{
			System.out.println("Player1 Won the game");
		}
		}
		else if(numFromGuesser==numFromPlayer2)
		{
			if(numFromGuesser==numFromPlayer3)
			{
				System.out.println("Player 2 & Player3 Won the game");
			}
			else
			{
			System.out.println("Player2 Won the game");
		}
		}
		else if(numFromGuesser==numFromPlayer3)
		{
			System.out.println("Player3 Won the game");
		}
		else
		{
			System.out.println("Game Lost Try Again!");
		}
	}
	
}
public class GuesserG {

	public static void main(String[] args) {
		Umpire u=new Umpire();
		u.collectNumFromGuesser();
		u.collectNumFromPlayer();
		u.compare();
		

	}

}
