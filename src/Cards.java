
public class Cards {

	private int value;

	private String suite;
	
	
	public Cards() {
		
	}
	
	public Cards(int value, String suite) {
		
		
		this.setSuite(suite);

		this.setValue(value);

	
	}

	public int getValue() {
		return value;

	}

	public void setValue(int value) {
		this.value = value;

	}

	public String getSuite() {
		return this.suite;

	}
	
	
	
	

	public void setSuite(String suite) {
		this.suite = suite;
		
	}

	public void describe() {
		System.out.println("Card name: " + value + " " + suite ) ;
		
	}

	
		// TODO Auto-generated method stub
		
	}

