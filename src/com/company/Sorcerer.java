package com.company;

import java.util.Random;

public class Sorcerer extends Monsters {

    protected int m_PointLifeSor;
    Damages sumLifePointSor, sumLifePointPlayer;
    Random random = new Random();
    Dungeon room = new Dungeon();
    Player player = new Player();
    Damages damage = new Damages();

    public Sorcerer() {
        super();
        int m_iPointLifeSor = random.nextInt(11);
        room = new Dungeon();
        player new Player();
        damage = new Damages();
    }

    boolean isAlive = true;


    public void sorcererAttack() {
        int m_iPointLifeSor;
        while (m_iPointLifeSor > 0) {

            System.out.println("\t# Here is a SORCERER and i have a strike-of-light  !");
            for (Monsters monster : room[]){

                damage.MonsterDamages() = (player.m_iLifePointPlayer) - 2;

                damage.PlayerDamages() = Sorcerer(m_iPointLifeSor) - 2;

            }
        }
            public void sorcererIsDead( int p_iPointLifeSor){
                m_iPointLifeSor = p_iPointLifeSor;

            if (p_iPointLifeSor <= 0) {
                System.out.println("*******congratulation********\n" +
                        "*****The sorcerer is dead****\n " +
                        "*****open the next door******");
            }
        }
    }
}
