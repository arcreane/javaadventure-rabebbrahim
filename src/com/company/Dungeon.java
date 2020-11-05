package com.company;

public class Dungeon {
    int m_iRoom;
    public int enterRoom (int[] p_iRoom){
        for (int i = 0; i < 5; i++) {
            m_iRoom=p_iRoom;
        }
        return enterRoom();
    }
}
