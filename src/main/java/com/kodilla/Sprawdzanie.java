package com.kodilla;

import java.util.ArrayList;
import java.util.List;

public class Sprawdzanie {

    public List<Integer> sprawdzaniePodzielnosci(int a, int b, int x){

        List<Integer> listaCyfr = new ArrayList<>();

        for (int i=a; i<=b; i++) {
            if (i % x == 0) {
                listaCyfr.add(i);
            }
        }
        return listaCyfr;
    }

}
