public class Radio {
    private int currentRadioStation;
    private int minCurrentRadioStation = 0;
    private int maxCurrentRadioStation = 9;
    private int soundVolumeLevel;
    private int minSoundVolumeLevel = 0;
    private int maxSoundVolumeLevel = 100;

    public Radio(int amountRadioStation) {
        this.maxCurrentRadioStation = amountRadioStation - 1;
    }

    public Radio() {
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation < minCurrentRadioStation) {
            return;
        }
        if (newCurrentRadioStation > maxCurrentRadioStation) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public void next() {
        if (currentRadioStation >= maxCurrentRadioStation) {
            setCurrentRadioStation(minCurrentRadioStation);
        } else {
            setCurrentRadioStation(currentRadioStation + 1);
        }
    }

    public void prev() {
        if (currentRadioStation <= minCurrentRadioStation) {
            setCurrentRadioStation(maxCurrentRadioStation);
        } else {
            setCurrentRadioStation(currentRadioStation - 1);
        }
    }

    public int getSoundVolumeLevel() {
        return soundVolumeLevel;
    }

    public void setSoundVolumeLeve(int newSoundVolumeLeve) {
        if (newSoundVolumeLeve < minSoundVolumeLevel) {
            return;
        }
        if (newSoundVolumeLeve > maxSoundVolumeLevel) {
            return;
        }
        soundVolumeLevel = newSoundVolumeLeve;
    }

    public void plusVolume() {
        if (soundVolumeLevel < maxSoundVolumeLevel) {
            soundVolumeLevel = soundVolumeLevel + 1;
        } else {
            soundVolumeLevel = 100;
        }
    }

    public void minusVolume() {
        if (soundVolumeLevel > minSoundVolumeLevel) {
            soundVolumeLevel = soundVolumeLevel - 1;
        } else {
            soundVolumeLevel = 0;
        }
    }

}
