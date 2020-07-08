package com.company.Figura;

import java.util.Comparator;

public class FiguraComparator implements Comparator<Prlpip> {

    @Override
    public int compare(Prlpip prlpip, Prlpip t1) {

        int s1=prlpip.square-t1.square;
        if(s1==0)
            s1=prlpip.getLength()-t1.getLength();
        if(s1==0) s1=prlpip.getWidth()-t1.getWidth();
        return s1;



    }
}
