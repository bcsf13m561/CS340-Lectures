package edu.pucit;

public class Card {
	
	private Suit suit;
	private Face face;
	
	// Default constructor
	public Card(){
		
	}
	
	// overloading
	public Card(Suit suit, Face face){
		this.face = face;
		this.suit = suit;
	}
	
	
	
	public Suit getSuit() {
		return suit;
	}

	public void setSuit(Suit suit) {
		this.suit = suit;
	}

	public Face getFace() {
		return face;
	}

	public void setFace(Face face) {
		this.face = face;
	}

	@Override
	public String toString(){
		return "( "+face +" of "+suit+" )";
	}

}
