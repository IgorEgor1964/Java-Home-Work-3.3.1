package ru.netology.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class RadiomanTest {
    private Radioman radio;

    @BeforeEach
    public void radioAtributes() {
        this.radio = new Radioman(0, 10, 0, 100);
    }

    @Test
    public void setCurrentRadioStationValid() {
        radio.setCurrentRadioStation(8);
        assertEquals(8, radio.getCurrentRadioStation());
    }

    @Test
    public void setRadioStationOverMax() {
        radio.setCurrentRadioStation(11);
        assertEquals(10, radio.getMaxStation());
    }

    @Test
    public void setRadioStationUnderMin() {
        radio.setCurrentRadioStation(-5);
        assertEquals(0, radio.getMinStation());
    }

    @Test
    public void setUpCurrentRadioStationValid() {
        radio.setCurrentRadioStation(8);
        radio.setUpCurrentStation();
        assertEquals(9, radio.getCurrentRadioStation());

    }

    @Test
    public void setUpCurrentRadioStationOver() {
        radio.setCurrentRadioStation(10);
        radio.setUpCurrentStation();
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void setDownCurrentRadioStationValid() {
        radio.setCurrentRadioStation(9);
        radio.setDownCurrentStation();
        assertEquals(8, radio.getCurrentRadioStation());
    }

    @Test
    public void setDownCurrentRadioStationUnder() {
        radio.setCurrentRadioStation(0);
        radio.setDownCurrentStation();
        assertEquals(10, radio.getCurrentRadioStation());
    }

    @Test
    public void setCurrentVolumeValid() {
        radio.setCurrentVolume(77);
        assertEquals(77, radio.getCurrentVolume());
    }

    @Test
    public void setCurrentVolumeOverMax() {
        radio.setCurrentVolume(101);
        assertEquals(100, radio.getMaxVolume());
    }

    @Test
    public void setCurrentVolumeUnderMin() {
        radio.setCurrentVolume(-15);
        assertEquals(0, radio.getMinVolume());
    }

    @Test
    public void setUpCurrentVolumeValid() {
        radio.setCurrentVolume(64);
        radio.setUpCurrentVolume();
        assertEquals(65, radio.getCurrentVolume());
    }


    @Test
    public void setUpCurrentVolumeOverMax() {
        radio.setCurrentVolume(100);
        radio.setUpCurrentVolume();
        assertEquals(100, radio.getMaxVolume());
    }

    @Test
    public void setDownCurrentVolumeValid() {
        radio.setCurrentVolume(42);
        radio.setDownCurrentVolume();
        assertEquals(41, radio.getCurrentVolume());
    }

    @Test
    public void setDowncurrentVolumeUnderMin() {
        radio.setCurrentVolume(0);
        radio.setDownCurrentVolume();
        assertEquals(0, radio.getMinVolume());
    }

}