/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.l6_mockito;

import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author admin
 */

//Teszt
public class Person {
    private int id;
    private String name;

    public static Person scannedPerson(PersonDataReader pdr){
        return null;
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        return true;
    }

    public Person(int id, String name) {
        if (id<0) throw new RuntimeException();
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return null;
    }

    public boolean nameContainsChar(char c){
        return true;
    }
}
