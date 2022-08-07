package com.programming.Jav;

public class ConstructorChainingEx {
    int rollno;
    String name,course;
    float fee;
    ConstructorChainingEx(int rollno,String name,String course){
        this.rollno=rollno;
        this.name=name;
        this.course=course;
    }
    ConstructorChainingEx(int rollno,String name,String course,float fee){
        this(rollno,name,course);//reusing constructor
        this.fee=fee;
    }
    void display(){System.out.println(rollno+" "+name+" "+course+" "+fee);}
}
