package com.example.lab2;

import java.util.Arrays;
import java.util.List;

public class GameUser {
    private String userName, character;
    private int level;
    private double pointBalance;

    public GameUser(String userName, String character, int level, double pointBalance) {
        setUserName(userName);
        setCharacter(character);
        setLevel(level);
        setPointBalance(pointBalance);
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getCharacter() {
        return character;
    }

    public void setCharacter(String character) {
        List<String> validCharacters = Arrays.asList("McCree", "Widowmaker", "Sombra", "Zarya","Mei");
        if(validCharacters.contains(character))
            this.character = character;
        else
            throw new IllegalArgumentException(String.format("%s is invalid character, choose from %s", character, validCharacters));
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public double getPointBalance() {
        return pointBalance;
    }

    public void setPointBalance(double pointBalance) {
        this.pointBalance = pointBalance;
    }

    public String toString(){
        return String.format("User name: %s\nCharacter: %s\nLevel: %s\nPoint balance: %s", userName, character, level, pointBalance);
    }
}

