//This game is open source software created by Zach Gillis.
//You can use the source of this game to create a commercial product as long as credit is given to the creator.
//Project started on December 27, 2012

package com.github.zgillis;

import java.util.Scanner;

public class main
{
	static final float version = 0.1f;
	public static Scanner input = new Scanner(System.in);
	public static void main(String[] args)
	{
		System.out.println("Terminal Blackjack - by Zach Gillis");
		System.out.println("Version: " + version + "\n");
		while(true)
		{
			System.out.println("What would you like to do?\n\t1. Play New Game\n\t2. About This Game\n\t3. Quit");
			try
			{
				int choice = Integer.parseInt(input.nextLine());
				if(choice == 1)
				{
					Game game = new Game();
				}
				else if(choice == 2)
				{
					System.out.println("This game was created by Zach Gillis in December of 2012.\n\nPress enter to continue.");
					input.nextLine();
				}
				else if(choice == 3)
				{
					System.exit(0);
				}
			}
			catch(Exception e)
			{
				System.out.println("Invalid choice.\n");
				continue;
			}
		}
	}
}
