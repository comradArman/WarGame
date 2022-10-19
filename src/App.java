

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Deck d = new Deck();
		
		d.describeD();
	
		
		
		
		d.shuffle() ;
		
		
		
		
		
		Player B = new Player("B");
		
		Player T = new Player("T");
		
		for(int i = 0; i < 52; i++) {
			
			if (i % 2 == 0) {
				
				B.draw(d);
			
			}else { 
			 
				T.draw(d);
			}
		}
			
		
			
			for (int n = 0; n < 26; n++) {
				Cards p1Card = B.flip();
				Cards p2Card = T.flip();
				

				if (p1Card.getValue() > p2Card.getValue()) {
					B.incrementScore();
					
				} else if (p1Card.getValue() < p2Card.getValue()) {
					T.incrementScore();
					
				}
				
					
				}if(B.getscore() > T.getscore()) {
					System.out.println("Player: " + B.getName() + " WINS!" + " With a score of " + B.getscore());
				}else if(B.getscore() < T.getscore()) {
					System.out.println("Player: " + T.getName() + " WINS!" + " With a score of " + T.getscore());
				
				
			}else {
				System.out.println("DRAW!");
			
				}
				
				B.describe();
				T.describe();
			
				
		}
	}

		
			
		
	
	
	
	
	


