package com.mike.app;

import java.util.*;

/**
 * Created by student on 2016/03/10.
 */
public class CollectStudents {
    java.util.List<Student> list1 = new ArrayList<Student>();
    private Set set = new HashSet();
    private Map<Integer, Student> map = new HashMap<Integer, Student>();
    public int index;
    public CollectStudents(){
        index = 0;
    }
    public  void addStudentToList(Student a){
        list1.add(a);
    }
    public void addStudentToSet(Student a){
        set.add(a);
    }
    public void addStudentToMap(Student a){
        map.put(index,a);
        index++;
    }
    public void addStudentToMap(int i, Student a){
        map.put(i,a);
    }

    public List getStudentList(){
        return list1;
    }
    public Set getStudentSet(){
        return set;
    }
    public Map getStudentMap(){
        return map;
    }
}
