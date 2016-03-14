package com.mike.app;

import org.junit.Before;
import org.junit.Test;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by student on 2016/03/10.
 */
public class QuestionTest {
    private CollectStudents list;
    @Before
    public void setUp() throws Exception {
        list = new CollectStudents();

    }

    @Test
    public void testList() throws Exception {
        Student student = new Student("john","DQ123",20);
        list.addStudentToList(student);
        Assert.assertEquals(list.getStudentList().get(0), student);
    }

    @Test
    public void testSet() throws Exception {
        Student s1 = new Student();
        list.addStudentToSet(s1);
        org.junit.Assert.assertNotNull(list);
    }

    @Test
    public void testMap() throws Exception {
        Student s1 = new Student();
        list.addStudentToMap(12,s1);
        Assert.assertEquals(s1,list.getStudentMap().get(12));
    }
}