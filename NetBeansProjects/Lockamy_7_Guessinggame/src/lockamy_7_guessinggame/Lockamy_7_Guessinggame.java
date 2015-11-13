/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lockamy_7_guessinggame;

import java.util.Random;
import java.util.Scanner;
import static lockamy_7_guessinggame.Lockamy_7_Guessinggame.playthegame;


public class Lockamy_7_Guessinggame {
    
     
     
static int nextInt;     
static int magicnumber;
static int usergame;
static String username;
static Random GarrettLockamyantsdRandom;
static Random garrett = new Random();
static boolean playagain;
static boolean stopplay = false;
    private static int userguess;
 

public static void main(String[] args) {
    Scanner name = new Scanner(System.in);    
    Scanner guess = new Scanner(System.in);
    System.out.println("Hello would you like to play a game?");
    System.out.println("what is your name?");
    Scanner userinputname = new Scanner(System.in);
    username = userinputname.nextLine();
    System.out.println("Hello " + username + " Let's play a game");
    
    while (playagain){
    playthegame();
    }
    
    
}
        static void playthegame(){
        Scanner userinputnubers = new Scanner(System.in) ;
        System.out.println("Please pick a number");
        userguess = userinputnumbers.nextInt();
        if (magicnumber == userguess){
            System.out.println (" You win!!!");
            boolean playagain = false;
        }
        }
} 		
         
