package com.stackroute.exercise5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ReplaceTest {
    Replace testobj;

    @Before
    public void setUp() {
        testobj = new Replace();
    }

    @After
    public void tearDown() {
        testobj = null;
    }

    @Test
//indexes are replaced with given string
    public void changeArrayList() {
        ArrayList<String> list = testobj.arraylist(new String[]{"apple", "grape", "melon", "berry"}, new int[]{0, 2}, new String[]{"kiwi", "mango"});
        ArrayList<String> expected = new ArrayList<String>();
        expected.add("kiwi");
        expected.add("grape");
        expected.add("mango");
        expected.add("berry");
        assertEquals(expected, list);
        System.out.println(list);
        ArrayList<String> empty = new ArrayList<String>();
        ArrayList<String> res = testobj.remove();
        assertEquals(empty, res);
        System.out.println(res);
    }

    @Test
//indexes are replaced with given string
    public void testChangeArrayList() {
        ArrayList<String> list = testobj.arraylist(new String[]{"apple", "grape", "melon", "berry"}, new int[]{0, 2}, new String[]{"mango"});
        ArrayList<String> expected = new ArrayList<String>();
        expected.add("apple");
        expected.add("grape");
        expected.add("melon");
        expected.add("berry");
        assertEquals(expected, list);
        System.out.println(list);
        ArrayList<String> empty = new ArrayList<String>();
        ArrayList<String> res = testobj.remove();
        assertEquals(empty, res);
        System.out.println(res);
    }

    @Test
//indexes are replaced with given string
    public void testNullInputArrayList() {
        ArrayList<String> list = testobj.arraylist(new String[]{"abc", "de", "fg", "hij"}, new int[]{0, 2}, new String[]{"xyz", " "});
        ArrayList<String> expected = new ArrayList<String>();
        expected.add("xyz");
        expected.add("de");
        expected.add(" ");
        expected.add("hij");
        assertEquals(expected, list);
        System.out.println(list);
        ArrayList<String> empty = new ArrayList<String>();
        ArrayList<String> res = testobj.remove();
        assertEquals(empty, res);
        System.out.println(res);
    }
}
//indexes are replaced with given string