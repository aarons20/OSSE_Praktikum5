package de.hfu;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Scanner scan = new Scanner(System.in);
    	System.out.println("Bitte geben Sie einen Text ein:");
    	String eingabe = scan.nextLine();
        System.out.println( "Ihre Eingabe: " +  eingabe.toUpperCase());
    }
}
