package com.example.opilane.kings;

//see teeb King classi võimalikuks, võimaldab saada objectid kätte

import java.util.ArrayList;
import java.util.List;

//second part of the data resource, the class Kings makes King object available
public class Kings {
    //geting list
    private List<King> list = new ArrayList();

    //adding multidimensional array values into the list

    public Kings() {
        for (String[] arr : data)
            list.add(new King(arr[0], Integer.parseInt(arr[1]), Integer.parseInt(arr[2])));
    }

    public List<King> getKings() {
        return list;
    }

    //our multidimensional array

    private static final String[][] data = {
            {"Henry VIII", "1509", "1547"},
            {"Edward VI", "1547", "1553"},
            {"Mary I", "1553", "1558"},
            {"Elizabeth I", "1558", "1603"},
            {"James I", "1603", "1625"},

    };
}
