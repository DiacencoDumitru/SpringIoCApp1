package practice.springcourse;

/*
Реализуем класс MusicPlayer, который будет зависеть от нашей музыки.
В этом классе мы применим IoC.

1. Общий интерфейс Music, и соответственно мы сможем в нашем MusicPlayer играть музыку любого жанра потому-что у нас интерфейс Music
2. IoC, в конструктор будем передавать наш жанр музыки, здесь мы используем полиморфизм
3. В конструкторе мы присваиваем нашему полю music то что у нас было внедряно в наш MusicPlayer
*/
public class MusicPlayer {

    private Music music;

    // IoC
    public MusicPlayer(Music music) {
        this.music = music;
    }

    public void playMusic() {
        System.out.println("Playing: " + music.getSong());
    }
}
