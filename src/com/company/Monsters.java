package com.company;

import java.util.Random;

public class Monsters extends Damages {

    Random random = new Random();
    String m_sBarbarian="Barbarian";
    String m_sSorcerer="Sorcerer";
    String[] myStrings={"Barbarian","Sorcerer"};
    int monster = random.nextInt(myStrings.length);




    public int monstersToParse (String p_sBarbarian , String p_sSorcerer){
        m_sBarbarian = Integer.parseInt(p_sBarbarian);
        m_sSorcerer=Integer.parseInt(p_sSorcerer);
        return monstersToParse();

    }





}
