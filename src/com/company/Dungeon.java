package com.company;

public class Dungeon {
    // building the array of rooms
    int[] m_iRoom;
    public void enterRoom (){
        for (int i = 0; i < 5; i++) {
            m_iRoom[i]++;
        }
    }
}
