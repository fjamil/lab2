import java.util.Comparator;


public final class Card {

	private eSuit Suit;
	private eRank Rank;
	
	
	
	private Card() 
	
	{

	}
	
	
public Card(eSuit suit, eRank rank)	

{
	Suit = suit;
	Rank = rank; 
}
	
	
	

public eRank getRank()

{
	return this.Rank;
}

public eSuit getSuit() {
	return this.Suit;
}


public static Comparator<Card> CardRank = new Comparator<Card>()

{
	public int compare(Card c1, Card c2) 
	{
		int cardOne = c1.getRank().getRank();
		int cardTwo = c2.getRank().getRank();
	

	return cardOne - cardTwo; 
	
	}
	


}

}
