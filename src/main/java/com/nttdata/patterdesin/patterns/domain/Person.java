package com.nttdata.patterdesin.patterns.domain;

import com.nttdata.patterdesin.patterns.decorator.PersonInterface;

import lombok.Data;

@Data
public class Person implements PersonInterface {

    private String name;

    private int age;

    public Person() {
        super();
    }

    public Person(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }


    public String toString() {
        return this.name;
    }
}
