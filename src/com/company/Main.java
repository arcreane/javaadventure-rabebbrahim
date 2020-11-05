package com.company;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Random rand=new Random();
        Player player = new Player();
        PlayGame playGame = new PlayGame();

        boolean keepPlaying= true;
        Scanner sc= new Scanner(System.in);
        while(keepPlaying){
            System.out.println("--------Game Menu---------");
            System.out.println("Choose your forward optien:");
            System.out.println("(1)-Play Game \n"+"(2)-Replay Game \n"+"(3)-Score Game \n"+"(3)-Quit Game");
            System.out.println("---------------------------");}
            int userInput = sc.nextInt();
        switch(userInput){
            case 1->{PlayGame.startGame()};
            case 2->{keepPlaying=true};
            case 3-> {PlayGame.gameOver() } ;
            default->{"Error: try again !"};
        }
        public static int getPlayerInput(){

            int userInput=0;
        try{
            userInput= sc.nextInt();
        }catch (Exception e){
            System.out.println("désolé entree erronée, essai une autre fois!");
        }sc.nextLine();
        return userInput;
    }

        ArrayList<Monsters> monsters = new ArrayList<>();

    PlayGame.start.Game();
        Dungeon.enterRoom(int[5]);
        monsters.add(new Barbarian().barbarianAttack());
        monsters.add(new Sorcerer().sorcererAttack());
        player.isAlive();
        playGame.gameOver();






    }
}
