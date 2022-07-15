import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    Radio num = new Radio();
    Radio num2 = new Radio(10);
    Radio snd = new Radio();

    @Test
// Включает номер выбранной станции
    public void radioStationNumberRange() {
        num.setCurrentRadioStation(5);
        Assertions.assertEquals(5, num.getCurrentRadioStation());
    }

    @Test
// Выбрана несуществующая станция -1
    public void radioStationNumberMin() {
        num.setCurrentRadioStation(-1);
        Assertions.assertEquals(0, num.getCurrentRadioStation());
    }

    @Test
// Выбрана несуществующая станция 15
    public void radioStationNumberMax() {
        num.setCurrentRadioStation(15);
        Assertions.assertEquals(0, num.getCurrentRadioStation());
    }

    @Test

    public void nextRadioStationMax() {
        num2.setCurrentRadioStation(9);
        num2.next();
        Assertions.assertEquals(0, num2.getCurrentRadioStation());
    }

    @Test
// Выбираем следующую радиостанцию
    public void nextRadioStation_1() {
        num.setCurrentRadioStation(5);
        num.next();
        Assertions.assertEquals(6, num.getCurrentRadioStation());
    }

    @Test

    public void prevRadioStationMin() {
        num2.setCurrentRadioStation(0);
        num2.prev();
        Assertions.assertEquals(9, num2.getCurrentRadioStation());
    }

    @Test

    public void prevRadioStationMax() {
        num.setCurrentRadioStation(10);
        num.prev();
        Assertions.assertEquals(9, num.getCurrentRadioStation());
    }

    @Test

    public void prevRadioStation() {
        num.setCurrentRadioStation(9);
        num.prev();
        Assertions.assertEquals(8, num.getCurrentRadioStation());
    }

    // Тестирование звука

    @Test
//Включает выбранный уровень звука
    public void SoundVolumeLevel() {
        snd.setSoundVolumeLeve(23);
        Assertions.assertEquals(23, snd.getSoundVolumeLevel());
    }

    @Test
//Максимальный уровень звука
    public void increaseSoundVolumeLevelMax() {
        snd.setSoundVolumeLeve(100);
        snd.plusVolume();
        Assertions.assertEquals(100, snd.getSoundVolumeLevel());
    }

    @Test
// Выбор уровня звука "+"
    public void increaseSoundVolumeLevel() {
        snd.setSoundVolumeLeve(59);
        snd.plusVolume();
        Assertions.assertEquals(60, snd.getSoundVolumeLevel());
    }

    @Test
// Выбор несуществующего уровня звука "+"
    public void increaseSoundVolumeLevelNo() {
        snd.setSoundVolumeLeve(105);
        snd.plusVolume();
        Assertions.assertEquals(1, snd.getSoundVolumeLevel());
    }

    @Test
// Минимальный уровень звука
    public void reduceSoundVolumeMin() {
        snd.setSoundVolumeLeve(0);
        snd.minusVolume();
        Assertions.assertEquals(0, snd.getSoundVolumeLevel());
    }

    @Test
// Выбор уровня звука на "-"
    public void reduceSoundVolume() {
        snd.setSoundVolumeLeve(55);
        snd.minusVolume();
        Assertions.assertEquals(54, snd.getSoundVolumeLevel());
    }

    @Test
// Выбор несуществующего уровня звука на "-"
    public void reduceSoundVolumeNo() {
        snd.setSoundVolumeLeve(-1);
        snd.minusVolume();
        Assertions.assertEquals(0, snd.getSoundVolumeLevel());
    }

}
