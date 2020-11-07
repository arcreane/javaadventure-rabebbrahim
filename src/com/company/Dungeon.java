package com.company;

public class Dungeon {
    Room[] m_iRoom;
    Room room;
    Player hero;
    Dungeon dungeon;

    public Dungeon() {
        dungeon =new Dungeon();
        room= new Room();
        hero=new Player();
        m_iRoom = new Room[5];
        for (int i = 0; i < m_iRoom.length; i++) {
            m_iRoom[i]=new Room();

        }
    }
    // building the array of rooms

    public  void enterDungeon(Player hero) {
        for (Room room :m_iRoom) {
           room.enterRoom(hero);

           if(!hero.isAlive){
               break;
           }

        }
    }if(hero.isAlive){


    }
}
