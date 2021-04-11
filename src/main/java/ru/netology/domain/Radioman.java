package ru.netology.domain;

public class Radioman {
    int currentRadioStation;
    int minRadioStation = 0;
    int maxRadioStation = 10;
    int currentVolume;
    int minVolume = 0;
    int maxVolume = 100;

    public Radioman(int minStation, int maxStation, int minVolume, int maxVolume) {
        this.minRadioStation = minStation;
        this.maxRadioStation = maxStation;
        this.minVolume = minVolume;
        this.maxVolume = maxVolume;
    }

    public Radioman(int maxRadioStation, int currentRadioStation) {
        this.maxRadioStation = maxRadioStation;
        this.currentRadioStation = currentRadioStation;
    }

    public int getCurrentVolume() {

        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            return;
        }
        if (currentVolume < minVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public int getCurrentRadioStation() {

        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation > maxRadioStation) {
            this.currentRadioStation = maxRadioStation;
            return;
        }
        if (currentRadioStation < minRadioStation) {
            this.currentRadioStation = minRadioStation;
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public void setUpCurrentVolume() {
        this.currentVolume++;
        if (currentVolume <= maxVolume) {
            return;
        }
    }

    public void setDownCurrentVolume() {
        this.currentVolume--;
        if (currentVolume < minVolume) {
            return;
        }
    }

    public void setUpCurrentStation() {
        this.currentRadioStation++;
        if (currentRadioStation > maxRadioStation) {
            this.currentRadioStation = minRadioStation;
        }
    }

    public void setDownCurrentStation() {
        this.currentRadioStation--;
        if (currentRadioStation < minRadioStation) {
            this.currentRadioStation = maxRadioStation;
        }
    }

    public int getMinStation() {

        return minRadioStation;
    }

    public int getMaxStation() {

        return maxRadioStation;
    }

    public int getMinVolume() {

        return minVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }
}