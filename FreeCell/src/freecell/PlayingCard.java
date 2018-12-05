package freecell;

public class PlayingCard{
	private int value;
	private SUIT suit;
	private boolean visible;
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

	public boolean isVisible() {
		return visible;
	}

	public String getName() {
		return name;
	}
	
	public String getColor() {
		return color;
	}
	
	public String toString() {
		if(visible == false)
			return "Hidden Card";
		else
			return name + " of " + suit;
	}
}