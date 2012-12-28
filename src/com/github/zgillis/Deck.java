package com.github.zgillis;

import java.util.*;

public class Deck
{
	public ArrayList<Card> deckArray;
	public Deck()
	{
		deckArray = new ArrayList<Card>();
		//Prepare deck with all cards.
		deckArray.add(new Card(csuit.DIAMONDS, cvalue.ACE));
		deckArray.add(new Card(csuit.DIAMONDS, cvalue.TWO));
		deckArray.add(new Card(csuit.DIAMONDS, cvalue.THREE));
		deckArray.add(new Card(csuit.DIAMONDS, cvalue.FOUR));
		deckArray.add(new Card(csuit.DIAMONDS, cvalue.FIVE));
		deckArray.add(new Card(csuit.DIAMONDS, cvalue.SIX));
		deckArray.add(new Card(csuit.DIAMONDS, cvalue.SEVEN));
		deckArray.add(new Card(csuit.DIAMONDS, cvalue.EIGHT));
		deckArray.add(new Card(csuit.DIAMONDS, cvalue.NINE));
		deckArray.add(new Card(csuit.DIAMONDS, cvalue.TEN));
		deckArray.add(new Card(csuit.DIAMONDS, cvalue.JACK));
		deckArray.add(new Card(csuit.DIAMONDS, cvalue.QUEEN));
		deckArray.add(new Card(csuit.DIAMONDS, cvalue.KING));
		
		deckArray.add(new Card(csuit.HEARTS, cvalue.ACE));
		deckArray.add(new Card(csuit.HEARTS, cvalue.TWO));
		deckArray.add(new Card(csuit.HEARTS, cvalue.THREE));
		deckArray.add(new Card(csuit.HEARTS, cvalue.FOUR));
		deckArray.add(new Card(csuit.HEARTS, cvalue.FIVE));
		deckArray.add(new Card(csuit.HEARTS, cvalue.SIX));
		deckArray.add(new Card(csuit.HEARTS, cvalue.SEVEN));
		deckArray.add(new Card(csuit.HEARTS, cvalue.EIGHT));
		deckArray.add(new Card(csuit.HEARTS, cvalue.NINE));
		deckArray.add(new Card(csuit.HEARTS, cvalue.TEN));
		deckArray.add(new Card(csuit.HEARTS, cvalue.JACK));
		deckArray.add(new Card(csuit.HEARTS, cvalue.QUEEN));
		deckArray.add(new Card(csuit.HEARTS, cvalue.KING));
		
		deckArray.add(new Card(csuit.CLUBS, cvalue.ACE));
		deckArray.add(new Card(csuit.CLUBS, cvalue.TWO));
		deckArray.add(new Card(csuit.CLUBS, cvalue.THREE));
		deckArray.add(new Card(csuit.CLUBS, cvalue.FOUR));
		deckArray.add(new Card(csuit.CLUBS, cvalue.FIVE));
		deckArray.add(new Card(csuit.CLUBS, cvalue.SIX));
		deckArray.add(new Card(csuit.CLUBS, cvalue.SEVEN));
		deckArray.add(new Card(csuit.CLUBS, cvalue.EIGHT));
		deckArray.add(new Card(csuit.CLUBS, cvalue.NINE));
		deckArray.add(new Card(csuit.CLUBS, cvalue.TEN));
		deckArray.add(new Card(csuit.CLUBS, cvalue.JACK));
		deckArray.add(new Card(csuit.CLUBS, cvalue.QUEEN));
		deckArray.add(new Card(csuit.CLUBS, cvalue.KING));
		
		deckArray.add(new Card(csuit.SPADES, cvalue.ACE));
		deckArray.add(new Card(csuit.SPADES, cvalue.TWO));
		deckArray.add(new Card(csuit.SPADES, cvalue.THREE));
		deckArray.add(new Card(csuit.SPADES, cvalue.FOUR));
		deckArray.add(new Card(csuit.SPADES, cvalue.FIVE));
		deckArray.add(new Card(csuit.SPADES, cvalue.SIX));
		deckArray.add(new Card(csuit.SPADES, cvalue.SEVEN));
		deckArray.add(new Card(csuit.SPADES, cvalue.EIGHT));
		deckArray.add(new Card(csuit.SPADES, cvalue.NINE));
		deckArray.add(new Card(csuit.SPADES, cvalue.TEN));
		deckArray.add(new Card(csuit.SPADES, cvalue.JACK));
		deckArray.add(new Card(csuit.SPADES, cvalue.QUEEN));
		deckArray.add(new Card(csuit.SPADES, cvalue.KING));
		
		this.shuffle();
	}
	
	public Stack getStack()
	{
		Stack stack = new Stack();
		for(int i = 0; i < deckArray.size(); i++)
		{
			stack.push(deckArray.get(i));
		}
		return stack;
	}
	
	public void shuffle()
	{
		for(int i = 0; i < deckArray.size(); i++)
			Collections.shuffle(deckArray);
	}
	
	public void printContents()
	{
		for(int i = 0; i < deckArray.size(); i++)
		{
			System.out.println(deckArray.get(i));
		}
	}
}
