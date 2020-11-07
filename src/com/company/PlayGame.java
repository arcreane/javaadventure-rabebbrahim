package com.company;

import java.util.Random;

public class PlayGame {
    Player player;
    Dungeon room;

    public PlayGame(){
        hero=new Player();
        room=new Dungeon();

    }


    //the beginning of the game
    public static void startGame(Player player, Dungeon room) {
        System.out.println(" ****************  Welcome in the Dungeon Adventure ****************");
        room.enterDungeon(player);

    }

    // the end of the game
    public static void gameOver(Player player) {
        if (player.m_iLifePointPlayer == 0) {
            System.out.println(" *************************** LOSER ************************************");
            System.out.println("*************************** GAME OVER ************************************");


        } else {
            System.out.println("********************** CONGRATULATION *************************\n" +
                    "********************* YOU WIN THE TREASURE *********************\n" +
                    "************************** GAME OVER **************************");


        }


    }
}
