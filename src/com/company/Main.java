package com.company;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Player hero = new Player();
        Dungeon dungeon = new Dungeon();
        PlayGame play =new PlayGame();

        boolean keepPlaying = true;
        Scanner sc = new Scanner(System.in);
        while (keepPlaying) {
            System.out.println("--------Game Menu---------");
            System.out.println("Choose your forward option:");
            System.out.println("(1)-Play Game \n" + "(2)-Replay Game \n" + "(3)-Score Game \n" + "(4)-Quit Game");
            System.out.println("---------------------------");
        }
        int userInput = sc.nextInt();
        switch (userInput) {
            case 1 -> {
                play.startGame(hero, room);
            }
            case 2 -> {
                keepPlaying = true;
            }
            case 3 -> {
                play.gameOver(hero);
            }
            case 4 -> {
                keepPlaying = false;
            }
            default -> {
                System.out.println("Error: try again !");
            }
        }
        dungeon.enterDungeon(hero);
        play.startGame(hero);
        play.gameOver(hero);



    }
}
