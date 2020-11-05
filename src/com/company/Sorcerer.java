package com.company;

public class Sorcerer extends Monsters {

    @Override
    int m_iSorcerer;
    int m_iPointLifeSor=random.nextInt(11);
    boolean isAlive=true;
    Dungeon room=new Dungeon();
    Player player=new Player();
    Damages damage=new Damages();


    public void sorcererAttack() {
        while (m_iPointLifeSor>0) {

            System.out.println("\t# Here is a SORCERER and i have a strike-of-light  !");
            for (int i room[i] : m_iSorcerer){

                damage.MonsterDamages(i) = (Player.m_iLifePointPlayer) - 2;

                damage.PlayerDamages(i) = Sorcerer (m_iPointLifeSor) - 2;

            }
            public void sorcererIsDead(){
                if(m_iPointLifeSor<=0){
                    System.out.println("*******congratulation********\n"+
                                       "*****The sorcerer is dead****\n "+
                                        "*****open the next door******");
                }
            }
        }
    }
