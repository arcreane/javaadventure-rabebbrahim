package com.company;

import java.util.Scanner;

;

public class Player {
    Scanner scan = new Scanner(System.in);
    int iplayer;
    static int m_iLifePointPlayer=200;
    boolean isAlive=true;
    Weapon weapon = new Weapon();
   public int isAlive(){
        while(m_iLifePointPlayer>0){
            System.out.println("here you go! let's hit the monster\n"+
                    "if the monster is a Barbarian ,hit with the Sword and press (S)\n"+"" +
                    ", if the monster is a Sorcerer,hit with the Water-Flask and press (W)");
            char m_cUserInput=scan.next().charAt(0);
            switch(m_cUserInput){
                case 'S'->{weapon.m_sWeaponPlayerBar};
                case 'W'->{weapon.m_sWeaponPlayerSor};
                default -> {
                    System.out.println("Error : The monster is hitting you !Press again please!");
                }
            }
            }

        }

    }



}
