package com.stackroute.exercise5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class MaintestTest {
    Maintest testobj;
    @Before
    public void setUp(){
        testobj=new Maintest();
    }
    @After
    public void tearDown() {
        testobj = null;
    }


    @Test
    public void testStudentSort() {
        ArrayList<Student> student = new ArrayList<Student>();
        Student student1 = new Student("456", "sraddha", 20);
        Student student2 = new Student("398", "pranitha", 22);
        Student student3 = new Student("428", "pushpitha", 11);
        Student student4 = new Student("453", "mounika", 22);
        Student student5 = new Student("610", "nandini", 12);
        student.add(student1);
        student.add(student2);
        student.add(student3);
        student.add(student4);
        student.add(student5);
        String result = Maintest.implementer(student);
        assertEquals("[Student{id='428', name='pushpitha', age=11}, Student{id='610', name='nandini', age=12}, Student{id='456'," +
                " name='sraddha', age=20}, Student{id='453', name='mounika', age=22}, Student{id='398', name='pranitha', age=22}]", result);
    }
    @Test
    public void testStudentsSort() {
        ArrayList<Student> student = new ArrayList<Student>();
        Student student1 = new Student("456", "sraddha", 22);
        Student student2 = new Student("398", "sraddha", 22);
        Student student3 = new Student("428", "sraddha", 22);
        Student student4 = new Student("453", "mounika", 22);
        Student student5 = new Student("610", "nandini", 22);
        student.add(student1);
        student.add(student2);
        student.add(student3);
        student.add(student4);
        student.add(student5);
        String result = Maintest.implementer(student);
        assertEquals("[Student{id='453', name='mounika', age=22}, Student{id='610', name='nandini', age=22}, Student{id='398', name='sraddha', age=22}, Student{id='428', name='sraddha', age=22}, Student{id='456', name='sraddha', age=22}]", result);
    }


}