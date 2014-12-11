import java.util.ArrayList;
import java.util.Collections;


public class Play {

	public static void main(String[] args) {


for (int games = 0; games <= 2000000; games++) {
			ArrayList<Hand> Hands = new ArrayList<Hand>();
			Deck d = new Deck();


for (int hCnt = 0; hCnt <= 2; hCnt++) {
				Hand h = new Hand(d);
				h.EvaluateHand();
				Hands.add(h);
				}
				Collections.sort(Hands, Hand.hRank);




System.out.print("Hand Strength: " + Hands.get(0).getStrength());
System.out.print(" High Hand: " + Hands.get(0).getHighPairStrength());
System.out.print(" Low Hand: " + Hands.get(0).getLowPairStrength());
System.out.print(" Kicker: " + Hands.get(0).getKicker());

System.out.print(" Hand Strength: "+ Hands.get(1).getStrength());
System.out.print(" High Hand: " + Hands.get(1).getHighPairStrength());
System.out.print(" Low Hand: " + Hands.get(1).getLowPairStrength());
System.out.print(" Kicker: " + Hands.get(1).getKicker());
System.out.print("\n");

}
	}
	
}


























}
