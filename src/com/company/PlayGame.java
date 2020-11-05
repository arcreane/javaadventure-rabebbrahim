package com.company;

import java.util.Random;

public class PlayGame {
    //the beginning of the game
 public void startGame(){
     System.out.println(" ****************  Welcome in the Dungeon Adventure ****************");


 }

 // the end of the game
 public void gameOver(){
     if ( m_iPointLifePlayer.Player() ==0){
         System.out.println(" *************************** LOSER ************************************");
         System.out.println("*************************** GAME OVER ************************************");

 }
     else {
         System.out.println("********************** CONGRATULATION *************************\n"+
                           "********************* YOU WIN THE TREASURE *********************\n"+
                            "************************** GAME OVER **************************");



     }
     main.keepPlaying= false;



 }
