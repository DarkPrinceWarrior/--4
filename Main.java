package com.company;

import com.company.Figura.FiguraComparator;
import com.company.Figura.Prlpip;

import java.util.*;
import java.lang.Comparable;


public class Main {


    public static void main(String[] args) {

        ArrayList array = new ArrayList();
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int n = input.nextInt();

        for (int i = 0; i < 1; i++) {

            array.add(new Prlpip(20,6,10));
            array.add(new Prlpip(15,1710,10));


        }


        for (Object obj : array) {
            System.out.println(obj);
        }
        System.out.println();


        Collections.sort(array,new FiguraComparator());

        for(Object obj:array){
            System.out.println(obj);
        }

    }




}


