package com.stackroute.exercise5;

import java.util.Map;

public class SwapValues{
    public Map<String,String> valueChange(Map<String,String> map){
//replace val2 value with val1 value
        map.replace("val2",map.get("val1"));
        map.replace("val1"," "); //replace val1 value with space
        return map;
    }
}