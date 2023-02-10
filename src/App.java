

public class App {

	public static void main(String[] args) {
		
		
		Deck d = new Deck();
		
		d.describeD();
	
		
		
		
		d.shuffle() ;
		
		
		
	

		
		Player B = new Player("Biden");
		
		Player T = new Player("Trump");
		
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
					B.describe(p1Card);
					T.describe(p2Card);
					B.incrementScore();
					String biden = " \"Listen folks we are taking this country back\"";
					System.out.println("\nBiden wins this Round\n" +  biden);
					System.out.println("\n");
					System.out.println("\n");
				} else if (p1Card.getValue() < p2Card.getValue()) {
					B.describe(p1Card);
					T.describe(p2Card);
					T.incrementScore();
					String trump = " \"My card was the biggest card anybody has ever seen!\"";
					System.out.println("\nTrump wins this round\n" + trump );
					System.out.println("\n");
					System.out.println("\n");
				}
				
					
				}if(B.getscore() > T.getscore()) {
					
					System.out.println("Kamala Harris" + " \"We did it Joe\"" + "\nBiden had " + B.getscore() );
					
				}else if(B.getscore() < T.getscore()) {
					
					System.out.println(" \"I won by the most points anybody has won with in the history of the world\"" + "\nTrump won with " + T.getscore());
				
				
			}else {
				System.out.println("DRAW!");
			
				}
				
			
			
				
		}
	}

		
			
		
	
	
	
	
	


