package edu.pucit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Deck {

	private List<Card> cards;
	
	// Default constructor
	public Deck(){
		initialize();
	}

	private void initialize(){
		cards = new ArrayList<>(52);
		for(Suit suit : Suit.values()){
			for(Face face : Face.values()){
				cards.add(new Card(suit, face));
			}
		}
	}

	public void shuffle(){
		Collections.shuffle(cards);
	}
	
	public Card draw(){
		Card card = null;
		if(!cards.isEmpty()){
			Random random = ThreadLocalRandom.current();
			int randomIndex = random.nextInt(cards.size()); 
			card = cards.remove(randomIndex);
		}
		return card;
	}
	
	public String toString(){
		StringBuilder deckStr = new StringBuilder("Cards : "+cards.size());
		deckStr.append("[");
		if(!cards.isEmpty()){
			for(Card card : cards){
				deckStr.append(card);
				deckStr.append(",");
			}
		}
		deckStr.append("]");
		return deckStr.toString();
	}
	
	public int getCardCount(){
		return cards.size();
	}

}
