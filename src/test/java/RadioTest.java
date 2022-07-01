import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test

    public void radioStationMaxNumber() {
        Radio num = new Radio();

        num.setCurrentRadioStationMax();

        int expected = 9;
        int actual = num.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void radioStationNumber() {
        Radio num = new Radio();

        num.setCurrentRadioStation(5);

        int expected = 5;
        int actual = num.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void radioStationNumberMax() {
        Radio num = new Radio();

        num.setCurrentRadioStation(15);

        int expected = 0;
        int actual = num.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void nextRadioStationMax() {
        Radio num = new Radio();

        num.setCurrentRadioStation(9);
        num.next();

        int expected = 0;
        int actual = num.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void nextRadioStation() {
        Radio num = new Radio();

        num.setCurrentRadioStation(2);
        num.next();

        int expected = 3;
        int actual = num.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void prevRadioStationMin() {
        Radio num = new Radio();

        num.setCurrentRadioStation(0);
        num.prev();

        int expected = 9;
        int actual = num.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void prevRadioStation() {
        Radio num = new Radio();

        num.setCurrentRadioStation(9);
        num.prev();

        int expected = 8;
        int actual = num.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void soundVolumeMaxLevel() {
        Radio snd = new Radio();

        snd.setSoundVolumeLevelMax();

        int expected = 10;
        int actual = snd.getSoundVolumeLevel();
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void soundVolumeMaxMinLevel() {
        Radio snd = new Radio();

        snd.setSoundVolumeLeve(6);

        int expected = 6;
        int actual = snd.getSoundVolumeLevel();
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void increaseSoundVolumeLevel() {
        Radio snd = new Radio();

        snd.setSoundVolumeLeve(10);
        snd.increaseVolume();

        int expected = 10;
        int actual = snd.getSoundVolumeLevel();
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void reduceSoundVolumeLevel() {
        Radio snd = new Radio();

        snd.setSoundVolumeLeve(0);
        snd.reduceVolume();

        int expected = 0;
        int actual = snd.getSoundVolumeLevel();
        Assertions.assertEquals(expected, actual);
    }

}
