package com.company;

public class Weapon {
    String m_sWeaponBar="Axe";
    String m_sWeaponSor= "StrikeOfLight";
    String m_sWeaponPlayerSor="WaterFlask";
    String m_sWeaponPlayerBar="Sword";
    // to declare the weapons of the monsters
    public  void monsterHitting(int p_iAxe, int p_iStrikeOfLight){
        m_iAxe = p_iAxe;
        m_iStrikeOfLight = p_iStrikeOfLight;
    }
    // to declare the weapons of the player
    public void playerHitting(int p_iSword, int p_iWaterFlask){
        m_iSword=p_iSword;
        m_iWaterFlask=p_iWaterFlask;
    }
}
