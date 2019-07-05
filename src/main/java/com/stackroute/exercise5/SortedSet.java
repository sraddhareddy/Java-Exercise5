package com.stackroute.exercise5;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class SortedSet {
    public ArrayList<String> sortingStrings(String string) {
        TreeSet<String> set = new TreeSet<String>();
        String[] array=string.split(" ");                  //splitting the given string with spaces
        for(int i=0;i<array.length;i++){                          //add the elements of string array into treeset(they will add in ascending order)
            set.add(array[i]);
        }
        ArrayList<String> arrayList=new ArrayList<String>(set);   //converting treeset to arraylist
        return arrayList;
    }
}
