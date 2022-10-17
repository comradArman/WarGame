

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Deck d = new Deck();
		
		
	
		for(Cards card : d.deckList) {
			card.describe();
		}
		
		d.shuffle() ;
		
		
		
		
		
		Player B = new Player("B");
		
		Player T = new Player("T");
		
		for(int i = 0; i < 26; i++) {
			
			if (i % 2 == 0) {
				
				B.draw(d);
				
			} else { 
				
				T.draw(d);
				
			
			}
			
			int p1Val = 0;
			int p2Val = 0;
			int initialHandSize = B.handSize();

			
			
			
			B.describe();
			T.describe();
			
			for (int n = 0; n < initialHandSize; n++) {

				p1Val = B.flip().getValue();
				p2Val = T.flip().getValue();

				if (p1Val == p2Val) {
					// do nothing
					continue;
				} else if (p1Val > p2Val) {
					B.incrementScore();
				} else if (p2Val > p1Val) {
					T.incrementScore();
				}
				
			}
		}
	}
}
			
			
		
	
	
	
	
	


