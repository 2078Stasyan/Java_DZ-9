import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
// Номер максимальной радиостанции
    public void radioStationNumber() {
        Radio num = new Radio();

        num.setCurrentRadioStationMax();

        int expected = 9;
        int actual = num.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
// Включает номер выбранной станции
    public void radioStationNumberRange() {
        Radio num = new Radio();

        num.setCurrentRadioStation(5);

        int expected = 5;
        int actual = num.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
// Выбрана несуществующая станция -1
    public void radioStationNumberMin() {
        Radio num = new Radio();

        num.setCurrentRadioStation(-1);

        int expected = 0;
        int actual = num.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
// Выбрана несуществующая станция 15
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

    public void nextRadioStation_1() {
        Radio num = new Radio();

        num.setCurrentRadioStation(0);
        num.next();

        int expected = 1;
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

    public void prevRadioStationMax() {
        Radio num = new Radio();

        num.setCurrentRadioStation(10);
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
// Выбор уровня звука
    public void soundVolumeLevel() {
        Radio snd = new Radio();

        snd.setSoundVolumeLeve(6);

        int expected = 6;
        int actual = snd.getSoundVolumeLevel();
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void soundVolumeLevelMax() {
        Radio snd = new Radio();

        snd.setSoundVolumeLeve(11);

        int expected = 0;
        int actual = snd.getSoundVolumeLevel();
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void soundVolumeLevelMin() {
        Radio snd = new Radio();

        snd.setSoundVolumeLeve(-1);

        int expected = 0;
        int actual = snd.getSoundVolumeLevel();
        Assertions.assertEquals(expected, actual);
    }


    @Test

    public void increaseSoundVolumeLevel() {
        Radio snd = new Radio();

        snd.setSoundVolumeLeve(10);
        snd.plusVolume();

        int expected = 10;
        int actual = snd.getSoundVolumeLevel();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseSoundVolume() {
        Radio snd = new Radio();

        snd.setSoundVolumeLeve(8);
        snd.plusVolume();

        int expected = 9;
        int actual = snd.getSoundVolumeLevel();
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void reduceSoundVolumeLevel() {
        Radio snd = new Radio();

        snd.setSoundVolumeLeve(0);
        snd.minusVolume();

        int expected = 0;
        int actual = snd.getSoundVolumeLevel();
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void reduceSoundVolume() {
        Radio snd = new Radio();

        snd.setSoundVolumeLeve(6);
        snd.minusVolume();

        int expected = 5;
        int actual = snd.getSoundVolumeLevel();
        Assertions.assertEquals(expected, actual);
    }

}
