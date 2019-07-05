package com.stackroute.exercise5;

        import java.util.ArrayList;

public class Replace {
    ArrayList<String> list=new ArrayList<String>();
    public ArrayList<String> arraylist(String[] input, int[] index, String[] replace){
        for(int i=0;i<input.length;i++){ //add input to a list
            list.add(input[i]);
        }
        if(index.length==replace.length) { //if given index equals num of string to be replaced
            for (int j = 0; j < index.length; j++) {
                list.set(index[j], replace[j]); //replace them
            }
        }
        else {
            return list;
        }
        return list;
    }
    public ArrayList<String> remove(){ //clear the list after replacing them
        list.clear();
        return list;
    }
}