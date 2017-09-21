package pkgCore;

import java.util.ArrayList;
import java.util.Collections;

import pkgEnum.eRank;
import pkgEnum.eSuit;

public class Deck {
	
		private ArrayList<Card> cards = new ArrayList<Card>();
		
		public Deck() {
			for (eSuit Suit : eSuit.values())
			{
				for (eRank Rank : eRank.values())
				{
					cards.add(new Card(Suit, Rank));
				}
				
			
				}
			
			Collections.shuffle(cards);
}

		public Card Draw() {
			return cards.remove(0);
		}

}
