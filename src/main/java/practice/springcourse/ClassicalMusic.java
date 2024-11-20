package practice.springcourse;

// так как реализуем интерфейс Music, мы обязаны реализовать метод getSong()
public class ClassicalMusic implements Music {
    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
