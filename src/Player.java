import java.util.ArrayList;
import java.util.List;



public class Player {
	
	private List<Cards> hand = new ArrayList<>();
	
	private int score;
	
	private String name;
	
	
	Player(String name){
		
		this.name = name;
		
		this.score = 0;
		
	}
	
	public int getscore() {
		
		return this.score;
	}
	
	
	
	
	
	public void describe(Cards card) {
		
		System.out.println("\nPlayer: " + this.name);
		
		System.out.println("Score: " + this.score);
		
			card.describe();
		}
		
	public void draw(Deck d) {
			
			this.hand.add(d.draw());
	
	
	}

	public Cards flip() {
	
		Cards selectedCard = hand.get(0);
		
		hand.remove(0);
		
		return selectedCard;
		
	}
	
	
	
	
	
	public int incrementScore() {
		
		return this.score++;
	}
	
	public int handSize() {
		
		return this.hand.size();
		
	}
	
	public String getName() {
		
		return this.name;
		
	}
	
			
	}
	

