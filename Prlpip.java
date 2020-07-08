package com.company.Figura;


import java.util.Comparator;

public class Prlpip implements Comparable<Prlpip>  {

public final int height;
public final int length;
public final int width;
public final int square;


public Prlpip(int h,int w,int l){

    height=h;
    length=l;
    width=w;
    square=setSquare();

}

public int getHeight(){

    return height;
}

    public int getLength(){

        return length;
    }

    public int getWidth(){

        return width;
    }

    public int setSquare(){

    return 2*(height*length+height*width+width*length);
    }

public int getSquare(){

    return square;

}





    @Override
    public String toString() {
        return "(" +length+", "+width+", "+height+ ") -- "+square;
    }


    @Override
    public int compareTo(Prlpip prlpip) {

        return this.square-prlpip.square;
    }




}


