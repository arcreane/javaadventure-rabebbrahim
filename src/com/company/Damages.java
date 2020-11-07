package com.company;

public class Damages {
    int m_iLifePointPlayerLost;
    int m_iLifePointMonsterLost;

    public Damages() {
        m_iLifePointMonsterLost = 0;
        m_iLifePointPlayerLost = 0;

    }

    // damages of the player compared by his fist previous life's point

    protected int PlayerDamages(int p_iLifePointPlayerLost, int sumLifePointPlayer) {
        m_iLifePointPlayerLost = p_iLifePointPlayerLost;
        sumLifePointPlayer -= m_iLifePointPlayerLost;
        return sumLifePointPlayer;

    }
    //damages of the monster compared by his previous life's point

    protected int MonsterDamages(int p_iLifePointMonsterLost, int sumLifePointMonster) {
        m_iLifePointMonsterLost = p_iLifePointMonsterLost;
        sumLifePointMonster -= m_iLifePointMonsterLost;
        return sumLifePointMonster;
    }



}
