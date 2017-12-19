package com.example.codeclan.myprincesses;

import java.util.ArrayList;

/**
 * Created by annalanigan on 19/12/2017.
 */

public class TopPrincesses {

    ArrayList<Princess> list;

    public TopPrincesses(){
        list = new ArrayList<Princess>();
        list.add(new Princess(1, "Poppy", "Trolls", "TBC"));
        list.add(new Princess(2, "Belle", "Beauty and the Beast", "TBC"));
        list.add(new Princess(3, "Arial", "The Little Mermaid", "TBC"));
        list.add(new Princess(4, "Anna", "Frozen", "TBC"));
        list.add(new Princess(5, "Aurora", "Sleeping Beauty", "TBC"));
        list.add(new Princess(6, "Merida", "Brave", "/Users/annalanigan/codeclan_work/week_08/day_2/MyPrincesses/app/src/main/res/drawable-v24/merida.png"));
        list.add(new Princess(7, "Pocahontas", "Pocahontas", "TBC"));
        list.add(new Princess(8, "Moana", "Moana", "TBC"));
        list.add(new Princess(9, "Mulan", "Mulan", "R.drawable.mulan"));
        list.add(new Princess(10, "Elsa", "Frozen", "TBC"));
        list.add(new Princess(11, "Cinderella", "Cinderella", "TBC"));
    }

    public ArrayList<Princess> getList() {
        return new ArrayList<Princess>(list);
    }
}
