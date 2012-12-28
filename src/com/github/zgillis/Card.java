package com.github.zgillis;

public class Card
{
	public csuit suit;
	public cvalue value;
	
	public Card(csuit new_suit, cvalue new_value)
	{
		suit = new_suit;
		value = new_value;
	}
	
	public int getValue()
	{
		if(value == cvalue.ACE)
			return 11;
		else if(value == cvalue.TWO)
			return 2;
		else if(value == cvalue.THREE)
			return 3;
		else if(value == cvalue.FOUR)
			return 4;
		else if(value == cvalue.FIVE)
			return 5;
		else if(value == cvalue.SIX)
			return 6;
		else if(value == cvalue.SEVEN)
			return 7;
		else if(value == cvalue.EIGHT)
			return 8;
		else if(value == cvalue.NINE)
			return 9;
		else if(value == cvalue.TEN)
			return 10;
		else if(value == cvalue.JACK)
			return 10;
		else if(value == cvalue.QUEEN)
			return 10;
		else if(value == cvalue.KING)
			return 10;
		else
			return 0;
	}
	
	public String toString()
	{
		return value + " of " + suit;
	}
	
	public String getID()
	{
		return value.toString();
	}
}
