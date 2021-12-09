package com.company.model;

import java.time.LocalDate;

public class Human {

    private final long id;

    private final String name;

    private final String male;

    private final LocalDate birthDate;

    private final Division division;

    private final double salary;

    public Human(long id, String name, String male, LocalDate birthDate, Division division, double salary) {
        this.id = id;
        this.name = name;
        this.male = male;
        this.birthDate = birthDate;
        this.division = division;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "{" +
                "id: " + id +
                ", name: " + name + '\'' +
                ", male: " + male + '\'' +
                ", birthDate: " + birthDate +
                ", division: " + division +
                ", salary: "  + salary +
                '}';
    }
}
