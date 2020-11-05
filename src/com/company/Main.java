package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Random rand=new Random();
        boolean keepPlaying= true;
        Scanner sc= new Scanner(System.in);
        while(keepPlaying){
            System.out.println("--------Game Menu---------");
            System.out.println("Choose your forward optien:");
            System.out.println("(1)-Play Game \n"+"(2)-Replay Game \n"+"(3)-Score Game \n"+"(3)-Quit Game");
            System.out.println("---------------------------");}
            userInput = sc.nextInt();
        switch(userInput){
            case 1->{donjon.play()};
            case 2->{keepPlaying= false};
            default->{"Error: try again !"}
        }
        public static int getUserInput(){
            Scanner sc = new Scanner(System.in);
            int userInput=0;
        try{
            userInput= sc.nextInt();
        }catch (Exception e){
            System.out.println("désolé entree erronée, essai une autre fois!");
        }sc.nextLine();
        return userInput;
    }
    }
}
