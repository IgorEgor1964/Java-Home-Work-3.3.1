package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    @Test
    public void createRadio() {
        ru.netology.domain.Radioman radio = new ru.netology.domain.Radioman();
        assertEquals(0, radio.currentRadioStation);
        assertEquals(0, radio.fistRadioStation);
        assertEquals(9, radio.lastRadioStation);
        assertEquals(0, radio.currentVolume);
        assertEquals(0, radio.minVolume);
        assertEquals(100, radio.maxVolume);
    }

    @Test
    public void setCurrentRadioStationValid() {
        ru.netology.domain.Radioman radio = new ru.netology.domain.Radioman();
        radio.setCurrentRadioStation(5);
        assertEquals(5, radio.getCurrentRadioStation());
    }

    @Test
    public void setFistRadioStationValid() {
        ru.netology.domain.Radioman radio = new ru.netology.domain.Radioman();
        radio.setFistRadioStation(0);
        assertEquals(0, radio.getFistRadioStation());
    }

    @Test
    public void setLastRadioStationValid() {
        ru.netology.domain.Radioman radio = new ru.netology.domain.Radioman();
        radio.setLastRadioStation(9);
        assertEquals(9, radio.getLastRadioStation());
    }

    @Test
    void setNextRadioStationValid() {
        ru.netology.domain.Radioman radio = new ru.netology.domain.Radioman();
        radio.setCurrentRadioStation(5);
        radio.nextRadioStation();
        assertEquals(6, radio.getCurrentRadioStation());
    }

    @Test
    void setNextRadioStationValidMax() {
        ru.netology.domain.Radioman radio = new ru.netology.domain.Radioman();
        radio.setCurrentRadioStation(9);
        radio.nextRadioStation();
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    void setPrevStationValid() {
        ru.netology.domain.Radioman radio = new ru.netology.domain.Radioman();
        radio.setCurrentRadioStation(5);
        radio.prevRadioStation();
        assertEquals(4, radio.getCurrentRadioStation());
    }

    @Test
    void setPrevStationValidMin() {
        ru.netology.domain.Radioman radio = new ru.netology.domain.Radioman();
        radio.setCurrentRadioStation(0);
        radio.prevRadioStation();
        assertEquals(9, radio.getCurrentRadioStation());
    }

    @Test
    void setCurrentVolume() {
        ru.netology.domain.Radioman radio = new ru.netology.domain.Radioman();
        radio.setCurrentVolume(5);
        assertEquals(5, radio.getCurrentVolume());
    }

    @Test
    void switchVolumeUpMax() {
        ru.netology.domain.Radioman radio = new ru.netology.domain.Radioman();
        radio.setCurrentVolume(10);
        radio.volumeUp();
        assertEquals(11, radio.getCurrentVolume());
    }

    @Test
    void switchVolumeUp() {
        ru.netology.domain.Radioman radio = new ru.netology.domain.Radioman();
        radio.setCurrentVolume(5);
        radio.volumeUp();
        assertEquals(6, radio.getCurrentVolume());
    }

    @Test
    void switchVolumeDown() {
        ru.netology.domain.Radioman radio = new ru.netology.domain.Radioman();
        radio.setCurrentVolume(5);
        radio.volumeDown();
        assertEquals(4, radio.getCurrentVolume());
    }

    @Test
    void switchVolumeDownMin() {
        ru.netology.domain.Radioman radio = new ru.netology.domain.Radioman();
        radio.setCurrentVolume(0);
        radio.volumeDown();
        assertEquals(0, radio.getCurrentVolume());
    }
}