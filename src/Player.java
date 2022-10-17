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
	
	
	
	
	
	public void describe() {
		System.out.println("Player: " + this.name);
		System.out.println("Score: " + this.score);
		System.out.println("has hand: ");
		System.out.println(hand.toString());
		
	}	
	public void draw(Deck d) {
			
			this.hand.add(d.draw());
	
	
	}

	public Cards flip() {
	
		Cards selectedCard = hand.get(0);
		
		hand.remove(0);
		
		return selectedCard;
		
	}
	
	
	
	
	
	public void incrementScore() {
		
		this.score++;
	}
	
	public int handSize() {
		
		return this.hand.size();
		
	}
	
	public String getName() {
		
		return this.name;
		
	}
	
			
	}
	
