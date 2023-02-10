
public class Cards {

	private static final int Jack = 11;

	private static final int Queen = 12;

	private static final int King = 13;

	private static final int Ace = 14;

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
		
		switch (value) {
		
		case Jack:
			
			System.out.println("Jack " + suite);
			
			break;
			
		case Queen:
			
			System.out.println("Queen " + suite);
			
			break;
			
		case King:
			
			System.out.println("King " + suite);
			
			break;
			
		case Ace:
			
			System.out.println("Ace " + suite);
			
			break;
		
		default:
			
			System.out.println(value+ " " + suite ) ;
		}

		
		
	}

	
		
		
	}

