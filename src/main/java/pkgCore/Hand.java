package pkgCore;

import java.util.ArrayList;
import java.util.Collections;

public class Hand {

	@SuppressWarnings("unused")
	private int iScore;
	private ArrayList<Card> cards = new ArrayList<Card>();
	
	public Hand()
	{
		
	}
	
	public int [] ScoreHand()
	{
		int [] iScore = new int[2];
		//int theAce = 0;
		
		iScore[0] = 0;
		iScore[1] = 0;
		
		Collections.sort(cards);

		
		for (Card c: cards)
		{
			
			switch(c.geteRank()) {
			case ACE:
				iScore[0] += 11;
				iScore[1] += 1;
				break;
			case TEN: 
			case JACK: 
			case QUEEN: 
			case KING:
					iScore[0] += 10;
					iScore[1] += 10;
					break;
			default:
					iScore[0] += c.geteRank().getiRankNbr();
					iScore[1] += c.geteRank().getiRankNbr();
				}
			
			//Correct a problem with multiple aces
			if (iScore[0] != iScore[1]) 
			{
				if(iScore[0] > 21) 
				{
					iScore[0] = iScore[0] - 10;
				}
			}
		}
		
		return iScore;
	}
		

	public void Draw(Deck d)
	{
		cards.add(d.Draw());
	}
	
	@SuppressWarnings("unused")
	private void AddCard(Card c)
	
	{
		cards.add(c);
	}
}
