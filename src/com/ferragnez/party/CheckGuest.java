package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {
	  public static void main(String[] args) {
	        
	        String[] guests = {"Fluff",  "Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};
	        
	        Scanner input = new Scanner(System.in);
	        System.out.print("Inserisci il tuo nome: ");
	        String name = input.nextLine();
	        
	        boolean isGuest = false;
	        
	        for(String guest : guests) {
	            if(guest.equals(name)) {
	                isGuest = true;
	                System.out.println("Benvenuto alla festa dei Ferragnez!");
	                break;
	            }
	        }
	        
	        if(!isGuest)
	            System.out.println("Vade Retro, il tuo nome non è sulla lista degli invitati.");
	        
	    }
}
