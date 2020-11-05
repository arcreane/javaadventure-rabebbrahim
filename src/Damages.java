public class Damages {

    int m_iLifePointPlayerLost;
    int m_iLifePointMonsterLost;
   // damages of the player
    public int PlayerDamages(int p_iLifePointPlayerLost ,int sumLifePointPlayer ){
        m_iLifePointPlayerLost =p_iLifePointPlayerLost;
        sumLifePointPlayer-=m_iLifePointPlayerLost;
        return sumLifePointPlayer;

    }
    public int MonsterDamages(int p_iLifePointMonsterLost, int sumLifePointMonster){
        m_iLifePointMonsterLost=p_iLifePointMonsterLost;
        sumLifePointMonster-=m_iLifePointMonsterLost;
        return sumLifePointMonster;
    }
}
