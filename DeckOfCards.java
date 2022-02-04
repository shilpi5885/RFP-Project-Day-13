package com.bridgelabz.demo;

public class DeckOfCards {
	  public static void main(String[] args) {
	    String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
	    String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
	    int[][] player = new int[4][9];
	    
	    // Initialize cards
	    int n = suits.length * ranks.length;
	    String[] deck = new String[n];
	    for (int i = 0; i < ranks.length; i++) {
	        for (int j = 0; j < suits.length; j++) {
	            deck[suits.length*i + j] = ranks[i] + " of " + suits[j];
	        }
	    }
	    
	    // Shuffle the cards
	    for (int i = 0; i < n; i++) {
	        int r = i + (int) (Math.random() * (n-i));
	        String temp = deck[r];
	        deck[r] = deck[i];
	        deck[i] = temp;
	    }
	    
	    //Display deck after distributing cards to players
	    for (int i = 0; i < 4; i++) {
	    	System.out.println(deck[i+1] + "**");
	    	for (int j = 0; j < 9; j++) {
	    		System.out.println(deck[i + j * 4]);
	        }
	    }
	  }
	}
