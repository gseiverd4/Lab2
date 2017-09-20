package pkgCore;

import pkgEnum.*;

public class Card implements Comparable {
	
	private eRank eRank;
	private eSuit eSuit;
	
	public eRank geteRank()
	{
		return eRank;
	}
	
	public void seteRank(eRank eRank) {
		this.eRank = eRank;
	}

	public eSuit geteSuit() 
	{
		return eSuit;
	}

	public void seteSuit(eSuit eSuit) 
	{
		this.eSuit = eSuit;
	}
	
	public Card(eRank eRank, eSuit eSuit)
	{
		super();
		this.eRank = eRank;
		this.eSuit = eSuit;
	}

	@Override
	public int compareTo(Object o) {
		Card c = (Card) o;
		return 0;
		//return c.geteRank().compareTo(this.geteRank());

}
	
}
