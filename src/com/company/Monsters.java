package com.company;

import java.util.Random;


public class Monsters extends Damages {
    Random random;
    String m_Monsters;
    String m_Barbarian = "Barbarian", m_Sorcerer = "Sorcerer";

    public Monsters() {
        random = new Random();
        String[] monsters = new String[]{"Sorcerer", "Barbarian"};
        String m_Monster = monsters[random.nextInt(monsters.length)];

        if (m_Monsters.equals(m_Barbarian)) {
            System.out.println("here is a Barbarian!");
        } else {
            System.out.println("here is a Sorcerer!");


        }


    }
}









