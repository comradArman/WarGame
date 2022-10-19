import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

	List<Cards> deckList = new ArrayList<>();

	public Deck() {
		for (int i = 2; i < 15; i++) {
			deckList.add(new Cards(i, " of diamonds"));
			deckList.add(new Cards(i, " of hearts"));
			deckList.add(new Cards(i, " of spades"));
			deckList.add(new Cards(i, " of clubs"));
		}
	}
		public void describeD() {
			for(Cards card : deckList) {
				//System.out.println(card.getSuite());
				//card.describe();
			}
		}
	
	
	public List<Cards> getCards(){
		
		return deckList;
	}

	public void setCards(List<Cards> deckList) {
		
		this.deckList = deckList;

	}

	

	private List<Cards> createSuites(int value, String suite) {

	
		List<Cards> suiteList = new ArrayList<Cards>();

		for (int i = 0; i < 4; i++) {
			Cards card = new Cards();
			card.setValue(value);
			if (i == 0) {
				card.setSuite(suite + " of clubs");
			} else if (i == 1) {
				card.setSuite(suite + " of hearts");
			} else if (i == 2) {
				card.setSuite(suite + " of spades");
			} else {
				card.setSuite(suite + " of diamonds");
			}

}
		
		return suiteList;
			
			
		}
			
	public void shuffle() {
		
		Collections.shuffle(this.deckList);
		
	}
	
	public Cards draw() {
		
		//Cards selectedCard = this.deckList.get(deckList.size() - 1);
		Cards selectedCard = this.deckList.get(0);
		this.deckList.remove(selectedCard);
		
		return selectedCard;
	}
	
	public String toString() {
		
		return this.deckList.toString();
		
	}
	
	public int size() {
		
		return this.deckList.size();
		
	}
	
		
	
	
	}
