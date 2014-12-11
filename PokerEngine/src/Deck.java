import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;



public class Deck {
	private ArrayList<Card> cards;
	
	
	public Deck()
	
	{
		ArrayList<Card> MakeDeck = new ArrayList<Card>();
		for (short i = 0; i <= 3; i++) {
			eSuit SuitValue = eSuit.values()[i];
			
			for (short j = 0; j <= 12; j++) {
				eRank rValue = eRank.values()[j];
				Card NewCard = new Card(SuitValue,rValue);
				createDeck.add(NewCard);
			}
		}
		
		
		cards = createDeck;
		
		Collections.shuffle(cards);
		
	}
	
	
	
	
	public Card deckDraw() 
	{
		
		Card FirstCard = cards.get(0);
		cards.remove(0);
		return FirstCard; 
		
	}
	
	public int getTotalCards()
	
	{
		return cards.size();
	
	
	
	
	}



}
