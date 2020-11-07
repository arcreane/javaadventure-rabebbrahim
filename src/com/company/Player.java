package com.company;

import java.util.Scanner;

public class Player extends Damages {

    Scanner scan = new Scanner(System.in);
    Weapon weapon = new Weapon();
    Monsters monsters = new Monsters();
    Damages damages = new Damages();
    Barbarian barbarian = new Barbarian();
    Sorcerer sorcerer = new Sorcerer();
    int m_iLifePointPlayer;
    Weapon m_Sword;
    Weapon m_WaterFlask;
    char m_cUserInput;
    boolean isAlive = true;

    Barbarian m_barbarian;
    Sorcerer m_sorcerer;


    public Player() {
        m_iLifePointPlayer = 200;
        m_Sword = new Weapon();
        m_WaterFlask = new Weapon();

    }


    public void playerIsAlive() {
        do {
            while (m_iLifePointPlayer > 0) {
                System.out.println("here you go! let's hit the monster\n" +
                        "if the monster is a Barbarian ,hit with the Sword and press (S)\n" + "" +
                        ", if the monster is a Sorcerer,hit with the Water-Flask and press (W)");
                m_cUserInput = scan.next().charAt(0);
                switch (m_cUserInput) {
                    case 'S' -> {

                        weapon.playerHitting(m_Sword);
                    }
                    case 'W' -> {
                        weapon.playerHitting(m_WaterFlask);
                    }
                    default -> {
                        System.out.println("Error : The monster is hitting you !Press again please!");
                    }
                }
            }

        } while (!isAlive);
        if (m_cUserInput == 'S') {
            if (monsters.equals(m_sorcerer)) {
                System.out.println("Bad Choice!");
                m_iLifePointPlayer -= 2;
            } else {
                System.out.println("Good Choice!");
                damages.MonsterDamages(m_barbarian);

            }
        }
        if (m_cUserInput == 'W') {
            if (monsters.equals(barbarian)) {
                System.out.println("Bad Choice!");
                m_iLifePointPlayer -= 15;
            } else {
                System.out.println("Good Choice!");
                damages.MonsterDamages(m_sorcerer);
            }

        } else {
            System.out.println("Error!try again!");
        }

    }
}









