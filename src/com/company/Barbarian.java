package com.company;

import java.util.Random;

public class Barbarian extends Monsters {

    protected int m_iPointLifeBar;
    Damages sumLifePointMonster, sumLifePointPlayer;
    boolean isAlive = true;

    Dungeon room;
    Player player;
    Damages damage;

    public Barbarian() {

        super();
        m_iPointLifeBar = random.nextInt(31);
        room = new Room();
    }


    void barbarianAttack() {
        while (m_iPointLifeBar > 0) {
            for (int m_Barbarian : room) {
                System.out.println("\t# Here is a BARBARIAN and i have an AXE ! ");
                damage.PlayerDamages() = (player.m_iLifePointPlayer) - 15;
                damage.MonsterDamages(m_iLifePointMonsterLost) = damage.MonsterDamages(sumLifePointMonster) - 10;
            }
        }
    }

    public void barbarianIsDead(int p_iPointLifeBar) {
        m_iPointLifeBar = p_iPointLifeBar;
        if (m_iPointLifeBar <= 0) {
            System.out.println("*********** congratulation! *********\n"
                    + "****** The BARBARIAN is Dead******\n"
                    + "*******Please Open Next Door***");
        }

    }

}

