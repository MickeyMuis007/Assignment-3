package com.mike.app;

/**
 * Created by student on 2016/03/10.
 */
public class Student {
    private String name;
    private String idNumber;
    private int age;
    public Student(){
        name = "";
        idNumber = "";
        age = 0;
    }
    public Student(String name, String idNumber, int age){
        this.name = name;
        this.idNumber = idNumber;
        this.age = age;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


}
