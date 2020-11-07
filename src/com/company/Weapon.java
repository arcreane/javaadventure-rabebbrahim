package com.company;

public class Weapon {
    // declaration of weapons of the player an monsters

    Weapon m_Axe, m_StrikeOfLight, m_Sword, m_WaterFlask;

    public Weapon() {
        m_WaterFlask=new Weapon();
        m_Sword=new Weapon();
        m_Axe=new Weapon();
        m_StrikeOfLight=new Weapon();


    }

    // to declare the weapons of the monsters
    public void monsterHitting(Weapon p_Axe, Weapon p_StrikeOfLight) {
        m_Axe = p_Axe;
        m_StrikeOfLight = p_StrikeOfLight;
    }

    // to declare the weapons of the player


    public void playerHitting(Weapon p_Sword , Weapon p_WaterFlask) {
        m_Sword = p_Sword;
        m_WaterFlask = p_WaterFlask;


    }

}
