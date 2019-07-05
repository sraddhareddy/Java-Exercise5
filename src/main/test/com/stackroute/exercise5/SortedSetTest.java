package com.stackroute.exercise5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class SortedSetTest {
    SortedSet sortedSet;
    @Before
    public void setUp(){
     sortedSet=new SortedSet();
    }
@After
    public void tearDown(){
        sortedSet=null;
}
@Test
    public void testSortedOrder(){                                     //names
    ArrayList<String> result=sortedSet.sortingStrings("sraddha nandini Friday harry prawns");
    ArrayList<String> ss=new ArrayList<String>();
    ss.add("Friday");
    ss.add("harry");
    ss.add("nandini");
    ss.add("prawns");
    ss.add("sraddha");
    assertEquals(ss,result);
}

    @Test
    public void testingSortedOrder(){                                     //no value
        ArrayList<String> result=sortedSet.sortingStrings("");
        ArrayList<String> ss=new ArrayList<String>();
        ss.add("");
        assertEquals(ss,result);
    }

    @Test
    public void testingSortedOrderOfDigits(){                                   //numbers and word
        ArrayList<String> result=sortedSet.sortingStrings("123 456 789 sraddha");
        ArrayList<String> ss=new ArrayList<String>();
        ss.add("123");
        ss.add("456");
        ss.add("789");
        ss.add("sraddha");
        assertEquals(ss,result);
    }
    @Test
    public void testingSortedOrderOfSymbols(){                             //testing with special symbols
        ArrayList<String> result=sortedSet.sortingStrings("$ @ % &");
        ArrayList<String> ss=new ArrayList<String>();
        ss.add("$");
        ss.add("%");
        ss.add("&");
        ss.add("@");
        assertEquals(ss,result);
    }
}