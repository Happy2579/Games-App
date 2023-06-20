package com.example.gamesapp;

public class GameModel {

    private String gameName;
    private int gameImg;

    public GameModel(String gameName, int gameImg) {
        this.gameName = gameName;
        this.gameImg = gameImg;
    }

    public int getGameImg() {
        return gameImg;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public void setGameImg(int gameImg) {
        this.gameImg = gameImg;
    }
}
