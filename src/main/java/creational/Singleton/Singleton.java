package creational.Singleton;

public class Singleton {
    private static Singleton instance = null;

    private Singleton() {
    }
    //Метод должен быть synchronized для того чтобы обеспечить многопоточный досут
    //Конструктор должен быть static, так как метод класса, а не экземпляра
    public static synchronized Singleton getInstance() {
        if (instance == null)
            instance = new Singleton();
        return instance;
    }
}