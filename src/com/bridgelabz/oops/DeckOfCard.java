package com.bridgelabz.oops;

/******************************************************************************
 * 
 * 9. Write a Program DeckOfCards.java, to initialize deck of cards having suit
 * ("Clubs", "Diamonds", "Hearts", "Spades") & Rank ("2", "3", "4", "5", "6",
 * "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"). Shuffle the cards using
 * Random method and then distribute 9 Cards to 4 Players and Print the Cards
 * the received by the 4 Players using 2D Array…
 * 
 * @author : Ritesh Yadav
 * @version : 1.0
 * @since : 03-12-2019
 *
 ******************************************************************************/
public class DeckOfCard {
	public static void main(String[] args) {

		String[] Suits = { "Clubs", "Diamonds", "Hearts", "Spades" };
		String[] Ranks = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };
		int number = Suits.length * Ranks.length;
		String[] deck = new String[number];
		for (int count = 0; count < Ranks.length; count++) {
			for (int count1 = 0; count1 < Suits.length; count1++) {
				deck[Suits.length * count + count1] = Ranks[count] + " " + Suits[count1];
			}
		}
		for (int count = 0; count < number; count++) {
			int result = count + (int) (Math.random() * (number - count));
			String temp = deck[result];
			deck[result] = deck[count];
			deck[count] = temp;
		}
		System.out.println("Total number of deck of cards are " + deck.length);
		for (int count = 0; count < 4; count++) {
			System.out.println("----- Person " + (count + 1) + " -----");
			for (int count1 = 0; count1 < 9; count1++) {
				System.out.println(deck[count + count1 * 4] + " (Card " + (count + count1 * 4) + ")");
			}
		}
	}
}