package com.company;

public class Weapon {
    int m_iAxe;
    int m_iStrikeOfLight;
    int m_iWaterFlask;
    int m_iSword;
    public  void monsterHitting(int p_iAxe, int p_iStrikeOfLight){
        m_iAxe = p_iAxe;
        m_iStrikeOfLight = p_iStrikeOfLight;
    }
    public void playerHitting(int p_iSword, int p_iWaterFlask){
        m_iSword=p_iSword;
        m_iWaterFlask=p_iWaterFlask;
    }
}
