public class Radio {
    public int currentRadioStation;
    public int soundVolumeLevel;

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation < 0) {
            return;
        }
        if (newCurrentRadioStation > 9) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public void setCurrentRadioStationMax() {
        currentRadioStation = 9;
    }

    public void next() {
        if (currentRadioStation < 9) {
            currentRadioStation = currentRadioStation + 1;
        } else {
            currentRadioStation = 0;
        }
    }

    public void prev() {
        if (currentRadioStation > 0) {
            currentRadioStation = currentRadioStation - 1;
        } else {
            currentRadioStation = 9;
        }
    }

    public int getSoundVolumeLevel() {
        return soundVolumeLevel;
    }

    public void setSoundVolumeLevelMax() {
        soundVolumeLevel = 10;
    }

    public void setSoundVolumeLeve(int newSoundVolumeLeve) {
        if (newSoundVolumeLeve < 0) {
            return;
        }
        if (newSoundVolumeLeve > 10) {
            return;
        }
        soundVolumeLevel = newSoundVolumeLeve;
    }

    public void plusVolume() {
        if (soundVolumeLevel < 10) {
            soundVolumeLevel = soundVolumeLevel + 1;
        } else {
            soundVolumeLevel = 10;
        }
    }

    public void minusVolume() {
        if (soundVolumeLevel > 0) {
            soundVolumeLevel = soundVolumeLevel - 1;
        } else {
            soundVolumeLevel = 0;
        }
    }

}
