package com.chaosgames.blackjack;

import java.util.HashMap;
import java.util.Hashtable;

/**
 * Created by jrabideaux on 7/30/16.
 */
public class Deck {

    /**
     * Creates a new deck
     * @author - Josh Rabideaux
     * @param - none
     * @return - HashMap<String, Integer>
     */

    public HashMap<String, Integer> createNewDeck(){

        HashMap<String, Integer> newDeck = new HashMap<String, Integer>();
        newDeck.put("AS", 0);
        newDeck.put("2S", 2);
        newDeck.put("3S", 3);
        newDeck.put("4S", 4);
        newDeck.put("5S", 5);
        newDeck.put("6S", 6);
        newDeck.put("7S", 7);
        newDeck.put("8S", 8);
        newDeck.put("9S", 9);
        newDeck.put("10S", 10);
        newDeck.put("JS", 10);
        newDeck.put("QS", 10);
        newDeck.put("KS", 10);
        newDeck.put("AC", 1);
        newDeck.put("2C", 2);
        newDeck.put("3C", 3);
        newDeck.put("4C", 4);
        newDeck.put("5C", 5);
        newDeck.put("6C", 6);
        newDeck.put("7C", 7);
        newDeck.put("8C", 8);
        newDeck.put("9C", 9);
        newDeck.put("10C", 10);
        newDeck.put("JC", 10);
        newDeck.put("QC", 10);
        newDeck.put("KC", 10);
        newDeck.put("AD", 1);
        newDeck.put("2D", 2);
        newDeck.put("3D", 3);
        newDeck.put("4D", 4);
        newDeck.put("5D", 5);
        newDeck.put("6D", 6);
        newDeck.put("7D", 7);
        newDeck.put("8D", 8);
        newDeck.put("9D", 9);
        newDeck.put("10D",10);
        newDeck.put("JD", 10);
        newDeck.put("QD", 10);
        newDeck.put("KD", 10);
        newDeck.put("AH", 1);
        newDeck.put("2H", 2);
        newDeck.put("3H", 3);
        newDeck.put("4H", 4);
        newDeck.put("5H", 5);
        newDeck.put("6H", 6);
        newDeck.put("7H", 7);
        newDeck.put("8H", 8);
        newDeck.put("9H", 9);
        newDeck.put("10H",10);
        newDeck.put("JH", 10);
        newDeck.put("QH", 10);
        newDeck.put("KH", 10);

        return newDeck;

    }
}
