package com.thoughtworks.capability.gtb.entrancequiz.domain;

public class Student {
    private String name;
    //TODO GTB-工程实践: - 通常叫 id
    private int number;

    public Student(String nameOfStudent, int numberOfStudent) {
        this.name = nameOfStudent;
        this.number = numberOfStudent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
