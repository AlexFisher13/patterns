package creational.Singleton;

public class Main {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        //В результате вывода мы видим по хэш-коду что это один и тот же объект
        System.out.println(singleton1);
        System.out.println(singleton2);
    }
}
