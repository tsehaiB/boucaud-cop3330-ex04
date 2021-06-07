/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Tsehai Boucaud
 */
package base;
import java.util.Scanner;
public class App {
    Scanner inp = new Scanner(System.in);
    public static void main(String[] args){
        App myApp = new App();
        String noun = myApp.readInA("noun");
        String verb = myApp.readInA("verb");
        String adjective = myApp.readInAn("adjective");
        String adverb = myApp.readInAn("adverb");
        System.out.println(myApp.createOut(noun, verb, adjective, adverb));
    }private String readInA(String word){
        System.out.print("Enter a " + word + ": ");
        return inp.nextLine();
    }
    private String readInAn(String word){
        System.out.print("Enter an " + word + ": ");
        return inp.nextLine();
    }
    private String createOut(String noun, String verb, String adjective, String adverb){
        return "Do you " + verb + " your " + adjective + " " + noun + " " + adverb + "? That's hilarious!";
    }
}
