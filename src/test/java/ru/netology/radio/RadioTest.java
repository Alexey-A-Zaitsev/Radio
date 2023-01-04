package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    // Переключение на следующую станцию
    // Блок граничных значений для метода "switchToNextStation" (следующая станция)
    @Test
    public void shouldSwitchNextStationIfCurrentLess0() {
        Radio radio = new Radio();

        radio.switchToNextStation(-1);
        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchNextStationIfCurrent0() {
        Radio radio = new Radio();

        radio.switchToNextStation(0);
        int expected = 1;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchNextStationIfCurrent1() {
        Radio radio = new Radio();

        radio.switchToNextStation(1);
        int expected = 2;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchNextStationIfCurrent8() {
        Radio radio = new Radio();

        radio.switchToNextStation(8);
        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchNextStationIfCurrent9() {
        Radio radio = new Radio();

        radio.switchToNextStation(9);
        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchNextStationIfCurrentMore9() {
        Radio radio = new Radio();

        radio.switchToNextStation(10);
        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    // Переключение на предыдущую станцию
    // Блок граничных значений для метода "switchToPrevStation" (предыдущая станция)
    @Test
    public void shouldSwitchPrevStationIfCurrentLess0() {
        Radio radio = new Radio();

        radio.switchToPrevStation(-1);
        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchPrevStationIfCurrent0() {
        Radio radio = new Radio();

        radio.switchToPrevStation(0);
        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchPrevStationIfCurrent1() {
        Radio radio = new Radio();

        radio.switchToPrevStation(1);
        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchPrevStationIfCurrent8() {
        Radio radio = new Radio();

        radio.switchToPrevStation(8);
        int expected = 7;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchPrevStationIfCurrent9() {
        Radio radio = new Radio();

        radio.switchToPrevStation(9);
        int expected = 8;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchPrevStationIfCurrentMore9() {
        Radio radio = new Radio();

        radio.switchToPrevStation(10);
        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    // Выбор станции через указание номера
    // Блок граничных значений для метода "setCurrentStation" (выбор станции по номеру)
    @Test
    public void shouldSetStationLess0() {
        Radio radio = new Radio();

        radio.setCurrentStation(-1);
        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStation0() {
        Radio radio = new Radio();

        radio.setCurrentStation(0);
        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStation1() {
        Radio radio = new Radio();

        radio.setCurrentStation(1);
        int expected = 1;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStation8() {
        Radio radio = new Radio();

        radio.setCurrentStation(8);
        int expected = 8;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStation9() {
        Radio radio = new Radio();

        radio.setCurrentStation(9);
        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationMore9() {
        Radio radio = new Radio();

        radio.setCurrentStation(10);
        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    // Увеличение громкости
    // Блок граничных значений для метода "increaseVolume" (увеличение громкости)
    @Test
    public void shouldIncreaseVolumeIfCurrentLess0() {
        Radio radio = new Radio();

        radio.increaseVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeIfCurrent0() {
        Radio radio = new Radio();

        radio.increaseVolume(0);

        int expected = 1;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeIfCurrent1() {
        Radio radio = new Radio();

        radio.increaseVolume(1);

        int expected = 2;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeIfCurrent9() {
        Radio radio = new Radio();

        radio.increaseVolume(9);

        int expected = 10;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeIfCurrent10() {
        Radio radio = new Radio();

        radio.increaseVolume(10);

        int expected = 10;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeIfCurrentMore10() {
        Radio radio = new Radio();

        radio.increaseVolume(11);

        int expected = 10;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    // Уменьшение громкости
    // Блок граничных значений для метода "decreaseVolume" (уменьшение громкости)
    @Test
    public void shouldDecreaseVolumeIfCurrentLess0() {
        Radio radio = new Radio();

        radio.decreaseVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeIfCurrent0() {
        Radio radio = new Radio();

        radio.decreaseVolume(0);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeIfCurrent1() {
        Radio radio = new Radio();

        radio.decreaseVolume(1);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeIfCurrent9() {
        Radio radio = new Radio();

        radio.decreaseVolume(9);

        int expected = 8;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeIfCurrent10() {
        Radio radio = new Radio();

        radio.decreaseVolume(10);

        int expected = 9;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeIfCurrentMore10() {
        Radio radio = new Radio();

        radio.decreaseVolume(11);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

}