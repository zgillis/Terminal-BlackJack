package com.github.zgillis;

import java.util.*;

public class Game
{
	public final int dly = 1500;
	ArrayList<Card> dealerHand = new ArrayList<Card>();
	ArrayList<Card> playerHand = new ArrayList<Card>();
	
	boolean gamedone = false;
	
	int total = 0;
	int numOfAces = 0;
	int acesReduced = 0;
	
	int dtotal = 0;
	int dnumOfAces = 0;
	int dacesReduced = 0;
	
	public Game() throws Exception
	{
		Deck preDeck = new Deck();
		Stack deck = preDeck.getStack();
		Card pc1 = (Card)deck.pop();
		System.out.println("Player Dealt " + pc1);
		Thread.sleep(dly);
		playerHand.add(pc1);
		Card dc1 = (Card)deck.pop();
		System.out.println("Dealer Dealt card face down.");
		Thread.sleep(dly);
		dealerHand.add(dc1);
		Card pc2 = (Card)deck.pop();
		System.out.println("Player Dealt " + pc2);
		Thread.sleep(dly);
		playerHand.add(pc2);
		Card dc2 = (Card)deck.pop();
		System.out.println("Dealer Dealt " + dc2);
		Thread.sleep(dly);
		dealerHand.add(dc2);
		System.out.println(getPlayerHand());
		Thread.sleep(dly);
		System.out.println("Player Total: " + totalPlayerCards());
		Thread.sleep(dly);
		
		while(totalPlayerCards() <= 21 && gamedone == false)
		{
			System.out.println("What would you like to do?\n\t1. Hit\n\t2. Stand");
			try
			{
				int choice = Integer.parseInt(main.input.nextLine());
				if(choice == 1)
				{
					Card draw = (Card)deck.pop();
					Thread.sleep(dly);
					System.out.println("Player Dealt: " + draw);
					playerHand.add(draw);
					Thread.sleep(dly);
					System.out.println("Player Total: " + totalPlayerCards());
					if(totalPlayerCards() > 21)
					{
						Thread.sleep(dly);
						System.out.println("Player Busted!");
						Thread.sleep(dly);
						System.out.println("Press enter to continue.");
						main.input.nextLine();
						gamedone = true;
						break;
					}
				}
				else if(choice == 2)
				{
					while(true)
					{
						Thread.sleep(dly);
						System.out.println(getDealerHand());
						Thread.sleep(dly);
						System.out.println("Dealer Total: " + totalDealerCards());
						if(totalDealerCards() < 17)
						{
							Card draw = (Card)deck.pop();
							Thread.sleep(dly);
							System.out.println("Dealer Dealt " + draw);
							dealerHand.add(draw);
						}
						else
						{
							Thread.sleep(dly);
							System.out.println("Dealer stands at " + totalDealerCards());
							if(totalPlayerCards() > totalDealerCards())
							{
								Thread.sleep(dly);
								System.out.println("Player wins!!!");
								Thread.sleep(dly);
								System.out.println("Press enter to continue.");
								main.input.nextLine();
								gamedone = true;
								break;
							}
							else if(totalPlayerCards() < totalDealerCards() && totalDealerCards() <= 21)
							{
								Thread.sleep(dly);
								System.out.println("Dealer wins. Player loses.");
								Thread.sleep(dly);
								System.out.println("Press enter to continue.");
								main.input.nextLine();
								gamedone = true;
								break;
							}
							else if(totalDealerCards() > 21)
							{
								Thread.sleep(dly);
								System.out.println("Dealer Busts. Player Wins!!!");
								Thread.sleep(dly);
								System.out.println("Press enter to continue.");
								main.input.nextLine();
								gamedone = true;
								break;
							}
							else
							{
								Thread.sleep(dly);
								System.out.println("Result is a push.");
								Thread.sleep(dly);
								System.out.println("Press enter to continue.");
								main.input.nextLine();
								gamedone = true;
								break;
							}
						}
					}
				}
				else
				{
					System.out.println("Invalid Choice.\n");
					Thread.sleep(dly);
					continue;
				}
			}
			catch(Exception e)
			{
				System.out.println("Invalid Choice.\n");
				Thread.sleep(dly);
				continue;
			}
		}
	}
	
	public String getPlayerHand()
	{
		String info = "Player Hand: ";
		for(int i = 0; i < playerHand.size(); i++)
		{
			if(i > 0)
				info += ", ";
			info += playerHand.get(i).getID();
		}
		return info;
	}
	
	public String getDealerHand()
	{
		String info = "Dealer Hand: ";
		for(int i = 0; i < dealerHand.size(); i++)
		{
			if(i > 0)
				info += ", ";
			info += dealerHand.get(i).getID();
		}
		return info;
	}
	
	public int totalPlayerCards()
	{
		total = 0;
		for(int i = 0; i < playerHand.size(); i++)
		{
			Card temp = playerHand.get(i);
			total += temp.getValue();
			if(temp.value == cvalue.ACE)
				numOfAces++;
		}
		if(total > 21)
		{
			if(numOfAces > 0 && numOfAces > acesReduced)
			{
				total -= 10;
			}
		}
		return total;
	}
	
	public int totalDealerCards()
	{
		dtotal = 0;
		for(int i = 0; i < dealerHand.size(); i++)
		{
			Card temp = dealerHand.get(i);
			dtotal += temp.getValue();
			if(temp.value == cvalue.ACE)
				dnumOfAces++;
		}
		if(dtotal > 21)
		{
			if(dnumOfAces > 0 && dnumOfAces > dacesReduced)
			{
				dtotal -= 10;
			}
		}
		return dtotal;
	}
}
