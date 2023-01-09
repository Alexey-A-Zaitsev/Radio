package ru.netology.radio;

public class Radio {
    private int currentStation;
    private int currentVolume;

    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    /*
    Метод переключения станции на следующую. Логика: прибавляя к текущему номеру станции 1, получаем число,
    целочисленный остаток от деления на 10 которого дает нам номер следующей станции
    */
    public void switchToNextStation(int newCurrentStation) {
        if (newCurrentStation < 0) {
            return;
        }
        if (newCurrentStation > 9) {
            return;
        }
        currentStation = (newCurrentStation + 1) % 10;

    }

    /*
    Метод переключений станции на предыдущую. Логика: прибавляя к номеру текущей станции 9, получаем двузначное число,
    целочисленный остаток от деления на 10 которого дает нам номер предыдущей станции
    */
    
    public void switchToPrevStation(int newCurrentStation) {
        if (newCurrentStation < 0) {
            return;
        }
        if (newCurrentStation > 9) {
            return;
        }
        currentStation = (newCurrentStation + 9) % 10;

    }

    /*Метод выбора радиостанции через прямое указание её номера*/
    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < 0) {
            return;
        }
        if (newCurrentStation > 9) {
            return;
        }
        currentStation = newCurrentStation;

    }

    /*Метод увеличения громкости на 1*/
    public void increaseVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume < 10) {
            currentVolume = newCurrentVolume + 1;
        } else currentVolume = 10;
    }

    /*Метод уменьшения громкости на 1*/
    public void decreaseVolume(int newCurrentVolume) {
        if (newCurrentVolume <= 0) {
            return;
        }
        if (newCurrentVolume <= 10) {
            currentVolume = newCurrentVolume - 1;
        } else currentVolume = 0;
    }

}