package org.example;

import java.io.Serializable;
public class Person implements Serializable {
    private int age;
    private String name;
    private String email;
    private long number;


    public void getage() {
        System.out.println("Age:"+age);
    }

    public void getdetails(){
        System.out.println("Name:"+name);
        System.out.println("email:"+email);
        System.out.println("number:"+number);
    }
}