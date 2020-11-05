package com.company;

    public class Barbarian extends Monsters {

        int m_iBarbarian;
        int m_iPointLifeBar=random.nextInt(31);
        boolean isAlive=true;
    Dungeon room = new Dungeon();
    Player player= new Player();
    Damages damage= new Damages();

        void barbarianAttack(){
            while(m_iPointLifeBar>0){
            for (int i room[i] : m_iBarbarian) {
                System.out.println("\t# Here is a BARBARIAN and i have an AXE ! ");
                damage.PlayerDamages()=(Player.m_iLifePointPlayer)-15;
                damage.MonsterDamages()=Barbarian(m_iPointLifeBar)-10;
            }
            void barbarianIsDead(){
                if(m_iPointLifeBar<=0){
                    System.out.println("*********** congratulation! *********\n"
                                       +"****** The BARBARIAN is Dead******\n"
                                         +"*******Please Open Next Door***");
                }

        }

    }
}
