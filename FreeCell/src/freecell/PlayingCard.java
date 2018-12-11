package freecell;

public class PlayingCard{
	private int value;
	private SUIT suit;
	private String name;
	private String color;
	
	public PlayingCard(int value, SUIT suit, String name) {
		this.value = value;
		this.suit = suit;
		this.name = name;
		
		if(suit == SUIT.SPADES || suit == SUIT.CLUBS) {
			this.color = "BLACK";
		}
		else {
			this.color = "RED";
		}
	}

	public int getValue() {
		return value;
	}

	public SUIT getSuit() {
		return suit;
	}

	public String getName() {
		return name;
	}
	
	public String getColor() {
		return color;
	}
	
	public String toString() {
		return name + " of " + suit;
	}
}