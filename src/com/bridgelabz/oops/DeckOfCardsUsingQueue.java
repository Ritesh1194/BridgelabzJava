package com.bridgelabz.oops;

/******************************************************************************
 * 
 * 10. Extend the above program to create a Player Object having Deck of Cards, 
 * and having ability to Sort by Rank and maintain the cards in a Queue implemented using Linked List. 
 * Do not use any Collection Library. 
	further the Player are also arranged in Queue. 
	Finally Print the Player and the Cards received by each Player.
 * 
 * @author : Ritesh Yadav
 * @version : 1.0
 * @since : 03-12-2019
 *
 ******************************************************************************/
import utility.Oops;
import utility.Queue;

public class DeckOfCardsUsingQueue {
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
		Queue mainQueue = Oops.deckQueueStore(deck);
		Oops.displayDeck(mainQueue);
	}
}