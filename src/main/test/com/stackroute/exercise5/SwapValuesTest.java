package com.stackroute.exercise5;

import com.stackroute.exercise5.SwapValues;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class SwapValuesTest {
    SwapValues testobj;

    @Before
    public void setUp() {
        testobj = new SwapValues();
    }

    @After
    public void tearDown() {
        testobj = null;
    }

    @Test
//replace val1 value with empty string and val2 with val1 value
    public void testKeyvalueChange() {
        HashMap<String, String> input = new HashMap<String, String>();
        input.put("val1", "java");
        input.put("val2", "c++");
        Map<String, String> result = new HashMap<String, String>();
        result = testobj.valueChange(input);

        HashMap<String, String> output = new HashMap<String, String>();
        output.put("val1", " ");
        output.put("val2", "java");

        assertEquals(output, result);
    }

    @Test
//replace val1 value with empty string and val2 with val1 value
    public void testNullinputKeyvalueChange() {
        HashMap<String, String> input = new HashMap<String, String>();
        input.put("val1", " ");
        input.put("val2", "abc");
        Map<String, String> result = new HashMap<String, String>();
        result = testobj.valueChange(input);

        HashMap<String, String> output = new HashMap<String, String>();
        output.put("val1", " ");
        output.put("val2", " ");

        assertEquals(output, result);
    }

    @Test
//replace val1 value with empty string and val2 with val1 value
    public void testNegativeInputKeyvalueChange() {
        HashMap<String, String> input = new HashMap<String, String>();
        input.put("val1", "-12345");
        input.put("val2", "-6789");
        Map<String, String> result = new HashMap<String, String>();
        result = testobj.valueChange(input);

        HashMap<String, String> output = new HashMap<String, String>();
        output.put("val1", " ");
        output.put("val2", "-12345");

        assertEquals(output, result);
    }

    @Test
    public void testNumberInputKeyvalueChange() {
        HashMap<String, String> input = new HashMap<String, String>();
        input.put("val1", "678");
        input.put("val2", "123");
        Map<String, String> result = new HashMap<String, String>();
        result = testobj.valueChange(input);

        HashMap<String, String> output = new HashMap<String, String>();
        output.put("val1", " ");
        output.put("val2", "678");

        assertEquals(output, result);
    }
}