package com.example.recyclerview;

public class State {
    private String name;
    private String capital;
    private int flagResource;
    private String description; // Добавляем описание

    public State(String name, String capital, int flagResource, String description) {
        this.name = name;
        this.capital = capital;
        this.flagResource = flagResource;
        this.description = description;
    }

    public String getName() { return name; }
    public String getCapital() { return capital; }
    public int getFlagResource() { return flagResource; }
    public String getDescription() { return description; }
}
