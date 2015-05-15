package com.pablosettecase.binarywarz.binarywarz;

import java.util.Random;

/**
 * Created by Rogelio on 5/7/2015.
 */
public class Deck {
    private Card[] cards;
    private int cardsRemaining;

    public Deck(){
        cardsRemaining = 60;
        cards = new Card[60];
        int cardCounter = 0;
        for(int i = 0 ; i < 4 ; i++){
            for(int j = 0 ; j < 15 ; j++){
                cards[cardCounter] = new Card(j , i);
                cardCounter++;
            }
        }
    }

    /**
     *
     * @return returns a random card from the deck. That spot in the cards array becomes null.
     */
    public Card drawCard(){
        Random randomGenerator = new Random();
        int randomCardNumber = 0;
        boolean successfulDraw = false;
        while (!successfulDraw){
            randomCardNumber = randomGenerator.nextInt(60);
            if(cards[randomCardNumber] != null){
                successfulDraw = true;
            }
        }

        Card drawnCard = cards[randomCardNumber];
        cards[randomCardNumber] = null;
        cardsRemaining--;

        return drawnCard;
    }

    public int getCardsRemaining(){
        return cardsRemaining;
    }
}
