package com.ironhack.w1.d4;

public abstract class Player {
    private double volume;
    private int currentTrack;

    public Player(double volume, int currentTrack) {
        this.volume = volume;
        this.currentTrack = currentTrack;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public int getCurrentTrack() {
        return currentTrack;
    }

    public void setCurrentTrack(int currentTrack) {
        this.currentTrack = currentTrack;
    }

    public void getNextTrack() {
        this.currentTrack++;
    }

    public abstract void close();
}
