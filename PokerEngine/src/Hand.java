import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Hand {
	
	
	
	private ArrayList<Card> CardsInHand;
	
private int Strength;

private int highHand;

private int lowHand; 

private int Kicker; 
private boolean Scored = false; 


private boolean Flush; 

private boolean Straight; 

private boolean Ace; 


public Hand(Deck d)
{
	ArrayList<Card> Import = new ArrayList<Card>();
	for (int x = 0; x < 5; x++)
	{
		Import.add(d.drawfromDeck());
		
	}
	CardsInHand = Import; 
}

public ArrayList<Card> getCards() 
{
return CardsInHand;
}
public int getStrength() 
{
return Strength;
}
public int getKicker() 
{
return Kicker;
}
public int getHighPairStrength() 
{
return highHand;
}
public int getLowPairStrength() 
{
return lowHand;
}
public boolean getAce() 
{
return Ace;
}


	
public static Hand EvalHand(ArrayList<Card> SeededHand) {
Deck d = new Deck();
Hand h = new Hand(d);
h.CardsInHand = SeededHand;
h.EvalHand();
return h;	
	
}


public void EvaluateHand()

{
	
	Collections.sort(CardsInHand, Card.CardRank);
	
	
	
	
	
	if (CardsInHand.get(eCardNo.FirstCard.getCardNo())).getRank() == eRank.Ace)
	
	{
		Ace = true; 
	}

	
	
	
if (CardsInHand.get(eCardNo.FirstCard.getCardNo()).getSuit() == CardsInHand.get(eCardNo.SecondCard.getCardNo()).getSuit()
&& CardsInHand.get(eCardNo.FirstCard.getCardNo()).getSuit() == CardsInHand.get(eCardNo.ThirdCard.getCardNo()).getSuit()
&& CardsInHand.get(eCardNo.FirstCard.getCardNo()).getSuit() == CardsInHand.get(eCardNo.FourthCard.getCardNo()).getSuit()
&& CardsInHand.get(eCardNo.FirstCard.getCardNo()).getSuit() == CardsInHand.get(eCardNo.FifthCard.getCardNo()).getSuit()) {
Flush = true;
} 
else 
{
Flush = false;	
}


if (Ace) 

{
	
	if (CardsInHand.get(eCardNo.SecondCard.getCardNo()).getRank() == eRank.KING
	&& CardsInHand.get(eCardNo.ThirdCard.getCardNo()).getRank() == eRank.QUEEN
	&& CardsInHand.get(eCardNo.FourthCard.getCardNo()).getRank() == eRank.JACK
	&& CardsInHand.get(eCardNo.FifthCard.getCardNo()).getRank() == eRank.TEN) {
	Straight = true;

	} 
	
	
	else if (CardsInHand.get(eCardNo.FifthCard.getCardNo()).getRank() == eRank.TWO
	&& CardsInHand.get(eCardNo.FourthCard.getCardNo()).getRank() == eRank.THREE
	&& CardsInHand.get(eCardNo.ThirdCard.getCardNo()).getRank() == eRank.FOUR
	&& CardsInHand.get(eCardNo.SecondCard.getCardNo()).getRank() == eRank.FIVE) {
	Straight = true;
	} 
	else 
	{
	Straight = false;
	}
}

else if (CardsInHand.get(eCardNo.FirstCard.getCardNo()).getRank().getRank() == CardsInHand.get(eCardNo.SecondCard.getCardNo()).getRank()
.getRank() + 1
&& CardsInHand.get(eCardNo.FirstCard.getCardNo()).getRank().getRank() == CardsInHand.get(eCardNo.ThirdCard.getCardNo()).getRank()
.getRank() + 2
&& CardsInHand.get(eCardNo.FirstCard.getCardNo()).getRank().getRank() == CardsInHand.get(eCardNo.FourthCard.getCardNo()).getRank()
.getRank() + 3
&& CardsInHand.get(eCardNo.FirstCard.getCardNo()).getRank().getRank() == CardsInHand.get(eCardNo.FifthCard.getCardNo()).getRank()
.getRank() + 4) {
Straight = true;
} 
else 

{
Straight = false;
}
	
	
if (Straight == true && Flush == true
&& CardsInHand.get(eCardNo.FifthCard.getCardNo()).getRank() == eRank.TEN && Ace) {
ScoreHand(eStrength.RoyalFlush, 0, 0, 0);	
	
	
else if (Straight == true && Flush == true) {
ScoreHand(eHandStrength.StraightFlush, CardsInHand.get(eCardNo.FirstCard.getCardNo()).getRank().getRank(), 0, 0);
}	
	
	
else if (CardsInHand.get(eCardNo.FirstCard.getCardNo()).getRank() == CardsInHand.get(eCardNo.SecondCard.getCardNo()).getRank()
&& CardsInHand.get(eCardNo.FirstCard.getCardNo()).getRank() == CardsInHand.get(eCardNo.ThirdCard.getCardNo()).getRank()
&& CardsInHand.get(eCardNo.FirstCard.getCardNo()).getRank() == CardsInHand.get(eCardNo.FourthCard.getCardNo()).getRank()) {
ScoreHand(eStrength.FourOfAKind, CardsInHand.get(eCardNo.FirstCard.getCardNo()).getRank().getRank(), 0, CardsInHand.get(eCardNo.FifthCard.getCardNo())
.getRank().getRank());
}	
	
	
else if (CardsInHand.get(eCardNo.FifthCard.getCardNo()).getRank() == CardsInHand.get(eCardNo.SecondCard.getCardNo()).getRank()
&& CardsInHand.get(eCardNo.FifthCard.getCardNo()).getRank() == CardsInHand.get(eCardNo.ThirdCard.getCardNo()).getRank()
&& CardsInHand.get(eCardNo.FifthCard.getCardNo()).getRank() == CardsInHand.get(eCardNo.FourthCard.getCardNo()).getRank()) {
ScoreHand(eStrength.FourOfAKind, CardsInHand.get(eCardNo.FifthCard.getCardNo()).getRank().getRank(), 0, CardsInHand.get(eCardNo.FirstCard.getCardNo())
.getRank().getRank());
}	
	
	
else if (CardsInHand.get(eCardNo.FirstCard.getCardNo()).getRank() == CardsInHand.get(eCardNo.ThirdCard.getCardNo()).getRank()
&& CardsInHand.get(eCardNo.FourthCard.getCardNo()).getRank() == CardsInHand.get(eCardNo.FifthCard.getCardNo()).getRank()) {
ScoreHand(eStrength.FullHouse, CardsInHand.get(eCardNo.FirstCard.getCardNo()).getRank().getRank(), CardsInHand.get(eCardNo.FourthCard.getCardNo())
.getRank().getRank(), 0);
}
else if (CardsInHand.get(eCardNo.ThirdCard.getCardNo()).getRank() == CardsInHand.get(eCardNo.FifthCard.getCardNo()).getRank()
&& CardsInHand.get(eCardNo.FirstCard.getCardNo()).getRank() == CardsInHand.get(eCardNo.SecondCard.getCardNo()).getRank()) {
ScoreHand(eStrength.FullHouse, CardsInHand.get(eCardNo.ThirdCard.getCardNo()).getRank().getRank(), CardsInHand.get(eCardNo.FirstCard.getCardNo())
.getRank().getRank(), 0);
}	
	
	
else if (Flush) {
ScoreHand(eStrength.Flush, CardsInHand.get(eCardNo.FirstCard.getCardNo()).getRank().getRank(), 0, 0);
}


else if (Straight) {
ScoreHand(eStrength.Straight, CardsInHand.get(eCardNo.FirstCard.getCardNo()).getRank().getRank(), 0, 0);
}


else if (CardsInHand.get(eCardNo.FirstCard.getCardNo()).getRank() == CardsInHand.get(eCardNo.ThirdCard.getCardNo()).getRank()) {
ScoreHand(eStrength.ThreeOfAKind, CardsInHand.get(eCardNo.FirstCard.getCardNo()).getRank().getRank(), 0, CardsInHand.get(eCardNo.FourthCard.getCardNo())
.getRank().getRank());
}

else if (CardsInHand.get(eCardNo.SecondCard.getCardNo()).getRank() == CardsInHand.get(eCardNo.FourthCard.getCardNo()).getRank()) {
ScoreHand(eStrength.ThreeOfAKind, CardsInHand.get(eCardNo.SecondCard.getCardNo()).getRank().getRank(), 0, CardsInHand.get(eCardNo.FifthCard.getCardNo())
.getRank().getRank());
} 

else if (CardsInHand.get(eCardNo.ThirdCard.getCardNo()).getRank() == CardsInHand.get(eCardNo.FifthCard.getCardNo()).getRank()) {
ScoreHand(eStrength.ThreeOfAKind, CardsInHand.get(eCardNo.ThirdCard.getCardNo()).getRank().getRank(), 0, CardsInHand.get(eCardNo.FirstCard.getCardNo())
.getRank().getRank());
}



else if (CardsInHand.get(eCardNo.FirstCard.getCardNo()).getRank() == CardsInHand.get(eCardNo.SecondCard.getCardNo()).getRank()
&& (CardsInHand.get(eCardNo.ThirdCard.getCardNo()).getRank() == CardsInHand.get(eCardNo.FourthCard.getCardNo()).getRank())) {
ScoreHand(eStrength.TwoPair, CardsInHand.get(eCardNo.FirstCard.getCardNo()).getRank().getRank(), CardsInHand.get(eCardNo.ThirdCard.getCardNo())
.getRank().getRank(), CardsInHand.get(eCardNo.FifthCard.getCardNo()).getRank().getRank());
} 

else if (CardsInHand.get(eCardNo.FirstCard.getCardNo()).getRank() == CardsInHand.get(eCardNo.SecondCard.getCardNo()).getRank()
&& (CardsInHand.get(eCardNo.FourthCard.getCardNo()).getRank() == CardsInHand.get(eCardNo.FifthCard.getCardNo()).getRank())) {
ScoreHand(eStrength.TwoPair, CardsInHand.get(eCardNo.FirstCard.getCardNo()).getRank().getRank(), CardsInHand.get(eCardNo.FourthCard.getCardNo())
.getRank().getRank(), CardsInHand.get(eCardNo.ThirdCard.getCardNo()).getRank().getRank());
} 


else if (CardsInHand.get(eCardNo.SecondCard.getCardNo()).getRank() == CardsInHand.get(eCardNo.ThirdCard.getCardNo()).getRank()
&& (CardsInHand.get(eCardNo.FourthCard.getCardNo()).getRank() == CardsInHand.get(eCardNo.FifthCard.getCardNo()).getRank())) {
ScoreHand(eStrength.TwoPair, CardsInHand.get(eCardNo.SecondCard.getCardNo()).getRank().getRank(), CardsInHand.get(eCardNo.FourthCard.getCardNo())
.getRank().getRank(), CardsInHand.get(eCardNo.FirstCard.getCardNo()).getRank().getRank());
}


else if (CardsInHand.get(eCardNo.FirstCard.getCardNo()).getRank() == CardsInHand.get(eCardNo.SecondCard.getCardNo()).getRank()) {
ScoreHand(eStrength.Pair, CardsInHand.get(eCardNo.FirstCard.getCardNo()).getRank().getRank(), 0, CardsInHand.get(eCardNo.ThirdCard.getCardNo())
.getRank().getRank());
} 

else if (CardsInHand.get(eCardNo.SecondCard.getCardNo()).getRank() == CardsInHand.get(eCardNo.ThirdCard.getCardNo()).getRank()) {
ScoreHand(eStrength.Pair, CardsInHand.get(eCardNo.SecondCard.getCardNo()).getRank().getRank(), 0, CardsInHand.get(eCardNo.FirstCard.getCardNo())
.getRank().getRank());
} 

else if (CardsInHand.get(eCardNo.ThirdCard.getCardNo()).getRank() == CardsInHand.get(eCardNo.FourthCard.getCardNo()).getRank()) {
ScoreHand(eStrength.Pair, CardsInHand.get(eCardNo.ThirdCard.getCardNo()).getRank().getRank(), 0, CardsInHand.get(eCardNo.FirstCard.getCardNo())
.getRank().getRank());
} 

else if (CardsInHand.get(eCardNo.FourthCard.getCardNo()).getRank() == CardsInHand.get(eCardNo.FifthCard.getCardNo()).getRank()) {
ScoreHand(eStrength.Pair, CardsInHand.get(eCardNo.FourthCard.getCardNo()).getRank().getRank(), 0, CardsInHand.get(eCardNo.FirstCard.getCardNo())
.getRank().getRank());
}

else {
ScoreHand(eStrength.HighCard, CardsInHand.get(eCardNo.FirstCard.getCardNo()).getRank().getRank(), 0, CardsInHand.get(eCardNo.SecondCard.getCardNo())
.getRank().getRank());
}
}
private void ScoreHand(eStrength hST, int highHand, int lowHand, int Kicker) {
this.Strength = hST.getStrength();
this.highHand = highHand;
this.lowHand = lowHand;
this.Kicker = Kicker;
this.Scored = true;
}






public static Comparator<Hand> hRank = new Comparator<Hand>() {




















}
