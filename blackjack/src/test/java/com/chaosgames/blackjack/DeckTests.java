package com.chaosgames.blackjack;


import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

/**
 * Created by jrabideaux on 7/30/16.
 */

public class DeckTests {

    Deck deck = new Deck();

    @Test
    public void newDeckSize(){

        HashMap<String, Integer> cardDeck = deck.createNewDeck();
        int deckSize = cardDeck.size();

        Assert.assertTrue("The new generated deck is not the correct size", deckSize == 52);
    }

    @Test
    public void newDeckCardValues(){
        HashMap<String, Integer> cardDeck = deck.createNewDeck();
        int twoOfHearts = cardDeck.get("2H");
        int fourOfSpades = cardDeck.get("4S");
        int kingOfDiamonds = cardDeck.get("KD");
        int jackOfClubs = cardDeck.get("JC");

        Assert.assertTrue("The incorrect value appears for the 2H", twoOfHearts == 2);
        Assert.assertTrue("The incorrect value appears for the 4S", fourOfSpades == 4);
        Assert.assertTrue("The incorrect value appears for the KD", kingOfDiamonds == 10);
        Assert.assertTrue("The incorrect value appears for the JC", jackOfClubs == 10);
    }
}

