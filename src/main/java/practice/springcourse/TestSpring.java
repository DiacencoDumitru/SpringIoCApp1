package practice.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;


/*
 1. Сделаем внедрение зависимостей вручную, в дальнейшем мы будем делать это с помощью Spring Framework
 2. Здесь мы получили зависимость из Spring Context'a и внедрили его в конструктор нашего MusicPlayer где передали music
 3. после того как мы поработали с ApplicationContext мы обязательно должны его закрыть
 */
public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        Music music = context.getBean("musicBean", Music.class);

        MusicPlayer musicPlayer = new MusicPlayer(music);

        musicPlayer.playMusic();

        context.close();
    }
}
