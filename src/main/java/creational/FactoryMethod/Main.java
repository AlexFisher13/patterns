package creational.FactoryMethod;

public class Main {
    public static void main(String[] args) {
        //Получаем нужную нам фабрику по имени
        DeveloperFactory factory = creaateFactoryDySpecialty("python");
        //Полученая фабрика пердоставляет нам новый экземпляр
        Developer dev = factory.createDeveloper();
        dev.writeCode();
    }

    // Метод для получения фабрики по имени, который добавляет хорошую гибкость в нашу фабрику
    static DeveloperFactory creaateFactoryDySpecialty(String specialty) {
        if (specialty.equalsIgnoreCase("java"))
            return new JavaDeveloperFactory();
        else if (specialty.equalsIgnoreCase("python"))
            return new PythonDeveloperDactory();
        else throw new RuntimeException(specialty + " is unknown specialty.");
    }
}
