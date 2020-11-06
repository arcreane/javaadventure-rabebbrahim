package com.company;

import java.util.Scanner;

;

public class Player {
    Scanner scan = new Scanner(System.in);
    int iplayer;
    static int m_iLifePointPlayer=200;

    Weapon weapon = new Weapon();
    Monsters monsters= new Monsters();
    Damages damages= new Damages();
    Barbarian barbarian=new Barbarian();
    Sorcerer sorcerer = new Sorcerer();
    char  m_cUserInput;
    boolean isAlive=true;
   public int playerIsAlive(){
       do{
        while(m_iLifePointPlayer>0){
            System.out.println("here you go! let's hit the monster\n"+
                    "if the monster is a Barbarian ,hit with the Sword and press (S)\n"+"" +
                    ", if the monster is a Sorcerer,hit with the Water-Flask and press (W)");
             m_cUserInput=scan.next().charAt(0);
            switch(m_cUserInput){
                case 'S'->{weapon.m_sWeaponPlayerBar};
                case 'W'->{weapon.m_sWeaponPlayerSor};
                default -> {
                    System.out.println("Error : The monster is hitting you !Press again please!");
                }
            }
            }

        }while (!isAlive);
       if(m_cUserInput=='S'){
           if(monsters.equals(sorcerer){
               System.out.println("Bad Choise!");
               m_iLifePointPlayer-=2;
               else{
                   System.out.println("Good Choice!");
                   damages.MonsterDamages(barbarian);

               }
               else if(m_cUserInput=='W'){
                   if(monsters.equals(barbarian)){
                       System.out.println("Bad Choice!");
                       m_iLifePointPlayer-=15;
                       else{
                           System.out.println("Good Choice!");
                           damages.MonsterDamages(sorcerer);
                       }

                   }else {
                       System.out.println("Error!try again!");
                   }
               }

           }
       }

    }



}
