package com.company;

public class Room extends Dungeon{
    Monsters monsters;
    Player hero;
    protected Room(){
        monsters= new Monsters();
        
        
    }

    public void enterRoom(Player player) {
        hero=player;
        System.out.println("hey you ! let's hit the monster");

    }
}
