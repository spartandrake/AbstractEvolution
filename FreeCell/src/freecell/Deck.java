package freecell;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Deck {
	private static ArrayList<PlayingCard> cards = new ArrayList<PlayingCard>(52);
	
	private static PlayingCard c1 = new PlayingCard(1, SUIT.DIAMONDS, "A\u2666");
	private static PlayingCard c2 = new PlayingCard(2, SUIT.DIAMONDS, "2\u2666");
	private static PlayingCard c3 = new PlayingCard(3, SUIT.DIAMONDS, "3\u2666");
	private static PlayingCard c4 = new PlayingCard(4, SUIT.DIAMONDS, "4\u2666");
	private static PlayingCard c5 = new PlayingCard(5, SUIT.DIAMONDS, "5\u2666");
	private static PlayingCard c6 = new PlayingCard(6, SUIT.DIAMONDS, "6\u2666");
	private static PlayingCard c7 = new PlayingCard(7, SUIT.DIAMONDS, "7\u2666");
	private static PlayingCard c8 = new PlayingCard(8, SUIT.DIAMONDS, "8\u2666");
	private static PlayingCard c9 = new PlayingCard(9, SUIT.DIAMONDS, "9\u2666");
	private static PlayingCard c10 = new PlayingCard(10, SUIT.DIAMONDS, "10\u2666");
	private static PlayingCard c11 = new PlayingCard(11, SUIT.DIAMONDS, "J\u2666");
	private static PlayingCard c12 = new PlayingCard(12, SUIT.DIAMONDS, "Q\u2666");
	private static PlayingCard c13 = new PlayingCard(13, SUIT.DIAMONDS, "K\u2666");
	
	private static PlayingCard c14 = new PlayingCard(1, SUIT.HEARTS, "A\u2764");
	private static PlayingCard c15 = new PlayingCard(2, SUIT.HEARTS, "2\u2764");
	private static PlayingCard c16 = new PlayingCard(3, SUIT.HEARTS, "3\u2764");
	private static PlayingCard c17 = new PlayingCard(4, SUIT.HEARTS, "4\u2764");
	private static PlayingCard c18 = new PlayingCard(5, SUIT.HEARTS, "5\u2764");
	private static PlayingCard c19 = new PlayingCard(6, SUIT.HEARTS, "6\u2764");
	private static PlayingCard c20 = new PlayingCard(7, SUIT.HEARTS, "7\u2764");
	private static PlayingCard c21 = new PlayingCard(8, SUIT.HEARTS, "8\u2764");
	private static PlayingCard c22 = new PlayingCard(9, SUIT.HEARTS, "9\u2764");
	private static PlayingCard c23 = new PlayingCard(10, SUIT.HEARTS, "10\u2764");
	private static PlayingCard c24 = new PlayingCard(11, SUIT.HEARTS, "J\u2764");
	private static PlayingCard c25 = new PlayingCard(12, SUIT.HEARTS, "Q\u2764");
	private static PlayingCard c26 = new PlayingCard(13, SUIT.HEARTS, "K\u2764");
	
	private static PlayingCard c27 = new PlayingCard(1, SUIT.CLUBS, "A\u2663");
	private static PlayingCard c28 = new PlayingCard(2, SUIT.CLUBS, "2\u2663");
	private static PlayingCard c29 = new PlayingCard(3, SUIT.CLUBS, "3\u2663");
	private static PlayingCard c30 = new PlayingCard(4, SUIT.CLUBS, "4\u2663");
	private static PlayingCard c31 = new PlayingCard(5, SUIT.CLUBS, "5\u2663");
	private static PlayingCard c32 = new PlayingCard(6, SUIT.CLUBS, "6\u2663");
	private static PlayingCard c33 = new PlayingCard(7, SUIT.CLUBS, "7\u2663");
	private static PlayingCard c34 = new PlayingCard(8, SUIT.CLUBS, "8\u2663");
	private static PlayingCard c35 = new PlayingCard(9, SUIT.CLUBS, "9\u2663");
	private static PlayingCard c36 = new PlayingCard(10, SUIT.CLUBS, "10\u2663");
	private static PlayingCard c37 = new PlayingCard(11, SUIT.CLUBS, "J\u2663");
	private static PlayingCard c38 = new PlayingCard(12, SUIT.CLUBS, "Q\u2663");
	private static PlayingCard c39 = new PlayingCard(13, SUIT.CLUBS, "K\u2663");
	
	private static PlayingCard c40 = new PlayingCard(1, SUIT.SPADES, "A\u2660");
	private static PlayingCard c41 = new PlayingCard(2, SUIT.SPADES, "2\u2660");
	private static PlayingCard c42 = new PlayingCard(3, SUIT.SPADES, "3\u2660"); 
	private static PlayingCard c43 = new PlayingCard(4, SUIT.SPADES, "4\u2660");
	private static PlayingCard c44 = new PlayingCard(5, SUIT.SPADES, "5\u2660");
	private static PlayingCard c45 = new PlayingCard(6, SUIT.SPADES, "6\u2660");
	private static PlayingCard c46 = new PlayingCard(7, SUIT.SPADES, "7\u2660");
	private static PlayingCard c47 = new PlayingCard(8, SUIT.SPADES, "8\u2660");
	private static PlayingCard c48 = new PlayingCard(9, SUIT.SPADES, "9\u2660");
	private static PlayingCard c49 = new PlayingCard(10, SUIT.SPADES, "10\u2660");
	private static PlayingCard c50 = new PlayingCard(11, SUIT.SPADES, "J\u2660");
	private static PlayingCard c51 = new PlayingCard(12, SUIT.SPADES, "Q\u2660");
	private static PlayingCard c52 = new PlayingCard(13, SUIT.SPADES, "K\u2660");
	
	public Deck() {
		cards.add(c1);
		cards.add(c2);
		cards.add(c3);
		cards.add(c4);
		cards.add(c5);
		cards.add(c6);
		cards.add(c7);
		cards.add(c8);
		cards.add(c9);
		cards.add(c10);
		cards.add(c11);
		cards.add(c12);
		cards.add(c13);
		cards.add(c14);
		cards.add(c15);
		cards.add(c16);
		cards.add(c16);
		cards.add(c17);
		cards.add(c18);
		cards.add(c19);
		cards.add(c20);
		cards.add(c21);
		cards.add(c22);
		cards.add(c23);
		cards.add(c24);
		cards.add(c25);
		cards.add(c26);
		cards.add(c27);
		cards.add(c28);
		cards.add(c29);
		cards.add(c30);
		cards.add(c31);
		cards.add(c32);
		cards.add(c33);
		cards.add(c34);
		cards.add(c35);
		cards.add(c36);
		cards.add(c37);
		cards.add(c38);
		cards.add(c39);
		cards.add(c40);
		cards.add(c41);
		cards.add(c42);
		cards.add(c43);
		cards.add(c44);
		cards.add(c45);
		cards.add(c46);
		cards.add(c47);
		cards.add(c48);
		cards.add(c49);
		cards.add(c50);
		cards.add(c51);
		cards.add(c52);
		//shuffle();
	}
	
	public void shuffle(long seed) {
		Collections.shuffle(cards, new Random(seed));
	}
	
	public PlayingCard deal() {
		PlayingCard returnCard = cards.remove(0);
		return returnCard;
	}
	
	public String toString() {
		return "" + cards;
	}
}