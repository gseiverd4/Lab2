package pkgCore;

import pkgEnum.*;

//Group: Enoch Lee, Gregory Seiverd Jr., Junyu Long, Jack Norton

public class Card implements Comparable<Object> {
	
	private eRank eRank;
	private eSuit eSuit;

	
	//Set up super class and rename eSuit and eRank
	public Card(eSuit Suit, eRank Rank)
	{
		super();
		this.eRank = Rank;
		this.eSuit = Suit;
	}
	
	//Use setters and getters for eRank
	public eRank geteRank()
	{
		return eRank;
	}
	
	public void seteRank(eRank Rank) 
	{
		this.eRank = geteRank();
	}
	//Use setters and getters for eSuit
	public eSuit geteSuit() 
	{
		return eSuit;
	}

	public void seteSuit(eSuit eSuit) 
	{
		this.eSuit = geteSuit();
	}

	//implement the override
	@Override
	public int compareTo(Object o) {
		Card c = (Card) o;
		return c.geteRank().compareTo(this.geteRank());
	}
}