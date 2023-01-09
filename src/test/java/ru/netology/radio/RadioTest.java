package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    Radio radio = new Radio(73);
    Radio radioDefault = new Radio(); // Тестирование при значениях количества станций по умолчанию (10)

    // setCurrentStation
    @Test
    public void defaultSetStation7() {

        radioDefault.setCurrentStation(7);

        int expected = 7;
        int actual = radioDefault.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void defaultSetStationMinus1() {

        radioDefault.setCurrentStation(-1);

        int expected = 0;
        int actual = radioDefault.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void defaultSetStation0() {
        radioDefault.setCurrentVolume(4);

        radioDefault.setCurrentStation(0);

        int expected = 0;
        int actual = radioDefault.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void defaultSetStation1() {

        radioDefault.setCurrentStation(1);

        int expected = 1;
        int actual = radioDefault.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void defaultSetStation8() {

        radioDefault.setCurrentStation(8);

        int expected = 8;
        int actual = radioDefault.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void defaultSetStation9() {

        radioDefault.setCurrentStation(9);

        int expected = 9;
        int actual = radioDefault.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void defaultSetStation10() {

        radioDefault.setCurrentStation(10);

        int expected = 0;
        int actual = radioDefault.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void defaultSetStationLess0() {
        radioDefault.setCurrentStation(3);

        radioDefault.setCurrentStation(-15);

        int expected = 3;
        int actual = radioDefault.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void defaultSetStationMore9() {
        radioDefault.setCurrentStation(6);

        radioDefault.setCurrentStation(19);

        int expected = 6;
        int actual = radioDefault.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    // next
    @Test
    public void defaultShouldSwitchNextStationIfCurrent4() {
        radioDefault.setCurrentStation(4);

        radioDefault.next();

        int expected = 5;
        int actual = radioDefault.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void defaultShouldSwitchNextStationIfCurrent8() {
        radioDefault.setCurrentStation(8);

        radioDefault.next();

        int expected = 9;
        int actual = radioDefault.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void defaultShouldSwitchNextStationIfCurrent9() {
        radioDefault.setCurrentStation(9);

        radioDefault.next();

        int expected = 0;
        int actual = radioDefault.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    // prev
    @Test
    public void defaultShouldSwitchPrevStationIfCurrent5() {
        radioDefault.setCurrentStation(5);

        radioDefault.prev();

        int expected = 4;
        int actual = radioDefault.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void defaultShouldSwitchPrevStationIfCurrent8() {
        radioDefault.setCurrentStation(8);

        radioDefault.prev();

        int expected = 7;
        int actual = radioDefault.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void defaultShouldSwitchPrevStationIfCurrent9() {
        radioDefault.setCurrentStation(9);

        radioDefault.prev();

        int expected = 8;
        int actual = radioDefault.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }


    // Тестирование при заданном значении количества станций

    // setCurrentStation
    @Test
    public void setStation61() {

        radio.setCurrentStation(61);

        int expected = 61;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setStationMinus1() {

        radio.setCurrentStation(-1);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setStation0() {
        radio.setCurrentVolume(4);

        radio.setCurrentStation(0);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setStation1() {

        radio.setCurrentStation(1);

        int expected = 1;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setStation71() {

        radio.setCurrentStation(71);

        int expected = 71;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setStation72() {

        radio.setCurrentStation(72);

        int expected = 72;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setStation73() {
        radio.setCurrentStation(45);

        radio.setCurrentStation(73);

        int expected = 45;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setStationLess0() {

        radio.setCurrentStation(-15);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setStationMoreMaxStation() {
        radio.setCurrentStation(6);

        radio.setCurrentStation(90);

        int expected = 6;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    // next
    @Test
    public void shouldSwitchNextStationIfCurrent55() {
        radio.setCurrentStation(55);

        radio.next();

        int expected = 56;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchNextStationIfCurrent0() {
        radio.setCurrentStation(0);

        radio.next();

        int expected = 1;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchNextStationIfCurrent1() {
        radio.setCurrentStation(1);

        radio.next();

        int expected = 2;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchNextStationIfCurrent71() {
        radio.setCurrentStation(71);

        radio.next();

        int expected = 72;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchNextStationIfCurrent72() {
        radio.setCurrentStation(72);

        radio.next();

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    // prev
    @Test
    public void shouldSwitchPrevStationIfCurrent5() {
        radio.setCurrentStation(33);

        radio.prev();

        int expected = 32;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchPrevStationIfCurrent0() {
        radio.setCurrentStation(0);

        radio.prev();

        int expected = 72;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchPrevStationIfCurrent1() {
        radio.setCurrentStation(1);

        radio.prev();

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchPrevStationIfCurrent71() {
        radio.setCurrentStation(71);

        radio.prev();

        int expected = 70;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchPrevStationIfCurrent72() {
        radio.setCurrentStation(72);

        radio.prev();

        int expected = 71;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    // increaseVolume
    @Test
    public void shouldIncreaseVolumeIfCurrent64() {
        radio.setCurrentVolume(64);

        radio.increaseVolume();

        int expected = 65;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeIfCurrent0() {
        radio.setCurrentVolume(0);

        radio.increaseVolume();

        int expected = 1;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeIfCurrent1() {
        radio.setCurrentVolume(1);

        radio.increaseVolume();

        int expected = 2;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeIfCurrent99() {
        radio.setCurrentVolume(99);

        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeIfCurrent100() {
        radio.setCurrentVolume(100);

        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    // decreaseVolume
    @Test
    public void shouldDecreaseVolumeIfCurrent6() {
        radio.setCurrentVolume(46);

        radio.decreaseVolume();

        int expected = 45;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeIfCurrent0() {
        radio.setCurrentVolume(0);

        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeIfCurrent1() {
        radio.setCurrentVolume(1);

        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeIfCurrent99() {
        radio.setCurrentVolume(99);

        radio.decreaseVolume();

        int expected = 98;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeIfCurrent100() {
        radio.setCurrentVolume(100);

        radio.decreaseVolume();

        int expected = 99;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setVolumeLess0() {

        radio.setCurrentVolume(-17);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setVolumeMore100() {

        radio.setCurrentVolume(158);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

}