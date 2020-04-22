package com.utn.spring.model;

public class Person {

    private String name;
    private String lastne;

    public Person() {
    }

    public Person(String name, String lastme) {
        this.name = name;
        this.lastne = lastme;
    }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getLastne() { return lastne; }

    public void setLastne(String lastme) { this.lastne = lastme; }
}
