import java.util.Scanner;

public class App {

    private static Scanner kboard = new Scanner( System.in);

    public static void main(String[] args){

        int draw; //If they want to draw a new card or not
        int c1; //Initial Card 1 value
        int c2; //Initial Card 2 vale
        int nc; //Value of new drawn card
        int t; //Final total

        c1 = (int)(Math.random () * ((10 - 1) + 1)) + 1; //Determines value of Card 1
        c2 = (int)(Math.random () * ((10 - 1) + 1)) + 1; // Determines value of card 2
        t = c1 + c2; //Determines initial total
        draw = 0;
        System.out.println("Your initial hand is: Card 1 = " + c1 + " Card 2 = " + c2);
        System.out.println("This means that your intial total is " + t);
        System.out.println("Would you like to draw another card? 1=Y 2=N");
        draw = kboard.nextInt();

        while ((int)draw == 1); //As long as the player keeps pressing 1, this block will loop
        {
            nc = (int)(Math.random () * ((10 - 1) + 1)) + 1; //Generates a new random number
            System.out.println("You drew " + nc);
            t = t + nc; //Calculates new total
            System.out.println("Your new total is " + t);
            System.out.println("Would you like to draw again?");
            draw = kboard.nextInt();
        }
        if(draw == 2){
            if(t == 22);{
                System.out.println("You went bust! House Wins"); //Bust is where player's total exceeds 21
                }
            if(t < 18 || t > 21){
                    System.out.println("House has 18! House Wins");
                }
            if(t > 18 && t < 22){
                System.out.print("Player has " + t + ". Player Wins");    
                }
            if (t == 18){
                System.out.println("Player has 18, House has 18, draw! Push"); //Push means restart, implement at some point
                }
            }
        kboard.close();
        } 
        
    }



