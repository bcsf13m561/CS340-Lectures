package edu.pucit;

public class Game {

	public static void main(String[] args) {
		Deck deck = new Deck();
		System.out.println(deck);
		deck.draw();
		deck.draw();
		deck.shuffle();
		System.out.println(deck);
	}
}
