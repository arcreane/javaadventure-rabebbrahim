package com.company;

import java.util.Random;

public class Monsters {
    int m_iBarbarian;
    int m_iSorcerer;
    int m_iPointLifeBar=60;
    int m_iPointLifeSor=20;

    public int arrayMonsters(int[] p_iBarbarian , int[] p_iSorcerer){
        m_iBarbarian=p_iBarbarian;
        m_iSorcerer=p_iSorcerer;
        return arrayMonsters();
    }

    public void barbarian(){
        System.out.println("\t# Here is a BARBARIAN and i have an AXE ! "); ;

    }
    public void sorcerer(){
        System.out.println("\t# Here is a SORCERER and i have a strike-of-lignt  !");

    }
    public void monsterAttack(){
            if(arrayMonsters()==m_iBarbarian){
                System.out.println("here i m a barbarian, i get an Axe !");

            }

        }
    }



}
