package com.company.model;

public class Division {

    private final long id;

    private final String name;

    public Division(long id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "{" +
                "id: " + id +
                ", name: '" + name + '\'' +
                '}';
    }
}
